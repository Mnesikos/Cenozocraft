package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.client.renderer.entity.model.ProcoptodonModel;
import net.msrandom.cenozocraft.entity.passive.ProcoptodonEntity;

public class ProcoptodonRenderer extends CenozocraftRenderer<ProcoptodonEntity, ProcoptodonModel> {
    public ProcoptodonRenderer(EntityRenderDispatcher rendermanagerIn) {
        super(rendermanagerIn, new ProcoptodonModel(), 0.3f);
    }
}
