package org.avp.items.render;

import org.avp.AliensVsPredator;
import org.lwjgl.opengl.GL11;

import com.arisux.amdxlib.lib.client.render.OpenGL;
import com.arisux.amdxlib.lib.client.render.ItemRenderer;

import net.minecraft.item.ItemStack;

public class RenderItemGunLocker extends ItemRenderer
{
    public RenderItemGunLocker()
    {
        super(AliensVsPredator.resources().models().GUN_LOCKER);
    }

    @Override
    public void renderThirdPerson(ItemStack item, Object... data)
    {
        OpenGL.pushMatrix();
        {
            OpenGL.scale(-1F, 1F, 1F);
            OpenGL.rotate(90F, 0F, 0F, 1F);
            OpenGL.rotate(-45F, 0F, 1F, 0F);
            OpenGL.rotate(90F, 1F, 0F, 0F);
            OpenGL.translate(0F, -0.5F, -0.9F);
            OpenGL.disable(GL11.GL_CULL_FACE);
            OpenGL.disable(GL11.GL_CULL_FACE);
            this.getModelTexMap().draw();
        }
        OpenGL.popMatrix();
    }

    @Override
    public void renderFirstPerson(ItemStack item, Object... data)
    {
        OpenGL.pushMatrix();
        {
            OpenGL.disable(GL11.GL_CULL_FACE);
            this.getModelTexMap().draw();
        }
        OpenGL.popMatrix();
    }

    @Override
    public void renderInInventory(ItemStack item, Object... data)
    {
        OpenGL.pushMatrix();
        {
            float glScale = 8F;
            OpenGL.disable(GL11.GL_CULL_FACE);
            OpenGL.translate(8F, 4F, 0F);
            OpenGL.rotate(0F, 1.0F, 0.0F, 0.0F);
            OpenGL.scale(glScale, glScale, glScale);
            OpenGL.enableLight();
            this.getModelTexMap().draw();
            OpenGL.disableLight();
        }
        OpenGL.popMatrix();
    }
}
