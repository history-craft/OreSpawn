package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class ItemShoes extends Item
{
    private int my_id;
    
    public ItemShoes(final int i, final int j) {
        this.my_id = 0;
        this.my_id = j;
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabDecorations);
    }
    
    public ItemStack onItemRightClick(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        if (!par3EntityPlayer.capabilities.isCreativeMode) {
            --par1ItemStack.stackSize;
        }
        par2World.playSoundAtEntity((Entity)par3EntityPlayer, "random.bow", 0.5f, 0.4f / (ItemShoes.itemRand.nextFloat() * 0.4f + 0.8f));
        if (!par2World.isRemote) {
            par2World.spawnEntityInWorld((Entity)new Shoes(par2World, (EntityLivingBase)par3EntityPlayer, this.my_id));
        }
        return par1ItemStack;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
