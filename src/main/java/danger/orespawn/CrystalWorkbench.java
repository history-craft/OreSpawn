package danger.orespawn;

import net.minecraft.block.*;
import net.minecraft.util.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.creativetab.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.client.renderer.texture.*;

public class CrystalWorkbench extends BlockWorkbench
{
    @SideOnly(Side.CLIENT)
    private IIcon workbenchIconTop;
    @SideOnly(Side.CLIENT)
    private IIcon workbenchIconFront;
    
    protected CrystalWorkbench(final int par1, final float f1, final float f2) {
        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.setHardness(f1);
        this.setResistance(f2);
    }
    
    public boolean onBlockActivated(final World par1World, final int par2, final int par3, final int par4, final EntityPlayer par5EntityPlayer, final int par6, final float par7, final float par8, final float par9) {
        if (par1World.isRemote) {
            return true;
        }
        par5EntityPlayer.openGui((Object)OreSpawnMain.instance, 1, par1World, par2, par3, par4);
        return true;
    }
    
    public boolean isOpaqueCube() {
        return false;
    }
    
    public boolean renderAsNormalBlock() {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(final int par1, final int par2) {
        return (par1 == 1) ? this.workbenchIconTop : ((par1 == 0) ? this.blockIcon : ((par1 != 2 && par1 != 4) ? this.blockIcon : this.workbenchIconFront));
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister par1IIconRegister) {
        this.blockIcon = par1IIconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5) + "_side");
        this.workbenchIconTop = par1IIconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5) + "_top");
        this.workbenchIconFront = par1IIconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5) + "_bottom");
    }
}
