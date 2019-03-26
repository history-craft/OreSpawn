package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class EmeraldSword extends ItemSword
{
    private int weaponDamage;
    private final Item.ToolMaterial toolMaterial;
    
    public EmeraldSword(final int par1, final Item.ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.weaponDamage = 15;
        this.maxStackSize = 1;
        this.setMaxDamage(1300);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    public void onCreated(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
    }
    
    public void onUsingTick(final ItemStack stack, final EntityPlayer player, final int count) {
    }
    
    public void onUpdate(final ItemStack stack, final World par2World, final Entity par3Entity, final int par4, final boolean par5) {
    }
    
    public int getDamageVsEntity(final Entity par1Entity) {
        return this.weaponDamage;
    }
    
    public String getMaterialName() {
        return "Emerald";
    }
    
    public boolean hitEntity(final ItemStack par1ItemStack, final EntityLiving par2EntityLiving, final EntityLiving par3EntityLiving) {
        par1ItemStack.damageItem(1, (EntityLivingBase)par3EntityLiving);
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
