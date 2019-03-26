package danger.orespawn;

import java.util.*;
import net.minecraft.entity.*;

public class MyValentineTargetSorter implements Comparator
{
    private Entity theEntity;
    final MyValentineTarget parent;
    
    public MyValentineTargetSorter(final MyValentineTarget par1EntityAINearestAttackableTarget, final Entity par2Entity) {
        this.parent = par1EntityAINearestAttackableTarget;
        this.theEntity = par2Entity;
    }
    
    public int compareDistanceSq(final Entity par1Entity, final Entity par2Entity) {
        final double var3 = this.theEntity.getDistanceSqToEntity(par1Entity);
        final double var4 = this.theEntity.getDistanceSqToEntity(par2Entity);
        return (var3 < var4) ? -1 : ((var3 > var4) ? 1 : 0);
    }
    
    @Override
    public int compare(final Object par1Obj, final Object par2Obj) {
        return this.compareDistanceSq((Entity)par1Obj, (Entity)par2Obj);
    }
}
