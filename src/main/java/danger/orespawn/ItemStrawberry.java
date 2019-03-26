package danger.orespawn;

import net.minecraft.item.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class ItemStrawberry extends ItemFood
{
    public ItemStrawberry(final int par1, final int par2, final float par3, final boolean par4) {
        super(par2, par3, par4);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
