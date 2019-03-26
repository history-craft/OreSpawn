package danger.orespawn;

import net.minecraft.world.*;

public class RubyBird extends Cockateil
{
    public RubyBird(final World par1World) {
        super(par1World);
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.setBirdType(this.birdtype = 5);
        this.setFlyUp();
    }
    
    @Override
    protected String getLivingSound() {
        if (this.worldObj.isDaytime() && !this.worldObj.isRaining()) {
            return "orespawn:rubybird";
        }
        return null;
    }
    
    @Override
    public boolean getCanSpawnHere() {
        return true;
    }
}
