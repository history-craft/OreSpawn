package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class AmethystSword extends ItemSword
{
    private int weaponDamage;
    private final Item.ToolMaterial toolMaterial;
    
    public AmethystSword(final int par1, final Item.ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.weaponDamage = 18;
        this.maxStackSize = 1;
        this.setMaxDamage(2000);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    public int getDamageVsEntity(final Entity par1Entity) {
        return this.weaponDamage;
    }
    
    public String getMaterialName() {
        return "Amethyst";
    }
    
    public boolean hitEntity(final ItemStack par1ItemStack, final EntityLiving par2EntityLiving, final EntityLiving par3EntityLiving) {
        par1ItemStack.damageItem(1, (EntityLivingBase)par3EntityLiving);
        return true;
    }
    
    public int getMaxItemUseDuration(final ItemStack par1ItemStack) {
        return 3500;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}