package danger.orespawn;

import net.minecraft.world.*;
import net.minecraft.dispenser.*;
import net.minecraft.entity.*;

final class MyDispenserBehaviorArrow extends BehaviorProjectileDispense
{
    protected IProjectile getProjectileEntity(final World par1World, final IPosition par2IPosition) {
        final IrukandjiArrow entityarrow = new IrukandjiArrow(par1World, par2IPosition.getX(), par2IPosition.getY(), par2IPosition.getZ());
        entityarrow.canBePickedUp = 1;
        return (IProjectile)entityarrow;
    }
}
