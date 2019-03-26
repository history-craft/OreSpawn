package danger.orespawn;

import net.minecraft.item.*;
import net.minecraft.creativetab.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class EmeraldAxe extends ItemAxe
{
    private int weaponDamage;
    
    public EmeraldAxe(final int par1, final Item.ToolMaterial par2) {
        super(par2);
        this.weaponDamage = 10;
        this.maxStackSize = 1;
        this.setMaxDamage(1300);
        this.setCreativeTab(CreativeTabs.tabTools);
    }
    
    public int getDamageVsEntity(final Entity par1Entity) {
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
