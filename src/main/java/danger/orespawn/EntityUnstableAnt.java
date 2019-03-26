package danger.orespawn;

import net.minecraft.entity.ai.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.server.*;
import net.minecraft.world.*;

public class EntityUnstableAnt extends EntityAnt
{
    public EntityUnstableAnt(final World par1World) {
        super(par1World);
        this.setSize(0.1f, 0.1f);
        this.experienceValue = 0;
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.399999976158142));
        this.tasks.addTask(1, (EntityAIBase)new MyEntityAIWanderALot((EntityCreature)this, 9, 1.0));
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue((double)this.mygetMaxHealth());
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(0.0);
    }
    
    @Override
    public boolean interact(final EntityPlayer par1EntityPlayer) {
        if (par1EntityPlayer == null) {
            return false;
        }
        if (!(par1EntityPlayer instanceof EntityPlayerMP)) {
            return false;
        }
        ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
        if (var2 != null && var2.stackSize <= 0) {
            par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
            var2 = null;
        }
        if (var2 != null) {
            return false;
        }
        if (par1EntityPlayer.dimension != OreSpawnMain.DimensionID4) {
            MinecraftServer.getServer().getConfigurationManager().transferPlayerToDimension((EntityPlayerMP)par1EntityPlayer, OreSpawnMain.DimensionID4, (Teleporter)new OreSpawnTeleporter(MinecraftServer.getServer().worldServerForDimension(OreSpawnMain.DimensionID4), OreSpawnMain.DimensionID4, this.worldObj));
        }
        else {
            MinecraftServer.getServer().getConfigurationManager().transferPlayerToDimension((EntityPlayerMP)par1EntityPlayer, 0, (Teleporter)new OreSpawnTeleporter(MinecraftServer.getServer().worldServerForDimension(0), 0, this.worldObj));
        }
        return true;
    }
}
