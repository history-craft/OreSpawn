package danger.orespawn;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.potion.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class BlockRuby extends Block
{
    public BlockRuby(final int par1) {
        super(Material.rock);
        this.setHardness(4.0f);
        this.setResistance(4.0f);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setLightLevel(0.4f);
    }
    
    public boolean isOpaqueCube() {
        return false;
    }
    
    public boolean renderAsNormalBlock() {
        return true;
    }
    
    public void onEntityCollidedWithBlock(final World par1World, final int par2, final int par3, final int par4, final Entity par5Entity) {
        if (this == OreSpawnMain.MyBlockMobzillaScaleBlock && par5Entity instanceof EntityLivingBase) {
            ((EntityLivingBase)par5Entity).addPotionEffect(new PotionEffect(Potion.damageBoost.id, 200, 0));
        }
    }
    
    public void onEntityWalking(final World par1World, final int par2, final int par3, final int par4, final Entity par5Entity) {
        if (this == OreSpawnMain.MyBlockMobzillaScaleBlock && par5Entity instanceof EntityLivingBase) {
            ((EntityLivingBase)par5Entity).addPotionEffect(new PotionEffect(Potion.damageBoost.id, 200, 0));
        }
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
