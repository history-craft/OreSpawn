package danger.orespawn;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class BlockCrystal extends Block
{
    public BlockCrystal(final int par1) {
        super(Material.rock);
        this.setHardness(4.0f);
        this.setResistance(4.0f);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setLightLevel(0.4f);
    }
    
    public boolean isOpaqueCube() {
        return false;
    }
    
    public boolean renderAsNormalBlock() {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
