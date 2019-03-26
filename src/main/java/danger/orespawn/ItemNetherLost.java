package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class ItemNetherLost extends Item
{
    public ItemNetherLost(final int par1) {
        this.maxStackSize = 1;
        this.setMaxDamage(3000);
        this.setCreativeTab(CreativeTabs.tabDecorations);
    }
    
    public void onCreated(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        par1ItemStack.addEnchantment(Enchantment.sharpness, 2);
    }
    
    public void onUsingTick(final ItemStack stack, final EntityPlayer player, final int count) {
        final int lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, stack);
        if (lvl <= 0) {
            stack.addEnchantment(Enchantment.sharpness, 2);
        }
    }
    
    public void onUpdate(final ItemStack stack, final World par2World, final Entity par3Entity, final int par4, final boolean par5) {
        EntityLivingBase e = null;
        EntityPlayer p = null;
        this.onUsingTick(stack, null, 0);
        if (par2World == null) {
            return;
        }
        if (par3Entity != null && par3Entity instanceof EntityLivingBase) {
            e = (EntityLivingBase)par3Entity;
            if (e instanceof EntityPlayer) {
                p = (EntityPlayer)e;
                final ItemStack is = p.getCurrentEquippedItem();
                if (is != null) {
                    final Item it = is.getItem();
                    if (it != null && it instanceof ItemNetherLost && par2World.provider.dimensionId == -1) {
                        final Block i = par2World.getBlock((int)p.posX, (int)p.posY - 1, (int)p.posZ);
                        if (i == Blocks.netherrack) {
                            par2World.setBlock((int)p.posX, (int)p.posY - 1, (int)p.posZ, Blocks.quartz_block);
                        }
                    }
                }
            }
        }
    }
    
    public int getMaxItemUseDuration(final ItemStack par1ItemStack) {
        return 3000;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
