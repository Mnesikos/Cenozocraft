package rando.cenozocraft.client.renderer.entity;

import net.minecraft.client.model.ModelArmorStand;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import rando.cenozocraft.common.entity.passive.EntityIrishElk;

import javax.annotation.Nonnull;

public class RenderIrishElk extends RenderLiving<EntityIrishElk> {

    public RenderIrishElk(RenderManager renderManagerIn) {
        super(renderManagerIn, new ModelArmorStand(), 1.0F);
    }

    @Override
    protected ResourceLocation getEntityTexture(@Nonnull EntityIrishElk entity) {
        return null;
    }
}
