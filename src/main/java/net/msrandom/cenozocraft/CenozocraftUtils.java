package net.msrandom.cenozocraft;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;

public class CenozocraftUtils {
    //TODO see what can be done about this
    public static void scale(ModelRenderer part, double scale) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(part.rotationPointX * 0.625f, part.rotationPointY * 0.625f, part.rotationPointZ * 0.625f);
        GlStateManager.scale(scale, scale, scale);
        GlStateManager.translate(-part.rotationPointX * 0.625f, -part.rotationPointY * 0.625f, -part.rotationPointZ * 0.625f);
        part.render(0.625f);
        GlStateManager.popMatrix();
    }
}
