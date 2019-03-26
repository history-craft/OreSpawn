package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.enchantment.*;
import net.minecraft.block.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.*;
import net.minecraft.init.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class UltimatePickaxe extends ItemPickaxe
{
    private int weaponDamage;
    
    public UltimatePickaxe(final int par1, final Item.ToolMaterial par2) {
        super(par2);
        this.weaponDamage = 15;
        this.maxStackSize = 1;
        this.setMaxDamage(3000);
        this.setCreativeTab(CreativeTabs.tabTools);
    }
    
    public void onCreated(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        par1ItemStack.addEnchantment(Enchantment.efficiency, 5);
        par1ItemStack.addEnchantment(Enchantment.fortune, 5);
    }
    
    public void onUsingTick(final ItemStack stack, final EntityPlayer player, final int count) {
        final int lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.efficiency.effectId, stack);
        if (lvl <= 0) {
            stack.addEnchantment(Enchantment.efficiency, 5);
            stack.addEnchantment(Enchantment.fortune, 5);
        }
    }
    
    public void onUpdate(final ItemStack stack, final World par2World, final Entity par3Entity, final int par4, final boolean par5) {
        this.onUsingTick(stack, null, 0);
    }
    
    public boolean canHarvestBlock(final Block par1Block) {
        return true;
    }
    
    public int getDamageVsEntity(final Entity par1Entity) {
        if (par1Entity instanceof Girlfriend) {
            return 1;
        }
        if (par1Entity instanceof Boyfriend) {
            return 1;
        }
        if (par1Entity instanceof EntityPlayer) {
            return 1;
        }
        return this.weaponDamage;
    }
    
    public boolean onLeftClickEntity(final ItemStack stack, final EntityPlayer player, final Entity entity) {
        if (entity != null && OreSpawnMain.ultimate_sword_pvp == 0) {
            if (entity instanceof EntityPlayer || entity instanceof Girlfriend || entity instanceof Boyfriend) {
                return true;
            }
            if (entity instanceof EntityTameable) {
                final EntityTameable t = (EntityTameable)entity;
                if (t.isTamed()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private ItemStack dropItemAnItem(final World world, final int x, final int y, final int z, final Item index, final int par1) {
        EntityItem var3 = null;
        final ItemStack is = new ItemStack(index, par1, 0);
        var3 = new EntityItem(world, (double)x, (double)y, (double)z, is);
        if (var3 != null) {
            world.spawnEntityInWorld((Entity)var3);
        }
        return is;
    }
    
    public boolean onBlockDestroyed(final ItemStack par1ItemStack, final World par2World, final Block par3, final int par4, final int par5, final int par6, final EntityLivingBase par7EntityLivingBase) {
        if (par3.getBlockHardness(par2World, par4, par5, par6) != 0.0) {
            par1ItemStack.damageItem(1, par7EntityLivingBase);
        }
        if (!par2World.isRemote) {
            if (par3 == Blocks.iron_ore && par2World.rand.nextInt(2) != 0) {
                this.dropItemAnItem(par2World, par4, par5, par6, Items.iron_ingot, 1 + par2World.rand.nextInt(2));
            }
            if (par3 == Blocks.gold_ore && par2World.rand.nextInt(2) != 0) {
                this.dropItemAnItem(par2World, par4, par5, par6, Items.gold_ingot, 1 + par2World.rand.nextInt(2));
            }
            if (par3 == Blocks.stone && par2World.rand.nextInt(100) == 2) {
                final int i = par2World.rand.nextInt(10);
                if (i == 0) {
                    this.dropItemAnItem(par2World, par4, par5, par6, Items.diamond, 1);
                }
                if (i == 1) {
                    this.dropItemAnItem(par2World, par4, par5, par6, Items.emerald, 1);
                }
                if (i == 2) {
                    this.dropItemAnItem(par2World, par4, par5, par6, OreSpawnMain.MyAmethyst, 1);
                }
                if (i == 3) {
                    this.dropItemAnItem(par2World, par4, par5, par6, OreSpawnMain.MyRuby, 1);
                }
                if (i == 4) {
                    this.dropItemAnItem(par2World, par4, par5, par6, OreSpawnMain.UraniumNugget, 1);
                }
                if (i == 5) {
                    this.dropItemAnItem(par2World, par4, par5, par6, OreSpawnMain.TitaniumNugget, 1);
                }
            }
        }
        return true;
    }
    
    public String getMaterialName() {
        return "Uranium/Titanium";
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
