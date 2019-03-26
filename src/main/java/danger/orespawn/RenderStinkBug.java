package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import net.minecraft.client.model.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderStinkBug extends RenderLiving
{
    protected ModelStinkBug model;
    private float scale;
    private static final ResourceLocation texture;
    
    public RenderStinkBug(final ModelStinkBug par1ModelBase, final float par2, final float par3) {
        super((ModelBase)par1ModelBase, par2 * par3);
        this.scale = 1.0f;
        this.model = (ModelStinkBug)this.mainModel;
        this.scale = par3;
    }
    
    public void renderStinkBug(final StinkBug par1EntityStinkBug, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender((EntityLiving)par1EntityStinkBug, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderStinkBug((StinkBug)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderStinkBug((StinkBug)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale(final StinkBug par1Entity, final float par2) {
        if (par1Entity != null && par1Entity.isChild()) {
            GL11.glScalef(this.scale / 2.0f, this.scale / 2.0f, this.scale / 2.0f);
            return;
        }
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale((StinkBug)par1EntityLiving, par2);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderStinkBug.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn", "StinkBug.png");
    }
}
