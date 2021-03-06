package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class BigHammer extends ItemSword
{
    private int weaponDamage;
    private final Item.ToolMaterial toolMaterial;
    
    public BigHammer(final int par1, final Item.ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.weaponDamage = 15;
        this.maxStackSize = 1;
        this.setMaxDamage(9000);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    public String getMaterialName() {
        return "AMETHYST";
    }
    
    public boolean hitEntity(final ItemStack par1ItemStack, final EntityLivingBase par2EntityLiving, final EntityLivingBase par3EntityLiving) {
        final int var2 = 5;
        if (par2EntityLiving != null && !par2EntityLiving.worldObj.isRemote) {
            par2EntityLiving.addVelocity(0.0, (double)Math.abs(par2EntityLiving.worldObj.rand.nextFloat() * 2.0f / 3.0f), 0.0);
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
