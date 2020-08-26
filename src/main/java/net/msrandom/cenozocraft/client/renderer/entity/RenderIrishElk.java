package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import net.msrandom.cenozocraft.client.renderer.entity.model.ModelIrishElk;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.monster.EntityIrishElk;

public class RenderIrishElk extends CenozocraftRenderer<EntityIrishElk> {

    public RenderIrishElk(RenderManager renderManagerIn) {
        super(renderManagerIn, new ModelIrishElk(), 0.3F);
    }
}
