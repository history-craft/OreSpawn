package danger.orespawn;

import net.minecraft.entity.passive.*;
import net.minecraft.world.*;
import net.minecraft.entity.ai.*;
import net.minecraft.item.*;
import net.minecraft.entity.item.*;
import net.minecraft.init.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;

public class Coin extends EntityAnimal
{
    private float moveSpeed;
    
    public Coin(final World par1World) {
        super(par1World);
        this.moveSpeed = 0.0f;
        this.setSize(1.5f, 1.5f);
        this.experienceValue = 10;
        this.fireResistance = 100;
        this.tasks.addTask(0, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
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
    
    protected boolean canDespawn() {
        return !this.isNoDespawnRequired();
    }
    
    public void onUpdate() {
        super.onUpdate();
    }
    
    public int mygetMaxHealth() {
        return 1;
    }
    
    public int getTotalArmorValue() {
        return 0;
    }
    
    protected boolean isAIEnabled() {
        return true;
    }
    
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }
    
    protected String getLivingSound() {
        return null;
    }
    
    protected String getHurtSound() {
        return null;
    }
    
    protected String getDeathSound() {
        return null;
    }
    
    protected float getSoundVolume() {
        return 1.0f;
    }
    
    protected float getSoundPitch() {
        return 1.0f;
    }
    
    protected Item getDropItem() {
        return null;
    }
    
    private void dropItemRand(final Item index, final int par1) {
        final EntityItem var3 = new EntityItem(this.worldObj, this.posX + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), this.posY + 1.0, this.posZ + OreSpawnMain.OreSpawnRand.nextInt(2) - OreSpawnMain.OreSpawnRand.nextInt(2), new ItemStack(index, par1, 0));
        this.worldObj.spawnEntityInWorld((Entity)var3);
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
        final int i = this.worldObj.rand.nextInt(10);
        Item j = OreSpawnMain.MyEmeraldSword;
        if (i == 0) {
            j = Items.diamond;
        }
        if (i == 1) {
            j = OreSpawnMain.UraniumNugget;
        }
        if (i == 2) {
            j = OreSpawnMain.TitaniumNugget;
        }
        if (i == 3) {
            j = Items.emerald;
        }
        if (i == 4) {
            j = OreSpawnMain.MyEmeraldAxe;
        }
        if (i == 5) {
            j = OreSpawnMain.MyEmeraldShovel;
        }
        if (i == 6) {
            j = OreSpawnMain.MyEmeraldPickaxe;
        }
        if (i == 7) {
            j = OreSpawnMain.MyEmeraldHoe;
        }
        if (i == 8) {
            j = OreSpawnMain.CoinEgg;
        }
        this.dropItemRand(j, 1);
    }
    
    public void initCreature() {
    }
    
    public boolean interact(final EntityPlayer par1EntityPlayer) {
        return false;
    }
    
    public boolean getCanSpawnHere() {
        if (!this.worldObj.isDaytime()) {
            return false;
        }
        if (this.posY < 50.0) {
            return false;
        }
        Coin target = null;
        target = (Coin)this.worldObj.findNearestEntityWithinAABB((Class)Coin.class, this.boundingBox.expand(20.0, 8.0, 20.0), (Entity)this);
        return target == null;
    }
    
    public EntityAgeable createChild(final EntityAgeable entityageable) {
        return null;
    }
}
