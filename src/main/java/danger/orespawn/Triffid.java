package danger.orespawn;

import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import net.minecraft.block.*;
import net.minecraft.entity.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.entity.item.*;
import net.minecraft.util.*;
import net.minecraft.entity.monster.*;
import java.util.*;

public class Triffid extends EntityMob
{
    private GenericTargetSorter TargetSorter;
    private RenderInfo renderdata;
    private int hurt_timer;
    private float moveSpeed;
    
    public Triffid(final World par1World) {
        super(par1World);
        this.TargetSorter = null;
        this.renderdata = new RenderInfo();
        this.hurt_timer = 0;
        this.moveSpeed = 0.13f;
        this.setSize(2.0f, 4.0f);
        this.getNavigator().setAvoidsWater(true);
        this.experienceValue = 50;
        this.fireResistance = 75;
        this.isImmuneToFire = false;
        this.TargetSorter = new GenericTargetSorter((Entity)this);
        this.renderdata = new RenderInfo();
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityPlayer.class, 10.0f));
        this.tasks.addTask(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
    }
    
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(20, (Object)0);
        this.dataWatcher.addObject(21, (Object)0);
        if (this.renderdata == null) {
            this.renderdata = new RenderInfo();
        }
        this.renderdata.rf1 = 0.0f;
        this.renderdata.rf2 = 0.0f;
        this.renderdata.rf3 = 0.0f;
        this.renderdata.rf4 = 0.0f;
        this.renderdata.ri1 = 0;
        this.renderdata.ri2 = 0;
        this.renderdata.ri3 = 0;
        this.renderdata.ri4 = 0;
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue((double)this.moveSpeed);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue((double)OreSpawnMain.Triffid_stats.attack);
    }
    
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired();
    }
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue((double)this.moveSpeed);
        super.onUpdate();
        if (this.worldObj.rand.nextInt(100) == 1) {
            int ix = (int)this.posX;
            int iz = (int)this.posZ;
            for (int k = -5; k <= 5; ++k) {
                final Block bid = this.worldObj.getBlock((int)this.posX, (int)this.posY - 1, (int)this.posZ + k);
                if (bid != Blocks.air) {
                    if (k < 0) {
                        --iz;
                    }
                    if (k > 0) {
                        ++iz;
                    }
                }
            }
            for (int k = -5; k <= 5; ++k) {
                final Block bid = this.worldObj.getBlock((int)this.posX + k, (int)this.posY - 1, (int)this.posZ);
                if (bid != Blocks.air) {
                    if (k < 0) {
                        --ix;
                    }
                    if (k > 0) {
                        ++ix;
                    }
                }
            }
            this.getNavigator().tryMoveToXYZ((double)ix, this.posY, (double)iz, 1.0);
        }
        if (this.hurt_timer <= 0) {
            final EntityLivingBase e = this.findSomethingToAttack();
            if (e != null) {
                this.rotationYaw = (float)Math.toDegrees(Math.atan2(e.posZ - this.posZ, e.posX - this.posX)) - 90.0f;
                while (this.rotationYaw < 0.0f) {
                    this.rotationYaw += 360.0f;
                }
            }
        }
    }
    
    public int mygetMaxHealth() {
        return OreSpawnMain.Triffid_stats.health;
    }
    
    public RenderInfo getRenderInfo() {
        return this.renderdata;
    }
    
    public void setRenderInfo(final RenderInfo r) {
        this.renderdata.rf1 = r.rf1;
        this.renderdata.rf2 = r.rf2;
        this.renderdata.rf3 = r.rf3;
        this.renderdata.rf4 = r.rf4;
        this.renderdata.ri1 = r.ri1;
        this.renderdata.ri2 = r.ri2;
        this.renderdata.ri3 = r.ri3;
        this.renderdata.ri4 = r.ri4;
    }
    
    public int getTotalArmorValue() {
        return OreSpawnMain.Triffid_stats.defense;
    }
    
    protected boolean isAIEnabled() {
        return true;
    }
    
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (!this.worldObj.isRemote && this.hurt_timer > 0) {
            final double n = 0.0;
            this.motionZ = n;
            this.motionX = n;
        }
    }
    
    public int getTriffidHealth() {
        return (int)this.getHealth();
    }
    
    protected String getLivingSound() {
        return "orespawn:triffid_living";
    }
    
    protected String getHurtSound() {
        return "orespawn:triffid_hit";
    }
    
    protected String getDeathSound() {
        return "orespawn:triffid_dead";
    }
    
    protected float getSoundVolume() {
        return 0.75f;
    }
    
    protected float getSoundPitch() {
        return 1.0f;
    }
    
    protected Item getDropItem() {
        final int i = this.worldObj.rand.nextInt(3);
        if (i == 0) {
            return Items.gold_nugget;
        }
        return null;
    }
    
    private ItemStack dropItemRand(final Item index, final int par1) {
        EntityItem var3 = null;
        final ItemStack is = new ItemStack(index, par1, 0);
        var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), this.posY + 1.0, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(3) - OreSpawnMain.OreSpawnRand.nextInt(3), is);
        if (var3 != null) {
            this.worldObj.spawnEntityInWorld((Entity)var3);
        }
        return is;
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
        for (int i = 4 + this.worldObj.rand.nextInt(6), var4 = 0; var4 < i; ++var4) {
            this.dropItemRand(OreSpawnMain.GreenGoo, 1);
        }
        this.dropItemRand(Items.item_frame, 1);
    }
    
    public boolean canBePushed() {
        return false;
    }
    
    public boolean attackEntityAsMob(final Entity par1Entity) {
        final boolean ret = super.attackEntityAsMob(par1Entity);
        return ret;
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        boolean ret = false;
        if (this.hurt_timer > 0 || this.getOpenClosed() == 0) {
            this.hurt_timer = 300;
            this.setAttacking(0);
            return false;
        }
        ret = super.attackEntityFrom(par1DamageSource, par2);
        this.hurt_timer = 300;
        this.setOpenClosed(0);
        this.setAttacking(0);
        return ret;
    }
    
    protected void updateAITasks() {
        if (this.isDead) {
            return;
        }
        super.updateAITasks();
        if (this.hurt_timer > 0) {
            --this.hurt_timer;
            this.setFire(0);
            this.setOpenClosed(0);
        }
        if (this.worldObj.rand.nextInt(250) == 1 && this.getHealth() < this.mygetMaxHealth()) {
            this.heal(1.0f);
        }
        if (this.worldObj.rand.nextInt(80) == 2 && this.hurt_timer <= 0) {
            if (this.worldObj.rand.nextInt(8) == 1) {
                this.setOpenClosed(1);
            }
            else {
                this.setOpenClosed(0);
            }
        }
        if (this.worldObj.rand.nextInt(10) == 1 && this.hurt_timer <= 0) {
            final EntityLivingBase e = this.findSomethingToAttack();
            if (e != null) {
                this.setOpenClosed(1);
                if (this.getDistanceSqToEntity((Entity)e) < 25.0) {
                    this.rotationYaw = (float)Math.toDegrees(Math.atan2(e.posZ - this.posZ, e.posX - this.posX)) - 90.0f;
                    while (this.rotationYaw < 0.0f) {
                        this.rotationYaw += 360.0f;
                    }
                    this.setAttacking(1);
                    this.attackEntityAsMob((Entity)e);
                }
                else {
                    this.setAttacking(0);
                }
            }
            else {
                this.setAttacking(0);
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
        final MyUtils oreSpawnUtils = OreSpawnMain.OreSpawnUtils;
        if (MyUtils.isIgnoreable(par1EntityLiving)) {
            return false;
        }
        if (!this.getEntitySenses().canSee((Entity)par1EntityLiving)) {
            return false;
        }
        if (par1EntityLiving instanceof EntityCreeper) {
            return false;
        }
        if (par1EntityLiving instanceof EnderReaper) {
            return false;
        }
        if (par1EntityLiving instanceof Triffid) {
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
        if (par1EntityLiving instanceof Dragon) {
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
        final List var5 = this.worldObj.getEntitiesWithinAABB((Class)EntityLivingBase.class, this.boundingBox.expand(10.0, 8.0, 10.0));
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
    
    public final int getAttacking() {
        return this.dataWatcher.getWatchableObjectInt(20);
    }
    
    public final void setAttacking(final int par1) {
        this.dataWatcher.updateObject(20, par1);
    }
    
    public final int getOpenClosed() {
        return this.dataWatcher.getWatchableObjectInt(21);
    }
    
    public final void setOpenClosed(final int par1) {
        this.dataWatcher.updateObject(21, par1);
    }
    
    public boolean getCanSpawnHere() {
        return true;
    }
}
