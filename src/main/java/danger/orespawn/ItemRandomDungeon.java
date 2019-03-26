package danger.orespawn;

import java.util.*;
import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class ItemRandomDungeon extends Item
{
    Random rand;
    
    public ItemRandomDungeon(final int i) {
        this.rand = OreSpawnMain.OreSpawnRand;
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabs.tabRedstone);
    }
    
    public void onCreated(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        par1ItemStack.addEnchantment(Enchantment.fortune, 2);
    }
    
    public void onUsingTick(final ItemStack stack, final EntityPlayer player, final int count) {
        final int lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, stack);
        if (lvl <= 0) {
            stack.addEnchantment(Enchantment.fortune, 2);
        }
    }
    
    public void onUpdate(final ItemStack stack, final World par2World, final Entity par3Entity, final int par4, final boolean par5) {
        this.onUsingTick(stack, null, 0);
    }
    
    public boolean onItemUse(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final World world, final int clickedX, final int clickedY, final int clickedZ, final int par7, final float par8, final float par9, final float par10) {
        final Block var1 = world.getBlock(clickedX, clickedY, clickedZ);
        if (var1 != Blocks.stone && var1 != Blocks.cobblestone && var1 != Blocks.grass && var1 != Blocks.dirt) {
            return false;
        }
        if (clickedY < 40) {
            return false;
        }
        if (!world.isRemote) {
            world.setBlock(clickedX, clickedY + 1, clickedZ, OreSpawnMain.MyDungeonSpawnerBlock, 0, 2);
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
