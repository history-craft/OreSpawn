package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class ItemLaserBall extends Item
{
    public ItemLaserBall(final int i) {
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    public ItemStack onItemRightClick(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        if (!par3EntityPlayer.capabilities.isCreativeMode) {
            --par1ItemStack.stackSize;
        }
        par2World.playSoundAtEntity((Entity)par3EntityPlayer, "fireworks.launch", 3.0f, 1.0f);
        if (!par2World.isRemote) {
            par2World.spawnEntityInWorld((Entity)new LaserBall(par2World, (EntityLivingBase)par3EntityPlayer));
        }
        return par1ItemStack;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
