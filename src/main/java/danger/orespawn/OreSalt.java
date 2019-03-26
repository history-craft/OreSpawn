package danger.orespawn;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class OreSalt extends Block
{
    public OreSalt(final int par1) {
        super(Material.rock);
        this.setHardness(5.0f);
        this.setResistance(2.0f);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    public void onEntityCollidedWithBlock(final World par1World, final int par2, final int par3, final int par4, final Entity par5Entity) {
        if (par5Entity instanceof EntityAnt) {
            par5Entity.attackEntityFrom(DamageSource.cactus, 5.0f);
        }
    }
    
    public void onEntityWalking(final World par1World, final int par2, final int par3, final int par4, final Entity par5Entity) {
        if (par5Entity instanceof EntityAnt) {
            par5Entity.attackEntityFrom(DamageSource.cactus, 5.0f);
        }
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
