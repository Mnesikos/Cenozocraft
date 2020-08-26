package rando.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import rando.cenozocraft.client.model.ModelIrishElk;
import rando.cenozocraft.client.renderer.CenozocraftRenderer;
import rando.cenozocraft.common.entity.monster.EntityIrishElk;

import javax.annotation.Nonnull;

public class RenderIrishElk extends CenozocraftRenderer<EntityIrishElk> {

    public RenderIrishElk(RenderManager renderManagerIn) {
        super(renderManagerIn, new ModelIrishElk(), 0.3F);
    }
}
