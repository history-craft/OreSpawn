package danger.orespawn;

import net.minecraft.block.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.entity.*;

public class PortalBlock extends BlockPortal
{
    public PortalBlock(final int i, final int j) {
    }
    
    public void updateTick(final World par1World, final int par2, final int par3, final int par4, final Random par5Random) {
    }
    
    public boolean tryToCreatePortal(final World par1World, final int par2, final int par3, final int par4) {
        return false;
    }
    
    public void onNeighborBlockChange(final World par1World, final int par2, final int par3, final int par4, final int par5) {
    }
    
    public void onEntityCollidedWithBlock(final World par1World, final int par2, final int par3, final int par4, final Entity entity) {
    }
}
