package danger.orespawn;

import net.minecraft.item.*;
import net.minecraft.creativetab.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class CrystalPickaxe extends ItemPickaxe
{
    public CrystalPickaxe(final int par1, final Item.ToolMaterial par2) {
        super(par2);
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabs.tabTools);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
