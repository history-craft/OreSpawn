package danger.orespawn;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class RockBlock extends Block
{
    public RockBlock(final int par1) {
        super(Material.rock);
        this.setHardness(2.0f);
        this.setResistance(1.0f);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
