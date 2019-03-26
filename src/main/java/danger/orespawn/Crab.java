package danger.orespawn;

import net.minecraft.entity.monster.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import net.minecraft.nbt.*;
import net.minecraft.item.*;
import net.minecraft.entity.item.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import net.minecraft.entity.passive.*;
import java.util.*;
import net.minecraft.tileentity.*;

public class Crab extends EntityMob
{
    private GenericTargetSorter TargetSorter;
    private int hurt_timer;
    private float moveSpeed;
    private int closest;
    private int tx;
    private int ty;
    private int tz;
    
    public Crab(final World par1World) {
        super(par1World);
        this.TargetSorter = null;
        this.hurt_timer = 0;
        this.moveSpeed = 0.55f;
        this.closest = 99999;
        this.tx = 0;
        this.ty = 0;
        this.tz = 0;
        this.moveSpeed = 0.55f;
        this.setSize(1.25f, 2.5f);
        this.getNavigator().setAvoidsWater(false);
        this.experienceValue = 150;
        this.fireResistance = 30;
        this.isImmuneToFire = false;
        this.TargetSorter = new GenericTargetSorter((Entity)this);
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(1, (EntityAIBase)new MyEntityAIWanderALot((EntityCreature)this, 16, 1.0));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityPlayer.class, 10.0f));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityLiving.class, 8.0f));
        this.tasks.addTask(4, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue((double)(this.moveSpeed * this.getCrabScale()));
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue((double)(OreSpawnMain.Crab_stats.attack * this.getCrabScale()));
    }
    
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(20, (Object)0);
        this.dataWatcher.addObject(21, (Object)0);
        float t = 0.25f;
        if (this.worldObj != null) {
            if (this.worldObj.rand.nextInt(4) == 1) {
                t = 0.5f;
            }
            if (this.worldObj.rand.nextInt(8) == 2) {
                t = 1.0f;
            }
        }
        else {
            if (OreSpawnMain.OreSpawnRand.nextInt(4) == 1) {
                t = 0.5f;
            }
            if (OreSpawnMain.OreSpawnRand.nextInt(8) == 2) {
                t = 1.0f;
            }
        }
        this.setCrabScale(t);
        this.experienceValue = (int)(400.0f * t);
        this.fireResistance = (int)(10.0f * t);
        this.setSize(3.75f * this.getCrabScale(), 3.5f * this.getCrabScale());
    }
    
    public float getCrabScale() {
        final int i = this.dataWatcher.getWatchableObjectInt(21);
        final float f = (float)i;
        return f / 100.0f;
    }
    
    public void setCrabScale(final float par1) {
        final float f = par1 * 100.0f;
        final int i = (int)f;
        this.dataWatcher.updateObject(21, (Object)i);
    }
    
    public void readEntityFromNBT(final NBTTagCompound par1NBTTagCompound) {
        super.readEntityFromNBT(par1NBTTagCompound);
        this.setCrabScale(par1NBTTagCompound.getFloat("Fscale"));
        this.setSize(3.75f * this.getCrabScale(), 3.5f * this.getCrabScale());
        this.experienceValue = (int)(400.0f * this.getCrabScale());
        this.fireResistance = (int)(10.0f * this.getCrabScale());
    }
    
    public void writeEntityToNBT(final NBTTagCompound par1NBTTagCompound) {
        super.writeEntityToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setFloat("Fscale", this.getCrabScale());
    }
    
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired();
    }
    
    public void onUpdate() {
        if (this.isInWater()) {
            this.moveSpeed = 0.95f;
        }
        else {
            this.moveSpeed = 0.55f;
        }
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue((double)(this.moveSpeed * this.getCrabScale()));
        super.onUpdate();
        this.setSize(2.5f * this.getCrabScale(), 3.5f * this.getCrabScale());
    }
    
    public int mygetMaxHealth() {
        return (int)(OreSpawnMain.PitchBlack_stats.health * this.getCrabScale());
    }
    
    public int getTotalArmorValue() {
        return OreSpawnMain.Crab_stats.defense + (int)(2.0f * this.getCrabScale());
    }
    
    protected boolean isAIEnabled() {
        return true;
    }
    
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }
    
    public int getCrabHealth() {
        return (int)this.getHealth();
    }
    
    protected String getLivingSound() {
        return null;
    }
    
    protected String getHurtSound() {
        return "orespawn:leaves_hit";
    }
    
    protected String getDeathSound() {
        return null;
    }
    
    protected float getSoundVolume() {
        return 0.75f;
    }
    
    protected float getSoundPitch() {
        return 2.0f - 0.3f * (1.0f / this.getCrabScale());
    }
    
    protected Item getDropItem() {
        return Items.fish;
    }
    
    private ItemStack dropItemRand(final Item index, final int par1) {
        EntityItem var3 = null;
        final ItemStack is = new ItemStack(index, par1, 0);
        var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.posY + 1.0, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), is);
        if (var3 != null) {
            this.worldObj.spawnEntityInWorld((Entity)var3);
        }
        return is;
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
        final ItemStack is = null;
        int var5 = 4 + this.worldObj.rand.nextInt(8);
        var5 *= (int)this.getCrabScale();
        if (var5 < 1) {
            var5 = 1;
        }
        for (int var6 = 0; var6 < var5; ++var6) {
            this.dropItemRand(OreSpawnMain.MyRawCrabMeat, 1);
        }
    }
    
    public void initCreature() {
    }
    
    public boolean interact(final EntityPlayer par1EntityPlayer) {
        return false;
    }
    
    public boolean attackEntityAsMob(final Entity par1Entity) {
        final boolean var4 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), OreSpawnMain.Crab_stats.attack * this.getCrabScale());
        if (var4 && par1Entity != null && par1Entity instanceof EntityLivingBase) {
            final double ks = 1.15 * this.getCrabScale();
            double inair = 0.48 * this.getCrabScale();
            final float f3 = (float)Math.atan2(par1Entity.posZ - this.posZ, par1Entity.posX - this.posX);
            if (par1Entity.isDead || par1Entity instanceof EntityPlayer) {
                inair *= 2.0;
            }
            par1Entity.addVelocity(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
        }
        return var4;
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        boolean ret = false;
        if (par1DamageSource.getDamageType().equals("cactus")) {
            return false;
        }
        final Entity e = par1DamageSource.getEntity();
        if (this.hurt_timer <= 0) {
            ret = super.attackEntityFrom(par1DamageSource, par2);
            this.hurt_timer = 8;
        }
        if (e != null && e instanceof EntityLiving) {
            if (e instanceof Crab) {
                return false;
            }
            this.setAttackTarget((EntityLivingBase)e);
            this.setTarget(e);
            this.getNavigator().tryMoveToEntityLiving((Entity)e, 1.2);
        }
        return ret;
    }
    
    private boolean scan_it(final int x, final int y, final int z, final int dx, final int dy, final int dz) {
        int found = 0;
        for (int i = -dy; i <= dy; ++i) {
            for (int j = -dz; j <= dz; ++j) {
                Block bid = this.worldObj.getBlock(x + dx, y + i, z + j);
                if (bid == Blocks.water || bid == Blocks.flowing_water) {
                    final int d = dx * dx + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + dx;
                        this.ty = y + i;
                        this.tz = z + j;
                        ++found;
                    }
                }
                bid = this.worldObj.getBlock(x - dx, y + i, z + j);
                if (bid == Blocks.water || bid == Blocks.flowing_water) {
                    final int d = dx * dx + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x - dx;
                        this.ty = y + i;
                        this.tz = z + j;
                        ++found;
                    }
                }
            }
        }
        for (int i = -dx; i <= dx; ++i) {
            for (int j = -dz; j <= dz; ++j) {
                Block bid = this.worldObj.getBlock(x + i, y + dy, z + j);
                if (bid == Blocks.water || bid == Blocks.flowing_water) {
                    final int d = dy * dy + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + i;
                        this.ty = y + dy;
                        this.tz = z + j;
                        ++found;
                    }
                }
                bid = this.worldObj.getBlock(x + i, y - dy, z + j);
                if (bid == Blocks.water || bid == Blocks.flowing_water) {
                    final int d = dy * dy + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + i;
                        this.ty = y - dy;
                        this.tz = z + j;
                        ++found;
                    }
                }
            }
        }
        for (int i = -dx; i <= dx; ++i) {
            for (int j = -dy; j <= dy; ++j) {
                Block bid = this.worldObj.getBlock(x + i, y + j, z + dz);
                if (bid == Blocks.water || bid == Blocks.flowing_water) {
                    final int d = dz * dz + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + i;
                        this.ty = y + j;
                        this.tz = z + dz;
                        ++found;
                    }
                }
                bid = this.worldObj.getBlock(x + i, y + j, z - dz);
                if (bid == Blocks.water || bid == Blocks.flowing_water) {
                    final int d = dz * dz + j * j + i * i;
                    if (d < this.closest) {
                        this.closest = d;
                        this.tx = x + i;
                        this.ty = y + j;
                        this.tz = z - dz;
                        ++found;
                    }
                }
            }
        }
        return found != 0;
    }
    
    protected void updateAITasks() {
        if (this.isDead) {
            return;
        }
        super.updateAITasks();
        if (this.hurt_timer > 0) {
            --this.hurt_timer;
        }
        if (!this.isInWater() && this.worldObj.rand.nextInt(25) == 0) {
            this.closest = 99999;
            final boolean tx = false;
            this.tz = (tx ? 1 : 0);
            this.ty = (tx ? 1 : 0);
            this.tx = (tx ? 1 : 0);
            for (int i = 1; i < 12; ++i) {
                int j = i;
                if (j > 10) {
                    j = 10;
                }
                if (this.scan_it((int)this.posX, (int)this.posY - 1, (int)this.posZ, i, j, i)) {
                    break;
                }
                if (i >= 5) {
                    ++i;
                }
            }
            if (this.closest < 99999) {
                this.getNavigator().tryMoveToXYZ((double)this.tx, (double)(this.ty - 1), (double)this.tz, 1.33);
            }
            else {
                if (this.worldObj.rand.nextInt(100) == 1) {
                    this.heal(-1.0f * this.getCrabScale());
                }
                if (this.getHealth() <= 0.0f) {
                    this.setDead();
                    return;
                }
            }
        }
        if (this.worldObj.rand.nextInt(5) == 1) {
            EntityLivingBase e = null;
            if (this.worldObj.rand.nextInt(100) == 1) {
                this.setAttackTarget((EntityLivingBase)null);
            }
            e = this.getAttackTarget();
            if (e != null && !e.isEntityAlive()) {
                this.setAttackTarget((EntityLivingBase)null);
                e = null;
            }
            if (e == null) {
                e = this.findSomethingToAttack();
            }
            if (e != null) {
                this.faceEntity((Entity)e, 10.0f, 10.0f);
                if (this.getDistanceSqToEntity((Entity)e) < (6.0f + e.width / 2.0f) * (6.0f + e.width / 2.0f) * this.getCrabScale()) {
                    this.setAttacking(1);
                    if (this.worldObj.rand.nextInt(4) == 0 || this.worldObj.rand.nextInt(5) == 1) {
                        this.attackEntityAsMob((Entity)e);
                        if (!this.worldObj.isRemote) {
                            if (this.worldObj.rand.nextInt(3) == 1) {
                                this.worldObj.playSoundAtEntity((Entity)e, "orespawn:scorpion_attack", 0.75f, 1.5f);
                            }
                            else {
                                this.worldObj.playSoundAtEntity((Entity)e, "orespawn:scorpion_living", 0.75f, 1.5f);
                            }
                        }
                    }
                }
                else {
                    this.getNavigator().tryMoveToEntityLiving((Entity)e, 1.0);
                }
            }
            else {
                this.setAttacking(0);
            }
        }
        if (this.worldObj.rand.nextInt(120) == 1 && this.isInWater() && this.getHealth() < this.mygetMaxHealth()) {
            this.playSound("splash", 1.5f, this.worldObj.rand.nextFloat() * 0.2f + 0.9f);
            this.heal(4.0f * this.getCrabScale());
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
        if (par1EntityLiving instanceof EntityPlayer) {
            final EntityPlayer p = (EntityPlayer)par1EntityLiving;
            return !p.capabilities.isCreativeMode;
        }
        if (par1EntityLiving instanceof Crab) {
            return false;
        }
        if (par1EntityLiving instanceof EntityMob) {
            return true;
        }
        if (par1EntityLiving instanceof Lizard) {
            return true;
        }
        if (par1EntityLiving instanceof RubberDucky) {
            return true;
        }
        if (par1EntityLiving instanceof EntityVillager) {
            return true;
        }
        if (par1EntityLiving instanceof Girlfriend) {
            return true;
        }
        if (par1EntityLiving instanceof Boyfriend) {
            return true;
        }
        final MyUtils oreSpawnUtils = OreSpawnMain.OreSpawnUtils;
        return MyUtils.isAttackableNonMob(par1EntityLiving);
    }
    
    private EntityLivingBase findSomethingToAttack() {
        if (OreSpawnMain.PlayNicely != 0) {
            return null;
        }
        final List var5 = this.worldObj.getEntitiesWithinAABB((Class)EntityLivingBase.class, this.boundingBox.expand(16.0, 6.0, 16.0));
        Collections.sort((List<Object>)var5, this.TargetSorter);
        final Iterator var6 = var5.iterator();
        Entity var7 = null;
        EntityLivingBase var8 = null;
        final EntityLivingBase e = this.getAttackTarget();
        if (e != null && e.isEntityAlive()) {
            return e;
        }
        this.setAttackTarget((EntityLivingBase)null);
        while (var6.hasNext()) {
            var7 = (Entity)var6.next();
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
    
    private int findBuddies() {
        final List var5 = this.worldObj.getEntitiesWithinAABB((Class)Crab.class, this.boundingBox.expand(24.0, 8.0, 24.0));
        return var5.size();
    }
    
    public boolean getCanSpawnHere() {
        for (int k = -3; k < 3; ++k) {
            for (int j = -3; j < 3; ++j) {
                for (int i = 0; i < 5; ++i) {
                    final Block bid = this.worldObj.getBlock((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
                    if (bid == Blocks.mob_spawner) {
                        TileEntityMobSpawner tileentitymobspawner = null;
                        tileentitymobspawner = (TileEntityMobSpawner)this.worldObj.getTileEntity((int)this.posX + j, (int)this.posY + i, (int)this.posZ + k);
                        final String s = tileentitymobspawner.func_145881_a().getEntityNameToSpawn();
                        if (s != null && s.equals("Crab")) {
                            this.setCrabScale(0.35f);
                            return true;
                        }
                    }
                }
            }
        }
        if (this.posY < 50.0) {
            return false;
        }
        if (!this.worldObj.isDaytime()) {
            return false;
        }
        if (this.worldObj.provider.dimensionId == OreSpawnMain.DimensionID5) {
            if (this.worldObj.rand.nextInt(40) != 1) {
                return false;
            }
            if (this.findBuddies() > 3) {
                return false;
            }
        }
        return true;
    }
    
    public boolean canBreatheUnderwater() {
        return true;
    }
}
