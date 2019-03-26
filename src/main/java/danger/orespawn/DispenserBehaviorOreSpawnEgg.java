package danger.orespawn;

import net.minecraft.dispenser.*;
import net.minecraft.block.*;
import net.minecraft.util.*;
import net.minecraft.item.*;
import net.minecraft.entity.*;

final class DispenserBehaviorOreSpawnEgg extends BehaviorDefaultDispenseItem
{
    public ItemStack dispenseStack(final IBlockSource par1IBlockSource, final ItemStack par2ItemStack) {
        final EnumFacing enumfacing = BlockDispenser.func_149937_b(par1IBlockSource.getBlockMetadata());
        final double d0 = par1IBlockSource.getX() + enumfacing.getFrontOffsetX() * 2.0;
        final double d2 = par1IBlockSource.getYInt() + 0.2f;
        final double d3 = par1IBlockSource.getZ() + enumfacing.getFrontOffsetZ() * 2.0;
        final Item it = par2ItemStack.getItem();
        if (it instanceof ItemSpawnEgg) {
            final ItemSpawnEgg ise = (ItemSpawnEgg)it;
            final Entity entity = ItemSpawnEgg.spawn_something(ise.my_id, par1IBlockSource.getWorld(), (int)d0, (int)d2, (int)d3);
            if (entity instanceof EntityLivingBase && par2ItemStack.hasDisplayName()) {
                ((EntityLiving)entity).setCustomNameTag(par2ItemStack.getDisplayName());
            }
        }
        par2ItemStack.splitStack(1);
        return par2ItemStack;
    }
}
