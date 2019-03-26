package danger.orespawn;

import net.minecraft.world.*;
import net.minecraft.dispenser.*;
import net.minecraft.entity.*;

final class MyDispenserBehaviorDeadIrukandji extends BehaviorProjectileDispense
{
    protected IProjectile getProjectileEntity(final World par1World, final IPosition par2IPosition) {
        final DeadIrukandji entityarrow = new DeadIrukandji(par1World, par2IPosition.getX(), par2IPosition.getY(), par2IPosition.getZ());
        return (IProjectile)entityarrow;
    }
}
