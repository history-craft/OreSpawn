package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraft.world.*;
import net.minecraft.entity.item.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class ItemWrench extends Item
{
    public ItemWrench(final int i) {
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setMaxDamage(100);
    }
    
    public boolean onLeftClickEntity(final ItemStack stack, final EntityPlayer player, final Entity entity) {
        if (entity != null && entity instanceof SpiderRobot && entity.riddenByEntity == null) {
            final EntityLiving e = (EntityLiving)entity;
            final float h = e.getMaxHealth() - e.getHealth();
            e.setDead();
            this.dropItem(player.worldObj, e, OreSpawnMain.SpiderRobotKit, 1, (int)h);
            for (int var3 = 0; var3 < 8; ++var3) {
                float f1 = player.worldObj.rand.nextFloat() * 3.0f - player.worldObj.rand.nextFloat() * 3.0f;
                float f2 = 0.25f + player.worldObj.rand.nextFloat() * 2.0f;
                float f3 = player.worldObj.rand.nextFloat() * 3.0f - player.worldObj.rand.nextFloat() * 3.0f;
                player.worldObj.spawnParticle("smoke", (double)((float)entity.posX + f1), (double)((float)entity.posY + f2), (double)((float)entity.posZ + f3), 0.0, 0.0, 0.0);
                f1 = player.worldObj.rand.nextFloat() * 3.0f - player.worldObj.rand.nextFloat() * 3.0f;
                f2 = 0.25f + player.worldObj.rand.nextFloat() * 2.0f;
                f3 = player.worldObj.rand.nextFloat() * 3.0f - player.worldObj.rand.nextFloat() * 3.0f;
                player.worldObj.spawnParticle("explode", (double)((float)entity.posX + f1), (double)((float)entity.posY + f2), (double)((float)entity.posZ + f3), 0.0, 0.0, 0.0);
                f1 = player.worldObj.rand.nextFloat() * 3.0f - player.worldObj.rand.nextFloat() * 3.0f;
                f2 = 0.25f + player.worldObj.rand.nextFloat() * 2.0f;
                f3 = player.worldObj.rand.nextFloat() * 3.0f - player.worldObj.rand.nextFloat() * 3.0f;
                player.worldObj.spawnParticle("reddust", (double)((float)entity.posX + f1), (double)((float)entity.posY + f2), (double)((float)entity.posZ + f3), 0.0, 0.0, 0.0);
            }
            player.worldObj.playSoundAtEntity((Entity)player, "random.explode", 0.5f, 1.5f);
        }
        else {
            if (entity == null || !(entity instanceof AntRobot) || entity.riddenByEntity != null) {
                return false;
            }
            final AntRobot e2 = (AntRobot)entity;
            if (e2.getOwned() == 0) {
                if (e2.getHealth() / e2.getMaxHealth() > 0.5f) {
                    return false;
                }
                e2.setOwned();
            }
            final float h = e2.getMaxHealth() - e2.getHealth();
            e2.setDead();
            this.dropItem(player.worldObj, e2, OreSpawnMain.AntRobotKit, 1, (int)h);
            for (int var3 = 0; var3 < 8; ++var3) {
                float f1 = player.worldObj.rand.nextFloat() * 3.0f - player.worldObj.rand.nextFloat() * 3.0f;
                float f2 = 0.25f + player.worldObj.rand.nextFloat() * 2.0f;
                float f3 = player.worldObj.rand.nextFloat() * 3.0f - player.worldObj.rand.nextFloat() * 3.0f;
                player.worldObj.spawnParticle("smoke", (double)((float)entity.posX + f1), (double)((float)entity.posY + f2), (double)((float)entity.posZ + f3), 0.0, 0.0, 0.0);
                f1 = player.worldObj.rand.nextFloat() * 3.0f - player.worldObj.rand.nextFloat() * 3.0f;
                f2 = 0.25f + player.worldObj.rand.nextFloat() * 2.0f;
                f3 = player.worldObj.rand.nextFloat() * 3.0f - player.worldObj.rand.nextFloat() * 3.0f;
                player.worldObj.spawnParticle("explode", (double)((float)entity.posX + f1), (double)((float)entity.posY + f2), (double)((float)entity.posZ + f3), 0.0, 0.0, 0.0);
                f1 = player.worldObj.rand.nextFloat() * 3.0f - player.worldObj.rand.nextFloat() * 3.0f;
                f2 = 0.25f + player.worldObj.rand.nextFloat() * 2.0f;
                f3 = player.worldObj.rand.nextFloat() * 3.0f - player.worldObj.rand.nextFloat() * 3.0f;
                player.worldObj.spawnParticle("reddust", (double)((float)entity.posX + f1), (double)((float)entity.posY + f2), (double)((float)entity.posZ + f3), 0.0, 0.0, 0.0);
            }
            player.worldObj.playSoundAtEntity((Entity)player, "random.explode", 0.5f, 1.5f);
        }
        stack.damageItem(2, (EntityLivingBase)player);
        if (stack.stackSize <= 0) {
            player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
        }
        return true;
    }
    
    private void dropItem(final World world, final EntityLiving e, final Item index, final int par1, final int par2) {
        if (world.isRemote) {
            return;
        }
        final ItemStack is = new ItemStack(index, par1, 0);
        is.setItemDamage(par2);
        final EntityItem var3 = new EntityItem(world, e.posX, e.posY + 1.0, e.posZ, is);
        world.spawnEntityInWorld((Entity)var3);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
