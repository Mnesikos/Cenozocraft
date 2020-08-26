package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import net.msrandom.cenozocraft.client.renderer.entity.model.ModelProcoptodon;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.passive.EntityProcoptodon;

public class RenderProcoptodon extends CenozocraftRenderer<EntityProcoptodon> {
    public RenderProcoptodon(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelProcoptodon(), 0.3f);
    }
}
