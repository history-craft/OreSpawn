package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class ItemExperienceTreeSeed extends Item
{
    public ItemExperienceTreeSeed(final int i) {
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabs.tabDecorations);
    }
    
    public boolean onItemUse(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final World world, final int x, final int y, final int z, final int par7, final float par8, final float par9, final float par10) {
        if (!world.isRemote) {
            final Block bid = world.getBlock(x, y, z);
            if (bid != Blocks.grass && bid != Blocks.dirt && bid != Blocks.farmland) {
                return false;
            }
            world.setBlock(x, y + 1, z, OreSpawnMain.MyExperiencePlant, 0, 2);
        }
        else {
            for (int j1 = 0; j1 < 10; ++j1) {
                world.spawnParticle("happyVillager", (double)(x + world.rand.nextFloat()), y + 1.0 + world.rand.nextFloat(), (double)(z + world.rand.nextFloat()), 0.0, 0.0, 0.0);
            }
        }
        if (!par2EntityPlayer.capabilities.isCreativeMode) {
            --par1ItemStack.stackSize;
        }
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
