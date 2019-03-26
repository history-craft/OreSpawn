package danger.orespawn;

import net.minecraft.entity.monster.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import net.minecraft.item.*;
import net.minecraft.entity.*;
import net.minecraft.entity.passive.*;
import java.util.*;
import net.minecraft.nbt.*;
import net.minecraft.util.*;
import net.minecraft.init.*;
import net.minecraft.tileentity.*;
import net.minecraft.block.*;

public class Rat extends EntityMob
{
    private GenericTargetSorter TargetSorter;
    private float moveSpeed;
    private String myowner;
    
    public Rat(final World par1World) {
        super(par1World);
        this.TargetSorter = null;
        this.moveSpeed = 0.25f;
        this.myowner = null;
        this.setSize(0.25f, 0.5f);
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
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue((double)OreSpawnMain.Rat_stats.attack);
    }
    
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(20, (Object)0);
    }
    
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired() && this.myowner == null;
    }
    
    public final int getAttacking() {
        return this.dataWatcher.getWatchableObjectInt(20);
    }
    
    public final void setAttacking(final int par1) {
        this.dataWatcher.updateObject(20, par1);
    }
    
    public int mygetMaxHealth() {
        return OreSpawnMain.Rat_stats.health;
    }
    
    public int getTotalArmorValue() {
        return OreSpawnMain.Rat_stats.defense;
    }
    
    protected boolean isAIEnabled() {
        return true;
    }
    
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue((double)this.moveSpeed);
        super.onUpdate();
    }
    
    protected void jump() {
        super.jump();
        this.motionY += 0.25;
        this.posY += 0.25;
    }
    
    protected String getLivingSound() {
        return "orespawn:ratlive";
    }
    
    protected String getHurtSound() {
        return "orespawn:rathit";
    }
    
    protected String getDeathSound() {
        return "orespawn:ratdead";
    }
    
    protected float getSoundVolume() {
        return 0.45f;
    }
    
    protected float getSoundPitch() {
        return 1.0f;
    }
    
    protected Item getDropItem() {
        return Items.rotten_flesh;
    }
    
    public void initCreature() {
    }
    
    public boolean interact(final EntityPlayer par1EntityPlayer) {
        return false;
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
                this.setAttacking(1);
                this.getNavigator().tryMoveToEntityLiving((Entity)e, 1.25);
                if (this.getDistanceSqToEntity((Entity)e) < 4.0 && (this.rand.nextInt(8) == 0 || this.rand.nextInt(7) == 1)) {
                    this.attackEntityAsMob((Entity)e);
                }
            }
            else {
                this.setAttacking(0);
                if (this.myowner != null) {
                    final EntityPlayer p = this.worldObj.getPlayerEntityByName(this.myowner);
                    if (p != null) {
                        if (this.getDistanceSqToEntity((Entity)p) > 64.0) {
                            this.getNavigator().tryMoveToEntityLiving((Entity)p, 1.75);
                        }
                        if (this.getDistanceSqToEntity((Entity)p) > 256.0) {
                            this.setPosition(p.posX + this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat(), p.posY, p.posZ + this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat());
                        }
                    }
                }
            }
        }
        if (this.worldObj.rand.nextInt(250) == 1) {
            this.heal(1.0f);
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
        final MyUtils oreSpawnUtils = OreSpawnMain.OreSpawnUtils;
        if (MyUtils.isIgnoreable(par1EntityLiving)) {
            return false;
        }
        if (!this.getEntitySenses().canSee((Entity)par1EntityLiving)) {
            return false;
        }
        if (par1EntityLiving instanceof Irukandji) {
            return false;
        }
        if (par1EntityLiving instanceof Skate) {
            return false;
        }
        if (par1EntityLiving instanceof Whale) {
            return false;
        }
        if (par1EntityLiving instanceof Flounder) {
            return false;
        }
        if (par1EntityLiving instanceof Rat) {
            return false;
        }
        if (par1EntityLiving instanceof Ghost) {
            return false;
        }
        if (par1EntityLiving instanceof GhostSkelly) {
            return false;
        }
        if (par1EntityLiving instanceof DungeonBeast) {
            return false;
        }
        if (par1EntityLiving instanceof EntityPlayer) {
            final EntityPlayer p = (EntityPlayer)par1EntityLiving;
            if (p.capabilities.isCreativeMode) {
                return false;
            }
            if (this.myowner != null) {
                if (this.myowner.equals(p.getUniqueID().toString())) {
                    return false;
                }
                if (OreSpawnMain.RatPlayerFriendly != 0) {
                    return false;
                }
            }
        }
        if (this.myowner != null && par1EntityLiving instanceof EntityTameable) {
            final EntityTameable e = (EntityTameable)par1EntityLiving;
            if (OreSpawnMain.RatPetFriendly != 0 && e.isTamed()) {
                return false;
            }
            if (e.func_152113_b() != null && this.myowner.equals(e.func_152113_b())) {
                return false;
            }
        }
        return true;
    }
    
    private EntityLivingBase findSomethingToAttack() {
        if (OreSpawnMain.PlayNicely != 0) {
            return null;
        }
        final List var5 = this.worldObj.getEntitiesWithinAABB((Class)EntityLivingBase.class, this.boundingBox.expand(9.0, 2.0, 9.0));
        Collections.sort((List<Object>)var5, this.TargetSorter);
        final Iterator var6 = var5.iterator();
        Entity var7 = null;
        EntityLivingBase var8 = null;
        while (var6.hasNext()) {
            var7 = (Entity) var6.next();
            var8 = (EntityLivingBase)var7;
            if (this.isSuitableTarget(var8, false)) {
                return var8;
            }
        }
        return null;
    }
    
    public void setOwner(final EntityLivingBase e) {
        EntityPlayer p = null;
        if (e != null && e instanceof EntityPlayer) {
            p = (EntityPlayer)e;
            final String s = p.getUniqueID().toString();
            if (s != null) {
                this.myowner = s;
            }
        }
    }
    
    public void writeEntityToNBT(final NBTTagCompound par1NBTTagCompound) {
        super.writeEntityToNBT(par1NBTTagCompound);
        if (this.myowner == null) {
            this.myowner = "null";
        }
        par1NBTTagCompound.setString("MyOwner", this.myowner);
    }
    
    public void readEntityFromNBT(final NBTTagCompound par1NBTTagCompound) {
        super.readEntityFromNBT(par1NBTTagCompound);
        this.myowner = par1NBTTagCompound.getString("MyOwner");
        if (this.myowner != null && this.myowner.equals("null")) {
            this.myowner = null;
        }
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        boolean ret = false;
        if (par1DamageSource.getDamageType().equals("inWall")) {
            return ret;
        }
        ret = super.attackEntityFrom(par1DamageSource, par2);
        return ret;
    }
    
    public boolean getCanSpawnHere() {
        int sc = 0;
        for (int k = -2; k < 2; ++k) {
            for (int j = -2; j < 2; ++j) {
                for (int i = 0; i < 5; ++i) {
                    final Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
                    if (bid == Blocks.mob_spawner) {
                        TileEntityMobSpawner tileentitymobspawner = null;
                        tileentitymobspawner = (TileEntityMobSpawner)this.worldObj.getTileEntity((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
                        final String s = tileentitymobspawner.func_145881_a().getEntityNameToSpawn();
                        if (s != null && s.equals("Rat")) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!this.isValidLightLevel()) {
            return false;
        }
        if (this.worldObj.provider.dimensionId == OreSpawnMain.DimensionID5) {
            if (this.posY > 50.0) {
                return false;
            }
            for (int k = -1; k <= 1; ++k) {
                for (int j = -1; j <= 1; ++j) {
                    final Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + 1, (int)this.posZ + k);
                    if (bid == Blocks.air) {
                        ++sc;
                    }
                }
            }
            if (sc < 4) {
                return false;
            }
        }
        return this.findBuddies() <= 8;
    }
    
    private int findBuddies() {
        final List var5 = this.worldObj.getEntitiesWithinAABB((Class)Rat.class, this.boundingBox.expand(20.0, 10.0, 20.0));
        return var5.size();
    }
}
