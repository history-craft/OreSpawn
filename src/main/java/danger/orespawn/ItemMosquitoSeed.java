package danger.orespawn;

import net.minecraft.item.*;
import net.minecraft.block.*;
import net.minecraft.creativetab.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class ItemMosquitoSeed extends ItemSeeds
{
    public ItemMosquitoSeed(final int par1, final Block par2, final Block par3) {
        super(par2, par3);
        this.setCreativeTab(CreativeTabs.tabDecorations);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
