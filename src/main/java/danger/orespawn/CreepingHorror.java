package danger.orespawn;

import net.minecraft.entity.monster.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import net.minecraft.item.*;
import net.minecraft.init.*;
import net.minecraft.entity.*;
import java.util.*;

public class CreepingHorror extends EntityMob
{
    private GenericTargetSorter TargetSorter;
    private float moveSpeed;
    
    public CreepingHorror(final World par1World) {
        super(par1World);
        this.TargetSorter = null;
        this.moveSpeed = 0.25f;
        this.setSize(0.75f, 0.5f);
        this.getNavigator().setAvoidsWater(true);
        this.experienceValue = 5;
        this.fireResistance = 10;
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(1, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.350000023841858));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0, false));
        this.tasks.addTask(3, (EntityAIBase)new MyEntityAIWanderALot((EntityCreature)this, 10, 1.0));
        this.tasks.addTask(4, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityPlayer.class, 8.0f));
        this.tasks.addTask(5, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
        this.TargetSorter = new GenericTargetSorter((Entity)this);
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue((double)this.moveSpeed);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue((double)OreSpawnMain.CreepingHorror_stats.attack);
    }
    
    protected void entityInit() {
        super.entityInit();
    }
    
    public int mygetMaxHealth() {
        return OreSpawnMain.CreepingHorror_stats.health;
    }
    
    public int getTotalArmorValue() {
        return OreSpawnMain.CreepingHorror_stats.defense;
    }
    
    protected boolean isAIEnabled() {
        return true;
    }
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue((double)this.moveSpeed);
        super.onUpdate();
        if (this.isNoDespawnRequired()) {
            return;
        }
        long t = this.worldObj.getWorldTime();
        t %= 24000L;
        if (t > 11000L) {
            return;
        }
        if (this.worldObj.rand.nextInt(500) == 1) {
            this.setDead();
        }
    }
    
    protected String getLivingSound() {
        return "orespawn:creepinghorror_living";
    }
    
    protected String getHurtSound() {
        return "orespawn:creepinghorror_hit";
    }
    
    protected String getDeathSound() {
        return "orespawn:creepinghorror_dead";
    }
    
    protected float getSoundVolume() {
        return 0.65f;
    }
    
    protected float getSoundPitch() {
        return 1.0f;
    }
    
    protected Item getDropItem() {
        final int i = this.worldObj.rand.nextInt(3);
        if (i == 0) {
            return Items.rotten_flesh;
        }
        if (i == 1) {
            return Items.bone;
        }
        return Items.string;
    }
    
    protected void updateAITasks() {
        if (this.isDead) {
            return;
        }
        super.updateAITasks();
        if (this.worldObj.rand.nextInt(200) == 1) {
            this.setRevengeTarget((EntityLivingBase)null);
        }
        if (this.worldObj.rand.nextInt(5) == 1) {
            final EntityLivingBase e = this.findSomethingToAttack();
            if (e != null) {
                this.getNavigator().tryMoveToEntityLiving((Entity)e, 1.25);
                if (this.getDistanceSqToEntity((Entity)e) < 5.0 && (this.rand.nextInt(12) == 0 || this.rand.nextInt(14) == 1)) {
                    this.attackEntityAsMob((Entity)e);
                }
            }
        }
    }
    
    private boolean isSuitableTarget(final EntityLivingBase par1EntityLiving, final boolean par2) {
        if (par1EntityLiving == null) {
            return false;
        }
        if (par1EntityLiving == this) {
            return false;
        }
        if (!par1EntityLiving.isEntityAlive()) {
            return false;
        }
        if (!this.getEntitySenses().canSee((Entity)par1EntityLiving)) {
            return false;
        }
        if (par1EntityLiving instanceof CreepingHorror) {
            return false;
        }
        if (par1EntityLiving instanceof RockBase) {
            return false;
        }
        if (par1EntityLiving instanceof EnderReaper) {
            return false;
        }
        if (par1EntityLiving instanceof LeafMonster) {
            return false;
        }
        if (par1EntityLiving instanceof Dragon) {
            return false;
        }
        if (par1EntityLiving instanceof TerribleTerror) {
            return false;
        }
        if (par1EntityLiving instanceof LurkingTerror) {
            return false;
        }
        if (par1EntityLiving instanceof PitchBlack) {
            return false;
        }
        if (par1EntityLiving instanceof Firefly) {
            return false;
        }
        if (par1EntityLiving instanceof Island) {
            return false;
        }
        if (par1EntityLiving instanceof IslandToo) {
            return false;
        }
        if (par1EntityLiving instanceof EntityPlayer) {
            final EntityPlayer p = (EntityPlayer)par1EntityLiving;
            if (p.capabilities.isCreativeMode) {
                return false;
            }
        }
        return true;
    }
    
    private EntityLivingBase findSomethingToAttack() {
        if (OreSpawnMain.PlayNicely != 0) {
            return null;
        }
        final List var5 = this.worldObj.getEntitiesWithinAABB((Class)EntityLivingBase.class, this.boundingBox.expand(16.0, 4.0, 16.0));
        Collections.sort((List<Object>)var5, this.TargetSorter);
        final Iterator var6 = var5.iterator();
        Entity var7 = null;
        EntityLivingBase var8 = null;
        while (var6.hasNext()) {
            var7 = (Entity)var6.next();
            var8 = (EntityLivingBase)var7;
            if (this.isSuitableTarget(var8, false)) {
                return var8;
            }
        }
        return null;
    }
    
    public boolean getCanSpawnHere() {
        return this.isValidLightLevel() && !this.worldObj.isDaytime() && (this.worldObj.provider.dimensionId == OreSpawnMain.DimensionID6 || this.posY <= 15.0);
    }
    
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired() && this.worldObj.isDaytime();
    }
}
