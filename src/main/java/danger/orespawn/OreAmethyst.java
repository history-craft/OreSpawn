package danger.orespawn;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.item.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class OreAmethyst extends Block
{
    public OreAmethyst(final int i) {
        super(Material.rock);
        this.setHardness(10.0f);
        this.setResistance(4.0f);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    public void dropBlockAsItemWithChance(final World par1World, final int par2, final int par3, final int par4, final int par5, final float par6, final int par7) {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);
        final int j1 = 5 + par1World.rand.nextInt(5) + par1World.rand.nextInt(5);
        this.dropXpOnBlockBreak(par1World, par2, par3, par4, j1);
    }
    
    public Item getItemDropped(final int par1, final Random par2Random, final int par3) {
        return OreSpawnMain.MyAmethyst;
    }
    
    public int quantityDroppedWithBonus(final int par1, final Random par2Random) {
        return 1 + par2Random.nextInt(2);
    }
    
    public int quantityDropped(final Random par1Random) {
        return 1;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
