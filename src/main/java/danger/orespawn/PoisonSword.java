package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.potion.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class PoisonSword extends ItemSword
{
    private int weaponDamage;
    private final Item.ToolMaterial toolMaterial;
    
    public PoisonSword(final int par1, final Item.ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.weaponDamage = 15;
        this.maxStackSize = 1;
        this.setMaxDamage(1300);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    public void onCreated(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        par1ItemStack.addEnchantment(Enchantment.sharpness, 1);
    }
    
    public void onUsingTick(final ItemStack stack, final EntityPlayer player, final int count) {
        final int lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, stack);
        if (lvl <= 0) {
            stack.addEnchantment(Enchantment.sharpness, 1);
        }
    }
    
    public String getMaterialName() {
        return "Emerald";
    }
    
    public boolean hitEntity(final ItemStack par1ItemStack, final EntityLivingBase par2EntityLiving, final EntityLivingBase par3EntityLiving) {
        int var2 = 5;
        if (par2EntityLiving != null) {
            var2 = 10 + par2EntityLiving.worldObj.rand.nextInt(10);
            par2EntityLiving.addPotionEffect(new PotionEffect(Potion.poison.id, var2 * 20, 0));
            var2 = 10 + par2EntityLiving.worldObj.rand.nextInt(10);
            par2EntityLiving.addPotionEffect(new PotionEffect(Potion.wither.id, var2 * 20, 0));
            var2 = 10 + par2EntityLiving.worldObj.rand.nextInt(10);
            par2EntityLiving.addPotionEffect(new PotionEffect(Potion.weakness.id, var2 * 20, 0));
        }
        par1ItemStack.damageItem(1, par3EntityLiving);
        return true;
    }
    
    public int getMaxItemUseDuration(final ItemStack par1ItemStack) {
        return 3000;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
