package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class ItemCreeperLauncher extends Item
{
    public ItemCreeperLauncher(final int i) {
        this.setCreativeTab(CreativeTabs.tabRedstone);
        this.setMaxDamage(1);
    }
    
    public boolean onLeftClickEntity(final ItemStack stack, final EntityPlayer player, final Entity entity) {
        if (entity != null && entity instanceof EntityCreeper) {
            for (int var3 = 0; var3 < 6; ++var3) {
                float f1 = player.worldObj.rand.nextFloat() - player.worldObj.rand.nextFloat();
                float f2 = 0.25f + player.worldObj.rand.nextFloat() * 6.0f;
                float f3 = player.worldObj.rand.nextFloat() - player.worldObj.rand.nextFloat();
                player.worldObj.spawnParticle("smoke", (double)((float)entity.posX + f1), (double)((float)entity.posY + f2), (double)((float)entity.posZ + f3), 0.0, (double)(f2 / 4.0f), 0.0);
                f1 = player.worldObj.rand.nextFloat() - player.worldObj.rand.nextFloat();
                f2 = 0.25f + player.worldObj.rand.nextFloat() * 6.0f;
                f3 = player.worldObj.rand.nextFloat() - player.worldObj.rand.nextFloat();
                player.worldObj.spawnParticle("explode", (double)((float)entity.posX + f1), (double)((float)entity.posY + f2), (double)((float)entity.posZ + f3), 0.0, (double)(f2 / 4.0f), 0.0);
                f1 = player.worldObj.rand.nextFloat() - player.worldObj.rand.nextFloat();
                f2 = 0.25f + player.worldObj.rand.nextFloat() * 6.0f;
                f3 = player.worldObj.rand.nextFloat() - player.worldObj.rand.nextFloat();
                player.worldObj.spawnParticle("reddust", (double)((float)entity.posX + f1), (double)((float)entity.posY + f2), (double)((float)entity.posZ + f3), 0.0, (double)(f2 / 4.0f), 0.0);
            }
            player.worldObj.playSoundAtEntity((Entity)player, "fireworks.launch", 2.0f, 1.2f);
            final EntityLiving e = (EntityLiving)entity;
            e.addVelocity(0.0, 4.5, 0.0);
            if (!player.capabilities.isCreativeMode) {
                --stack.stackSize;
            }
            return true;
        }
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
