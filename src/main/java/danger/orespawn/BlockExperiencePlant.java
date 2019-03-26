package danger.orespawn;

import net.minecraft.world.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import java.util.*;
import net.minecraft.item.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class BlockExperiencePlant extends BlockReed
{
    protected BlockExperiencePlant(final int par1) {
        final float var3 = 0.375f;
        this.setBlockBounds(0.5f - var3, 0.0f, 0.5f - var3, 0.5f + var3, 1.0f, 0.5f + var3);
        this.setTickRandomly(true);
    }
    
    public boolean canPlaceBlockAt(final World par1World, final int par2, final int par3, final int par4) {
        final Block bid = par1World.getBlock(par2, par3 - 1, par4);
        return bid != Blocks.air && (bid == Blocks.grass || bid == Blocks.dirt || bid == Blocks.farmland);
    }
    
    public void randomDisplayTick(final World par1World, final int par2, final int par3, final int par4, final Random par5Random) {
        if (par1World.rand.nextInt(20) != 1) {
            return;
        }
        for (int j1 = 0; j1 < 20; ++j1) {
            par1World.spawnParticle("happyVillager", (double)(par2 + par1World.rand.nextFloat()), par3 + (double)par1World.rand.nextFloat(), (double)(par4 + par1World.rand.nextFloat()), 0.0, 0.0, 0.0);
        }
    }
    
    public void updateTick(final World par1World, final int par2, final int par3, final int par4, final Random par5Random) {
        if (par1World.isRemote) {
            return;
        }
        if (par1World.rand.nextInt(10) != 1) {
            return;
        }
        par1World.setBlock(par2, par3, par4, Blocks.air, 0, 2);
        OreSpawnMain.OreSpawnTrees.ExperienceTree(par1World, par2, par3 - 1, par4);
    }
    
    public Item getItemDropped(final int p_149650_1_, final Random p_149650_2_, final int p_149650_3_) {
        return Item.getItemFromBlock(OreSpawnMain.MyExperiencePlant);
    }
    
    public int quantityDropped(final Random par1Random) {
        return 1;
    }
    
    public int idPicked(final World par1World, final int par2, final int par3, final int par4) {
        return 0;
    }
    
    protected Item getSeedItem() {
        return OreSpawnMain.MyExperienceTreeSeed;
    }
    
    protected int getCropItem() {
        return 0;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
