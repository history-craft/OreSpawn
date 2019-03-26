package danger.orespawn;

import net.minecraft.item.*;
import net.minecraft.creativetab.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class IngotTitanium extends Item
{
    public IngotTitanium(final int i) {
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
