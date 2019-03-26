package danger.orespawn;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.init.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class RTPBlock extends Block
{
    public RTPBlock(final int i) {
        super(Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    public void onEntityWalking(final World world, final int par2, final int par3, final int par4, final Entity par5Entity) {
        if (par5Entity instanceof EntityPlayer) {
            final EntityPlayer p = (EntityPlayer)par5Entity;
            EntityPlayerMP mp = null;
            if (par5Entity instanceof EntityPlayerMP) {
                mp = (EntityPlayerMP)par5Entity;
            }
            int x = par2;
            int y = par3;
            int z = par4;
            int found = 0;
            for (int tries = 0; tries < 1000 && found == 0; ++tries) {
                if (world.rand.nextInt(2) == 0) {
                    x = par2 + 16 + world.rand.nextInt(8) - world.rand.nextInt(8);
                }
                else {
                    x = par2 - 16 + world.rand.nextInt(8) - world.rand.nextInt(8);
                }
                if (world.rand.nextInt(2) == 0) {
                    z = par4 + 16 + world.rand.nextInt(8) - world.rand.nextInt(8);
                }
                else {
                    z = par4 - 16 + world.rand.nextInt(8) - world.rand.nextInt(8);
                }
                for (y = par3 - 4; y <= par3 + 4; ++y) {
                    if (world.getBlock(x, y - 1, z).getMaterial().isSolid() && world.getBlock(x, y, z) == Blocks.air && world.getBlock(x, y + 1, z) == Blocks.air) {
                        found = 1;
                        break;
                    }
                }
            }
            if (found != 0) {
                if (mp != null) {
                    mp.playerNetServerHandler.setPlayerLocation((double)(x + 0.5f), (double)(float)y, (double)(z + 0.5f), p.rotationYaw, 0.0f);
                }
                else {
                    p.setLocationAndAngles((double)(x + 0.5f), (double)(float)y, (double)(z + 0.5f), p.rotationYaw, 0.0f);
                }
                for (int var3 = 0; var3 < 6; ++var3) {
                    world.spawnParticle("smoke", (double)(x + 0.5f), (double)(y + 2.25f), (double)(z + 0.5f), 0.0, 0.0, 0.0);
                    world.spawnParticle("explode", (double)(x + 0.5f), (double)(y + 2.25f), (double)(z + 0.5f), 0.0, 0.0, 0.0);
                    world.spawnParticle("reddust", (double)(x + 0.5f), (double)(y + 2.25f), (double)(z + 0.5f), 0.0, 0.0, 0.0);
                }
                p.worldObj.playSoundAtEntity((Entity)p, "random.explode", 1.0f, 1.5f);
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
