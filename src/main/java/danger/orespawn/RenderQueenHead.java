package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class RenderQueenHead extends RenderLiving
{
    public RenderQueenHead(final ModelTheQueen par1ModelBase, final float par2, final float par3) {
        super((ModelBase)par1ModelBase, par2 * par3);
    }
    
    public void renderQueenHead(final QueenHead par1EntityQueenHead, final double par2, final double par4, final double par6, final float par8, final float par9) {
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
    }
    
    protected void preRenderScale(final QueenHead par1Entity, final float par2) {
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return null;
    }
}
