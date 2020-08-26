package rando.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import rando.cenozocraft.client.model.ModelProcoptodon;
import rando.cenozocraft.client.renderer.CenozocraftRenderer;
import rando.cenozocraft.common.entity.passive.EntityProcoptodon;

public class RenderProcoptodon extends CenozocraftRenderer<EntityProcoptodon> {
    public RenderProcoptodon(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelProcoptodon(), 0.3f);
    }
}
