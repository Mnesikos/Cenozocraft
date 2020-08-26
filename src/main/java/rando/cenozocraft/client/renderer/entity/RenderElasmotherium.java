package rando.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import rando.cenozocraft.client.model.ModelElasmotherium;
import rando.cenozocraft.client.renderer.CenozocraftRenderer;
import rando.cenozocraft.common.entity.passive.EntityElasmotherium;

public class RenderElasmotherium extends CenozocraftRenderer<EntityElasmotherium> {
    public RenderElasmotherium(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelElasmotherium(), 0.3f);
    }
}

