package danger.orespawn;

import net.minecraft.entity.passive.*;
import net.minecraft.entity.*;

public class MyEntityAIJealousy extends MyEntityAINearestAttackableTarget
{
    private EntityTameable theTameable;
    
    public MyEntityAIJealousy(final EntityTameable par1EntityTameable, final Class par2Class, final float par3, final int par4, final boolean par5) {
        super((EntityLiving)par1EntityTameable, par2Class, par3, par4, par5);
        this.theTameable = par1EntityTameable;
    }
    
    @Override
    public boolean shouldExecute() {
        final EntityTameable te = (EntityTameable)this.taskOwner;
        Girlfriend gf = null;
        Boyfriend bf = null;
        EntityLivingBase ep = null;
        if (te == null) {
            return false;
        }
        if (!te.isTamed()) {
            return false;
        }
        if (te.isSitting()) {
            return false;
        }
        if (!super.shouldExecute()) {
            return false;
        }
        final Entity victim = (Entity)this.targetEntity;
        if (victim == null) {
            return false;
        }
        if (te instanceof Girlfriend) {
            if (victim instanceof Girlfriend) {
                gf = (Girlfriend)victim;
                if (gf.isTamed()) {
                    return false;
                }
            }
        }
        else if (victim instanceof Boyfriend) {
            bf = (Boyfriend)victim;
            if (bf.isTamed()) {
                return false;
            }
        }
        ep = te.getOwner();
        return ep != null;
    }
}
