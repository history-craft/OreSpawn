package danger.orespawn;

import net.minecraft.world.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import net.minecraft.util.*;
import java.util.*;
import net.minecraft.item.*;
import net.minecraft.entity.*;

public class Gazelle extends EntityTameable
{
    private float moveSpeed;
    private GenericTargetSorter TargetSorter;
    private int closest;
    private int tx;
    private int ty;
    private int tz;
    
    public Gazelle(final World par1World) {
        super(par1World);
        this.moveSpeed = 0.2f;
        this.TargetSorter = null;
        this.closest = 99999;
        this.tx = 0;
        this.ty = 0;
        this.tz = 0;
        this.setSize(0.6f, 1.8f);
        this.moveSpeed = 0.3f;
        this.fireResistance = 100;
        this.getNavigator().setAvoidsWater(true);
        this.setSitting(false);
        this.experienceValue = 5;
        this.TargetSorter = new GenericTargetSorter((Entity)this);
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(1, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0));
        this.tasks.addTask(2, (EntityAIBase)new MyEntityAIFollowOwner(this, 2.0f, 10.0f, 2.0f));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, (Class)EntityMob.class, 8.0f, 1.0, 1.7000000476837158));
        this.tasks.addTask(4, (EntityAIBase)new EntityAITempt((EntityCreature)this, 1.2000000476837158, Items.apple, false));
        this.tasks.addTask(5, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.5));
        this.tasks.addTask(6, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, (Class)EntityPlayer.class, 12.0f, 1.0, 2.0));
        this.tasks.addTask(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityPlayer.class, 6.0f));
        this.tasks.addTask(8, (EntityAIBase)new MyEntityAIWander((EntityCreature)this, 1.0f));
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
        this.setSitting(false);
    }
    
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue((double)this.moveSpeed);
        super.onUpdate();
    }
    
    private boolean scan_it(final int x, final int y, final int z, final int dx, final int dy, final int dz) {
        int found = 0;
        for (int i = -dy; i <= dy; ++i) {
            for (int j = -dz; j <= dz; ++j) {
                Block bid = this.worldObj.getBlock(x + dx, y + i, z + j);
                if (bid == OreSpawnMain.MyStrawberryPlant || bid == Blocks.potatoes || bid == Blocks.carrots || bid == Blocks.tallgrass || bid == Blocks.double_plant) {
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
                if (bid == OreSpawnMain.MyStrawberryPlant || bid == Blocks.potatoes || bid == Blocks.carrots || bid == Blocks.tallgrass || bid == Blocks.double_plant) {
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
                if (bid == OreSpawnMain.MyStrawberryPlant || bid == Blocks.potatoes || bid == Blocks.carrots || bid == Blocks.tallgrass || bid == Blocks.double_plant) {
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
                if (bid == OreSpawnMain.MyStrawberryPlant || bid == Blocks.potatoes || bid == Blocks.carrots || bid == Blocks.tallgrass || bid == Blocks.double_plant) {
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
                if (bid == OreSpawnMain.MyStrawberryPlant || bid == Blocks.potatoes || bid == Blocks.carrots || bid == Blocks.tallgrass || bid == Blocks.double_plant) {
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
                if (bid == OreSpawnMain.MyStrawberryPlant || bid == Blocks.potatoes || bid == Blocks.carrots || bid == Blocks.tallgrass || bid == Blocks.double_plant) {
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
    
    protected void fall(final float par1) {
        float i = (float)MathHelper.ceiling_float_int(par1 - 3.0f);
        if (i > 0.0f) {
            if (i > 3.0f) {
                this.playSound("damage.fallbig", 1.0f, 1.0f);
            }
            else {
                this.playSound("damage.fallsmall", 1.0f, 1.0f);
            }
            if (i > 2.0f) {
                i = 2.0f;
            }
            this.attackEntityFrom(DamageSource.fall, i);
        }
    }
    
    protected void updateAITick() {
        if (this.isDead) {
            return;
        }
        if (this.worldObj.rand.nextInt(200) == 1) {
            this.setRevengeTarget((EntityLivingBase)null);
        }
        if (!this.isSitting()) {
            if (((this.worldObj.rand.nextInt(30) == 0 && this.getGazelleHealth() < this.mygetMaxHealth()) || this.worldObj.rand.nextInt(750) == 1) && OreSpawnMain.PlayNicely == 0) {
                this.closest = 99999;
                final boolean tx = false;
                this.tz = (tx ? 1 : 0);
                this.ty = (tx ? 1 : 0);
                this.tx = (tx ? 1 : 0);
                for (int i = 1; i < 11; ++i) {
                    int j = i;
                    if (j > 2) {
                        j = 2;
                    }
                    if (this.scan_it((int)this.posX, (int)this.posY + 1, (int)this.posZ, i, j, i)) {
                        break;
                    }
                    if (i >= 6) {
                        ++i;
                    }
                }
                if (this.closest < 99999) {
                    this.getNavigator().tryMoveToXYZ((double)this.tx, (double)this.ty, (double)this.tz, 1.0);
                    if (this.closest < 12) {
                        if (this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing")) {
                            this.worldObj.setBlock(this.tx, this.ty, this.tz, Blocks.air, 0, 2);
                        }
                        this.heal(1.0f);
                        this.playSound("random.burp", 1.0f, this.worldObj.rand.nextFloat() * 0.2f + 0.9f);
                    }
                }
            }
            if (this.worldObj.rand.nextInt(250) == 1) {
                final Gazelle buddy = this.findBuddy();
                if (buddy != null) {
                    this.getNavigator().tryMoveToXYZ(buddy.posX, buddy.posY, buddy.posZ, 0.5);
                }
            }
        }
        if (this.worldObj.rand.nextInt(250) == 0) {
            this.heal(1.0f);
        }
        super.updateAITick();
    }
    
    private Gazelle findBuddy() {
        final List var5 = this.worldObj.getEntitiesWithinAABB((Class)Gazelle.class, this.boundingBox.expand(16.0, 6.0, 16.0));
        Collections.sort((List<Object>)var5, this.TargetSorter);
        final Iterator var6 = var5.iterator();
        Entity var7 = null;
        Gazelle var8 = null;
        if (var6.hasNext()) {
            var7 = (Entity) var6.next();
            var8 = (Gazelle)var7;
            return var8;
        }
        return null;
    }
    
    public boolean isAIEnabled() {
        return true;
    }
    
    public boolean canBreatheUnderwater() {
        return false;
    }
    
    public int mygetMaxHealth() {
        return 15;
    }
    
    public int getGazelleHealth() {
        return (int)this.getHealth();
    }
    
    public boolean interact(final EntityPlayer par1EntityPlayer) {
        ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
        if (var2 != null && var2.stackSize <= 0) {
            par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
            var2 = null;
        }
        if (super.interact(par1EntityPlayer)) {
            return true;
        }
        if (var2 != null && var2.getItem() == Items.apple && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0) {
            if (!this.isTamed()) {
                if (!this.worldObj.isRemote) {
                    if (this.rand.nextInt(2) == 0) {
                        this.setTamed(true);
                        this.func_152115_b(par1EntityPlayer.getUniqueID().toString());
                        this.playTameEffect(true);
                        this.worldObj.setEntityState((Entity)this, (byte)7);
                        this.heal(this.mygetMaxHealth() - this.getHealth());
                    }
                    else {
                        this.playTameEffect(false);
                        this.worldObj.setEntityState((Entity)this, (byte)6);
                    }
                }
            }
            else if (this.func_152114_e((EntityLivingBase)par1EntityPlayer)) {
                if (this.worldObj.isRemote) {
                    this.playTameEffect(true);
                    this.worldObj.setEntityState((Entity)this, (byte)7);
                }
                if (this.mygetMaxHealth() > this.getHealth()) {
                    this.heal(this.mygetMaxHealth() - this.getHealth());
                }
            }
            if (!par1EntityPlayer.capabilities.isCreativeMode) {
                final ItemStack itemStack = var2;
                --itemStack.stackSize;
                if (var2.stackSize <= 0) {
                    par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
                }
            }
            return true;
        }
        if (this.isTamed() && var2 != null && var2.getItem() == Item.getItemFromBlock((Block)Blocks.deadbush) && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0 && this.func_152114_e((EntityLivingBase)par1EntityPlayer)) {
            if (!this.worldObj.isRemote) {
                this.setTamed(false);
                this.func_152115_b("");
                this.playTameEffect(false);
                this.worldObj.setEntityState((Entity)this, (byte)6);
            }
            if (!par1EntityPlayer.capabilities.isCreativeMode) {
                final ItemStack itemStack2 = var2;
                --itemStack2.stackSize;
                if (var2.stackSize <= 0) {
                    par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
                }
            }
            return true;
        }
        if (this.isTamed() && var2 != null && var2.getItem() == Items.name_tag && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0 && this.func_152114_e((EntityLivingBase)par1EntityPlayer)) {
            this.setCustomNameTag(var2.getDisplayName());
            if (!par1EntityPlayer.capabilities.isCreativeMode) {
                final ItemStack itemStack3 = var2;
                --itemStack3.stackSize;
                if (var2.stackSize <= 0) {
                    par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
                }
            }
            return true;
        }
        if (this.isTamed() && this.func_152114_e((EntityLivingBase)par1EntityPlayer) && par1EntityPlayer.getDistanceSqToEntity((Entity)this) < 16.0) {
            if (!this.isSitting()) {
                this.setSitting(true);
            }
            else {
                this.setSitting(false);
            }
            return true;
        }
        return false;
    }
    
    protected String getLivingSound() {
        if (this.isSitting()) {
            return null;
        }
        return null;
    }
    
    protected String getHurtSound() {
        return "orespawn:scorpion_hit";
    }
    
    protected String getDeathSound() {
        return "orespawn:cryo_death";
    }
    
    protected float getSoundVolume() {
        return 0.4f;
    }
    
    protected Item getDropItem() {
        return Items.beef;
    }
    
    protected void dropFewItems(final boolean par1, final int par2) {
        int var3 = 0;
        if (this.isTamed()) {
            var3 = this.rand.nextInt(5);
            var3 += 2;
            for (int var4 = 0; var4 < var3; ++var4) {
                this.dropItem(Item.getItemFromBlock((Block)Blocks.red_flower), 1);
            }
        }
        else {
            super.dropFewItems(par1, par2);
        }
    }
    
    protected float getSoundPitch() {
        return this.isChild() ? ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.1f + 1.5f) : ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.1f + 1.0f);
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        boolean ret = false;
        float p2 = par2;
        if (this.isTamed() && p2 > 10.0f) {
            p2 = 10.0f;
        }
        ret = super.attackEntityFrom(par1DamageSource, p2);
        return ret;
    }
    
    public boolean getCanSpawnHere() {
        if (this.posY < 50.0) {
            return false;
        }
        if (this.posY > 100.0) {
            return false;
        }
        final Block bid = this.worldObj.getBlock((int)this.posX, (int)this.posY - 1, (int)this.posZ);
        return bid == Blocks.dirt || bid == Blocks.grass || bid == Blocks.tallgrass;
    }
    
    protected boolean canDespawn() {
        return false;
    }
    
    public EntityAgeable createChild(final EntityAgeable entityageable) {
        return (EntityAgeable)this.spawnBabyAnimal(entityageable);
    }
    
    public Gazelle spawnBabyAnimal(final EntityAgeable par1EntityAgeable) {
        return new Gazelle(this.worldObj);
    }
    
    public boolean isWheat(final ItemStack par1ItemStack) {
        return par1ItemStack != null && par1ItemStack.getItem() == Items.apple;
    }
    
    public boolean isBreedingItem(final ItemStack par1ItemStack) {
        return par1ItemStack.getItem() == OreSpawnMain.MyCrystalApple;
    }
}
