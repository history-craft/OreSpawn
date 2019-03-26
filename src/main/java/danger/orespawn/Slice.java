package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class Slice extends ItemSword
{
    public Slice(final int par1, final Item.ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        this.maxStackSize = 1;
        this.setMaxDamage(2600);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    public void onCreated(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        par1ItemStack.addEnchantment(Enchantment.sharpness, 5);
        par1ItemStack.addEnchantment(Enchantment.baneOfArthropods, 1);
    }
    
    public void onUsingTick(final ItemStack stack, final EntityPlayer player, final int count) {
        final int lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, stack);
        if (lvl <= 0) {
            stack.addEnchantment(Enchantment.sharpness, 5);
            stack.addEnchantment(Enchantment.baneOfArthropods, 1);
        }
    }
    
    public void onUpdate(final ItemStack stack, final World par2World, final Entity par3Entity, final int par4, final boolean par5) {
        this.onUsingTick(stack, null, 0);
    }
    
    public boolean onLeftClickEntity(final ItemStack stack, final EntityPlayer player, final Entity entity) {
        return entity != null && (entity instanceof EntityPlayer || entity instanceof Girlfriend || entity instanceof Boyfriend);
    }
    
    public boolean onEntitySwing(final EntityLivingBase entityLiving, final ItemStack stack) {
        if (entityLiving != null && entityLiving instanceof EntityPlayer) {
            final EntityPlayer p = (EntityPlayer)entityLiving;
            final double xzoff = 2.0;
            final double yoff = 1.55;
            final BerthaHit lb = new BerthaHit(p.worldObj, (EntityLivingBase)p);
            lb.setLocationAndAngles(p.posX - xzoff * Math.sin(Math.toRadians(p.rotationYawHead)), p.posY + yoff, p.posZ + xzoff * Math.cos(Math.toRadians(p.rotationYawHead)), p.rotationYawHead, p.rotationPitch);
            final BerthaHit berthaHit = lb;
            berthaHit.motionX *= 2.0;
            final BerthaHit berthaHit2 = lb;
            berthaHit2.motionY *= 2.0;
            final BerthaHit berthaHit3 = lb;
            berthaHit3.motionZ *= 2.0;
            p.worldObj.spawnEntityInWorld((Entity)lb);
            stack.damageItem(1, (EntityLivingBase)p);
        }
        return false;
    }
    
    public String getMaterialName() {
        return "Uranium/Titanium";
    }
    
    public boolean hitEntity(final ItemStack par1ItemStack, final EntityLiving par2EntityLiving, final EntityLiving par3EntityLiving) {
        par1ItemStack.damageItem(1, (EntityLivingBase)par3EntityLiving);
        return true;
    }
    
    public int getMaxItemUseDuration(final ItemStack par1ItemStack) {
        return 9000;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
