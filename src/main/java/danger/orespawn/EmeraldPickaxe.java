package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.enchantment.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class EmeraldPickaxe extends ItemPickaxe
{
    private int weaponDamage;
    
    public EmeraldPickaxe(final int par1, final Item.ToolMaterial par2) {
        super(par2);
        this.weaponDamage = 10;
        this.maxStackSize = 1;
        this.setMaxDamage(1300);
        this.setCreativeTab(CreativeTabs.tabTools);
    }
    
    public void onUsingTick(final ItemStack stack, final EntityPlayer player, final int count) {
        final int lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.silkTouch.effectId, stack);
        if (lvl <= 0) {
            stack.addEnchantment(Enchantment.silkTouch, 1);
        }
    }
    
    public void onUpdate(final ItemStack stack, final World par2World, final Entity par3Entity, final int par4, final boolean par5) {
        this.onUsingTick(stack, null, 0);
    }
    
    public int getDamageVsEntity(final Entity par1Entity) {
        return this.weaponDamage;
    }
    
    public int getDamageVsEntity() {
        return this.weaponDamage;
    }
    
    public String getMaterialName() {
        return "Emerald";
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
