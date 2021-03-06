package danger.orespawn;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import net.minecraft.client.model.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;

public class RenderSpitBug extends RenderLiving
{
    protected ModelSpitBug model;
    private float scale;
    private static final ResourceLocation texture;
    
    public RenderSpitBug(final ModelSpitBug par1ModelBase, final float par2, final float par3) {
        super((ModelBase)par1ModelBase, par2 * par3);
        this.scale = 1.0f;
        this.model = (ModelSpitBug)this.mainModel;
        this.scale = par3;
    }
    
    public void renderSpitBug(final SpitBug par1EntitySpitBug, final double par2, final double par4, final double par6, final float par8, final float par9) {
        super.doRender((EntityLiving)par1EntitySpitBug, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderSpitBug((SpitBug)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.renderSpitBug((SpitBug)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected void preRenderScale(final SpitBug par1Entity, final float par2) {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    
    protected void preRenderCallback(final EntityLivingBase par1EntityLiving, final float par2) {
        this.preRenderScale((SpitBug)par1EntityLiving, par2);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderSpitBug.texture;
    }
    
    static {
        texture = new ResourceLocation("orespawn", "BlisterBug.png");
    }
}
