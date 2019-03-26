package danger.orespawn;

import net.minecraftforge.client.*;
import net.minecraft.util.*;
import net.minecraft.item.*;
import org.lwjgl.opengl.*;
import cpw.mods.fml.client.*;

public class RenderSlice implements IItemRenderer
{
    protected ModelSlice modelSlice;
    private static final ResourceLocation texture;
    
    public RenderSlice() {
        this.modelSlice = new ModelSlice();
    }
    
    public boolean handleRenderType(final ItemStack item, final IItemRenderer.ItemRenderType type) {
        switch (type) {
            case EQUIPPED: {
                return true;
            }
            case EQUIPPED_FIRST_PERSON: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    public boolean shouldUseRenderHelper(final IItemRenderer.ItemRenderType type, final ItemStack item, final IItemRenderer.ItemRendererHelper helper) {
        return true;
    }
    
    public void renderItem(final IItemRenderer.ItemRenderType type, final ItemStack item, final Object... data) {
        switch (type) {
            case EQUIPPED: {
                this.renderSwordF5(-4.0f, 2.0f, -3.0f, 0.3f);
                break;
            }
            case EQUIPPED_FIRST_PERSON: {
                this.renderSword(6.0f, 3.0f, -5.0f, 0.3f);
                break;
            }
        }
    }
    
    private void renderSword(final float x, final float y, final float z, final float scale) {
        GL11.glPushMatrix();
        GL11.glRotatef(190.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(25.0f, 0.0f, 0.0f, 1.0f);
        GL11.glScalef(scale, scale, scale);
        GL11.glTranslatef(x, y, z);
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(RenderSlice.texture);
        this.modelSlice.render();
        GL11.glPopMatrix();
    }
    
    private void renderSwordF5(final float x, final float y, final float z, final float scale) {
        GL11.glPushMatrix();
        GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(-90.0f, 0.0f, 0.0f, 1.0f);
        GL11.glScalef(scale, scale, scale);
        GL11.glTranslatef(x, y, z);
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(RenderSlice.texture);
        this.modelSlice.render();
        GL11.glPopMatrix();
    }
    
    static {
        texture = new ResourceLocation("orespawn", "Slicetexture.png");
    }
}
