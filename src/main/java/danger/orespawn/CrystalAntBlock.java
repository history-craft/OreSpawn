package danger.orespawn;

import net.minecraft.block.*;
import net.minecraft.util.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.texture.*;

public class CrystalAntBlock extends Block
{
    @SideOnly(Side.CLIENT)
    private IIcon[] field_94364_a;
    
    protected CrystalAntBlock(final int par1) {
        super(Material.grass);
        this.setTickRandomly(true);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(final int par1, final int par2) {
        if (this.field_94364_a == null) {
            return null;
        }
        return (par1 == 1) ? this.field_94364_a[0] : ((par1 == 0) ? this.field_94364_a[1] : this.field_94364_a[2]);
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getBlockTexture(final IBlockAccess par1IBlockAccess, final int par2, final int par3, final int par4, final int par5) {
        if (this.field_94364_a == null) {
            return null;
        }
        if (par5 == 1) {
            return this.field_94364_a[0];
        }
        if (par5 == 0) {
            return this.field_94364_a[1];
        }
        return this.field_94364_a[2];
    }
    
    public void updateTick(final World par1World, final int par2, final int par3, final int par4, final Random par5Random) {
        int howmany = 0;
        if (!par1World.isRemote) {
            if (par1World.isRaining()) {
                return;
            }
            final Block bid = par1World.getBlock(par2, par3 + 1, par4);
            if (bid == Blocks.air) {
                howmany = OreSpawnMain.OreSpawnRand.nextInt(6) + 2;
                for (int i = 0; i < howmany; ++i) {
                    if (this == OreSpawnMain.MyAntBlock) {
                        if (OreSpawnMain.BlackAntEnable != 0) {
                            spawnCreature(par1World, "Ant", par2 + 0.5, par3 + 1.01, par4 + 0.5);
                        }
                    }
                    else if (this == OreSpawnMain.MyRedAntBlock) {
                        if (OreSpawnMain.RedAntEnable != 0) {
                            spawnCreature(par1World, "Red Ant", par2 + 0.5, par3 + 1.01, par4 + 0.5);
                        }
                    }
                    else if (this == OreSpawnMain.MyUnstableAntBlock) {
                        if (OreSpawnMain.UnstableAntEnable != 0) {
                            spawnCreature(par1World, "Unstable Ant", par2 + 0.5, par3 + 1.01, par4 + 0.5);
                        }
                    }
                    else if (this == OreSpawnMain.TermiteBlock) {
                        if (OreSpawnMain.TermiteEnable != 0) {
                            spawnCreature(par1World, "Termite", par2 + 0.5, par3 + 1.01, par4 + 0.5);
                        }
                    }
                    else if (this == OreSpawnMain.CrystalTermiteBlock) {
                        if (OreSpawnMain.TermiteEnable != 0) {
                            spawnCreature(par1World, "Termite", par2 + 0.5, par3 + 1.01, par4 + 0.5);
                        }
                    }
                    else if (OreSpawnMain.RainbowAntEnable != 0) {
                        spawnCreature(par1World, "Rainbow Ant", par2 + 0.5, par3 + 1.01, par4 + 0.5);
                    }
                }
            }
        }
    }
    
    public Item getItemDropped(final int par1, final Random par2Random, final int par3) {
        return Item.getItemFromBlock((Block)this);
    }
    
    public static Entity spawnCreature(final World par0World, final String par1, final double par2, final double par4, final double par6) {
        Entity var8 = null;
        var8 = EntityList.createEntityByName(par1, par0World);
        if (var8 != null) {
            var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0f, 0.0f);
            par0World.spawnEntityInWorld(var8);
            ((EntityLiving)var8).playLivingSound();
        }
        return var8;
    }
    
    public boolean isOpaqueCube() {
        return false;
    }
    
    public boolean renderAsNormalBlock() {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister par1IIconRegister) {
        (this.field_94364_a = new IIcon[3])[0] = par1IIconRegister.registerIcon("OreSpawn:crystaltermite_top");
        this.field_94364_a[1] = par1IIconRegister.registerIcon("OreSpawn:crystaltermite_bottom");
        this.field_94364_a[2] = par1IIconRegister.registerIcon("OreSpawn:crystaltermite_side");
    }
}
