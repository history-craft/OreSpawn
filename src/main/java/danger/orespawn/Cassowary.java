package danger.orespawn;

import net.minecraft.entity.passive.*;
import net.minecraft.world.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import net.minecraft.init.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;

public class Cassowary extends EntityAnimal
{
    private float moveSpeed;
    
    public Cassowary(final World par1World) {
        super(par1World);
        this.moveSpeed = 0.25f;
        this.setSize(0.5f, 1.2f);
        this.moveSpeed = 0.25f;
        this.fireResistance = 100;
        this.experienceValue = 5;
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, (Class)EntityMob.class, 8.0f, 1.0, 1.399999976158142));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, (Class)EntityPlayer.class, 8.0f, 1.0, 1.399999976158142));
        this.tasks.addTask(4, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5));
        this.tasks.addTask(5, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityLiving.class, 12.0f));
        this.tasks.addTask(6, (EntityAIBase)new MyEntityAIWander((EntityCreature)this, 1.0f));
        this.tasks.addTask(7, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue((double)this.moveSpeed);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(8.0);
    }
    
    protected void entityInit() {
        super.entityInit();
    }
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue((double)this.moveSpeed);
        super.onUpdate();
    }
    
    public boolean isAIEnabled() {
        return true;
    }
    
    public boolean canBreatheUnderwater() {
        return false;
    }
    
    public int mygetMaxHealth() {
        return 10;
    }
    
    protected String getLivingSound() {
        return null;
    }
    
    protected String getHurtSound() {
        return "orespawn:duck_hurt";
    }
    
    protected String getDeathSound() {
        return "orespawn:duck_hurt";
    }
    
    protected float getSoundVolume() {
        return 0.4f;
    }
    
    protected Item getDropItem() {
        return Items.chicken;
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
        int var3 = 0;
        var3 = this.rand.nextInt(3);
        var3 += 2;
        for (int var4 = 0; var4 < var3; ++var4) {
            this.dropItem(Items.chicken, 1);
        }
    }
    
    protected void updateAITick() {
        if (this.worldObj.rand.nextInt(200) == 1) {
            this.setRevengeTarget((EntityLivingBase)null);
        }
        super.updateAITick();
    }
    
    public boolean getCanSpawnHere() {
        return this.worldObj.isDaytime();
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
    
    public Cassowary spawnBabyAnimal(final EntityAgeable par1EntityAgeable) {
        return new Cassowary(this.worldObj);
    }
    
    public boolean isWheat(final ItemStack par1ItemStack) {
        return par1ItemStack != null && par1ItemStack.getItem() == Items.apple;
    }
    
    public boolean isBreedingItem(final ItemStack par1ItemStack) {
        return par1ItemStack.getItem() == OreSpawnMain.MyCrystalApple;
    }
}
