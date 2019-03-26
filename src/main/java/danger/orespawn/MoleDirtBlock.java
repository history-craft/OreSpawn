package danger.orespawn;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.init.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class MoleDirtBlock extends Block
{
    public MoleDirtBlock(final int i) {
        super(Material.ground);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setTickRandomly(true);
    }
    
    public void updateTick(final World par1World, final int par2, final int par3, final int par4, final Random par5Random) {
        if (par1World.isRemote) {
            return;
        }
        par1World.setBlock(par2, par3, par4, Blocks.air, 0, 2);
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(final World par1World, final int par2, final int par3, final int par4) {
        final float f = 0.125f;
        return AxisAlignedBB.getBoundingBox((double)par2, (double)par3, (double)par4, (double)(par2 + 1), (double)(par3 + 1 - f), (double)(par4 + 1));
    }
    
    public void onEntityCollidedWithBlock(final World par1World, final int par2, final int par3, final int par4, final Entity par5Entity) {
        if (par5Entity != null) {
            par5Entity.motionX *= 0.3;
            par5Entity.motionZ *= 0.3;
        }
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
