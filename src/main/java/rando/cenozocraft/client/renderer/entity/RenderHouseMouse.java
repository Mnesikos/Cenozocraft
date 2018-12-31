package rando.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import rando.cenozocraft.client.model.ModelHouseMouse;
import rando.cenozocraft.common.entity.passive.EntityHouseMouse;
import rando.cenozocraft.common.util.CenozocraftUtil;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class RenderHouseMouse extends RenderLiving<EntityHouseMouse> {

    private RenderHouseMouse(RenderManager renderManagerIn) {
        super(renderManagerIn, new ModelHouseMouse(), 0.0F);
    }

    protected void preRenderCallback(EntityHouseMouse entity, float partialTickTime) {
        GlStateManager.scale(2.5F, 2.5F, 2.5F);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(@Nonnull EntityHouseMouse entity) {
        switch (entity.getVariant()) {
            case 0: default: return texture("light_brown");
            case 1: return texture("dark_brown");
            case 2: return texture("albino");
        }
    }

    private ResourceLocation texture(String name){
        return CenozocraftUtil.getTextureLocation("house_mouse", name);
    }

    public static class RenderFactory implements IRenderFactory<EntityHouseMouse>{

        @Override
        public Render<? super EntityHouseMouse> createRenderFor(RenderManager manager) {
            return new RenderHouseMouse(manager);
        }
    }
}
