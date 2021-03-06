package org.avp.items.render;

import org.lwjgl.opengl.GL11;

import com.arisux.amdxlib.lib.client.Model;
import com.arisux.amdxlib.lib.client.TexturedModel;
import com.arisux.amdxlib.lib.client.render.Draw;
import com.arisux.amdxlib.lib.client.render.OpenGL;
import com.arisux.amdxlib.lib.client.render.ItemRenderer;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.item.ItemStack;

public class ItemRendererGroup extends ItemRenderer
{
    private ModelRenderer[] modelRenderers;

    public ItemRendererGroup(TexturedModel<? extends Model> model, ModelRenderer... modelRenderers)
    {
        super(model);
        this.modelRenderers = modelRenderers;
    }
    
    private ItemRendererGroup(TexturedModel<? extends Model> model)
    {
        super(model);
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data)
    {
        super.renderItem(type, item, data);
    }

    @Override
    public void renderInWorld(ItemStack item, Object... data)
    {
        this.renderPart();
    }

    @Override
    public void renderThirdPerson(ItemStack item, Object... data)
    {
        this.renderPart();
    }

    @Override
    public void renderFirstPerson(ItemStack item, Object... data)
    {
        this.renderPart();
    }

    @Override
    public void renderInInventory(ItemStack item, Object... data)
    {
        this.renderPart();
    }

    public void renderPart()
    {
        OpenGL.blendClear();
        OpenGL.enable(GL11.GL_BLEND);
        OpenGL.disable(GL11.GL_CULL_FACE);
        this.getModelTexMap().getTexture().bind();
        Model.draw(this.modelRenderers);
    }

    public static void drawMarker(int size)
    {
        OpenGL.pushMatrix();
        Draw.drawRect(-(size / 2), 0, size, 1, 0xFFFF0000);
        OpenGL.rotate(90F, 0F, 0F, 1F);
        Draw.drawRect(-(size / 2), 0, size, 1, 0xFFFF0000);
        OpenGL.rotate(90F, 0F, 1F, 0F);
        OpenGL.translate(0F, 0F, 0.5F);
        Draw.drawRect(-(size / 2), 0, size, 1, 0xFFFF0000);
        OpenGL.popMatrix();
    }
}
