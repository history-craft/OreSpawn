package danger.orespawn;

import net.minecraft.entity.passive.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import net.minecraft.util.*;
import net.minecraft.potion.*;
import java.util.*;
import net.minecraft.tileentity.*;
import net.minecraft.block.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;
import net.minecraft.init.*;

public class StinkBug extends EntityAnimal
{
    private float moveSpeed;
    
    public StinkBug(final World par1World) {
        super(par1World);
        this.moveSpeed = 0.15f;
        this.setSize(0.55f, 0.55f);
        this.fireResistance = 10;
        this.getNavigator().setAvoidsWater(true);
        this.experienceValue = 2;
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0));
        this.tasks.addTask(4, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5));
        this.tasks.addTask(5, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, (Class)EntityPlayer.class, 4.0f, 1.0, 1.399999976158142));
        this.tasks.addTask(6, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityPlayer.class, 6.0f));
        this.tasks.addTask(8, (EntityAIBase)new MyEntityAIWanderALot((EntityCreature)this, 10, 1.0));
        this.tasks.addTask(9, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        this.tasks.addTask(10, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue((double)this.moveSpeed);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(0.0);
    }
    
    protected void entityInit() {
        super.entityInit();
    }
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue((double)this.moveSpeed);
        super.onUpdate();
    }
    
    protected void updateAITick() {
        if (this.isDead) {
            return;
        }
        if (this.worldObj.rand.nextInt(200) == 1) {
            this.setRevengeTarget((EntityLivingBase)null);
        }
        super.updateAITick();
    }
    
    public boolean isAIEnabled() {
        return true;
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        boolean ret = false;
        if (this.isDead) {
            return false;
        }
        ret = super.attackEntityFrom(par1DamageSource, par2);
        if (this.getHealth() <= 0.0f || this.isDead) {
            final AxisAlignedBB bb = AxisAlignedBB.getBoundingBox(this.posX - 8.0, this.posY - 5.0, this.posZ - 8.0, this.posX + 8.0, this.posY + 10.0, this.posZ + 8.0);
            final List var5 = this.worldObj.getEntitiesWithinAABB((Class)EntityLivingBase.class, bb);
            final Iterator var6 = var5.iterator();
            EntityLivingBase var7 = null;
            while (var6.hasNext()) {
                var7 = (EntityLivingBase) var6.next();
                if (var7 != null) {
                    var7.addPotionEffect(new PotionEffect(Potion.confusion.id, 300, 0));
                }
            }
        }
        return ret;
    }
    
    public boolean canBreatheUnderwater() {
        return false;
    }
    
    public int mygetMaxHealth() {
        return 5;
    }
    
    protected String getLivingSound() {
        return null;
    }
    
    protected String getHurtSound() {
        return null;
    }
    
    protected String getDeathSound() {
        return "orespawn:fart";
    }
    
    protected float getSoundVolume() {
        return 1.0f;
    }
    
    protected Item getDropItem() {
        return OreSpawnMain.MyDeadStinkBug;
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
                        if (s != null && s.equals("Stink Bug")) {
                            return true;
                        }
                    }
                }
            }
        }
        return this.posY >= 50.0;
    }
    
    protected boolean canDespawn() {
        if (this.isChild()) {
            this.func_110163_bv();
            return false;
        }
        return !this.isNoDespawnRequired();
    }
    
    public EntityAgeable createChild(final EntityAgeable entityageable) {
        return (EntityAgeable)this.spawnBabyAnimal(entityageable);
    }
    
    public StinkBug spawnBabyAnimal(final EntityAgeable par1EntityAgeable) {
        return new StinkBug(this.worldObj);
    }
    
    public boolean isWheat(final ItemStack par1ItemStack) {
        return par1ItemStack != null && par1ItemStack.getItem() == Items.fish;
    }
    
    public boolean isBreedingItem(final ItemStack par1ItemStack) {
        return par1ItemStack.getItem() == OreSpawnMain.MyCrystalApple;
    }
}
