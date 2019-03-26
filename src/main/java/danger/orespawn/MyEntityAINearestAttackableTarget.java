package danger.orespawn;

import net.minecraft.command.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.*;
import java.util.*;

public class MyEntityAINearestAttackableTarget extends MyEntityAITarget
{
    EntityLiving targetEntity;
    Class targetClass;
    int targetChance;
    private final IEntitySelector targetEntitySelector;
    private MyEntityAINearestAttackableTargetSorter theNearestAttackableTargetSorter;
    
    public MyEntityAINearestAttackableTarget(final EntityLiving par1EntityLiving, final Class par2Class, final float par3, final int par4, final boolean par5) {
        this(par1EntityLiving, par2Class, par3, par4, par5, false);
    }
    
    public MyEntityAINearestAttackableTarget(final EntityLiving par1EntityLiving, final Class par2Class, final float par3, final int par4, final boolean par5, final boolean par6) {
        this(par1EntityLiving, par2Class, par3, par4, par5, par6, null);
    }
    
    public MyEntityAINearestAttackableTarget(final EntityLiving par1, final Class par2, final float par3, final int par4, final boolean par5, final boolean par6, final IEntitySelector par7IEntitySelector) {
        super(par1, par3, par5, par6);
        this.targetClass = par2;
        this.targetDistance = par3;
        this.targetChance = par4;
        this.theNearestAttackableTargetSorter = new MyEntityAINearestAttackableTargetSorter(this, (Entity)par1);
        this.targetEntitySelector = par7IEntitySelector;
        this.setMutexBits(1);
    }
    
    public boolean shouldExecute() {
        if (this.taskOwner instanceof EntityTameable && !((EntityTameable)this.taskOwner).isTamed()) {
            return false;
        }
        if (this.taskOwner instanceof Girlfriend && !((Girlfriend)this.taskOwner).isTamed()) {
            return false;
        }
        if (this.taskOwner instanceof Girlfriend && ((Girlfriend)this.taskOwner).isSitting()) {
            return false;
        }
        if (this.targetChance > 0 && this.taskOwner.getRNG().nextInt(100) > this.targetChance) {
            return false;
        }
        final List var5 = this.taskOwner.worldObj.selectEntitiesWithinAABB(this.targetClass, this.taskOwner.boundingBox.expand((double)this.targetDistance, 4.0, (double)this.targetDistance), this.targetEntitySelector);
        Collections.sort((List<Object>)var5, this.theNearestAttackableTargetSorter);
        for (final Object var7 : var5) {
            final EntityLiving var8 = (EntityLiving)var7;
            if (this.isSuitableTarget((EntityLivingBase)var8, false)) {
                this.targetEntity = var8;
                return true;
            }
        }
        this.targetEntity = null;
        return false;
    }
    
    @Override
    public void startExecuting() {
        this.taskOwner.setAttackTarget((EntityLivingBase)this.targetEntity);
        super.startExecuting();
    }
}
