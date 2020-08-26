package rando.cenozocraft.common.util;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;

public class CenozocraftUtils {

    public static void simpleRender(ModelRenderer part, float originalScale, double scaleDown) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(part.offsetX, part.offsetY, part.offsetZ);
        GlStateManager.translate(part.rotationPointX * originalScale, part.rotationPointY * originalScale, part.rotationPointZ * originalScale);
        GlStateManager.scale(scaleDown, scaleDown, scaleDown);
        GlStateManager.translate(-part.offsetX, -part.offsetY, -part.offsetZ);
        GlStateManager.translate(-part.rotationPointX * originalScale, -part.rotationPointY * originalScale, -part.rotationPointZ * originalScale);
        part.render(originalScale);
        GlStateManager.popMatrix();
    }
}
