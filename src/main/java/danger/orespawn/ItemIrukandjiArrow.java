package danger.orespawn;

import net.minecraft.item.*;
import net.minecraft.creativetab.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class ItemIrukandjiArrow extends Item
{
    public ItemIrukandjiArrow(final int i) {
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
