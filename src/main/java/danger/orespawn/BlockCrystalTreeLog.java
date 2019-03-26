package danger.orespawn;

import net.minecraft.util.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.block.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.client.renderer.texture.*;

public class BlockCrystalTreeLog extends BlockRotatedPillar
{
    @SideOnly(Side.CLIENT)
    private IIcon field_111052_c;
    @SideOnly(Side.CLIENT)
    private IIcon tree_top;
    
    protected BlockCrystalTreeLog(final int par1, final int par2) {
        super(Material.wood);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    protected ItemStack createStackedBlock(final int par1) {
        return new ItemStack(Item.getItemFromBlock((Block)this), 1, 0);
    }
    
    public boolean canSustainLeaves(final IBlockAccess world, final int x, final int y, final int z) {
        return true;
    }
    
    public boolean isWood(final IBlockAccess world, final int x, final int y, final int z) {
        return true;
    }
    
    public boolean isOpaqueCube() {
        return false;
    }
    
    public boolean renderAsNormalBlock() {
        return false;
    }
    
    public Item getItemDropped(final int p_149650_1_, final Random p_149650_2_, final int p_149650_3_) {
        return Item.getItemFromBlock(OreSpawnMain.MyCrystalTreeLog);
    }
    
    @SideOnly(Side.CLIENT)
    protected IIcon getSideIcon(final int par1) {
        return this.field_111052_c;
    }
    
    @SideOnly(Side.CLIENT)
    protected IIcon getTopIcon(final int par1) {
        return this.tree_top;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister iconRegister) {
        this.field_111052_c = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
        this.tree_top = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5) + "_top");
    }
}
