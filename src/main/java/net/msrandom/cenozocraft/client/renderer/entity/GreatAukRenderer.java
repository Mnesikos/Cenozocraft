package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.util.Identifier;
import net.msrandom.cenozocraft.CenozoCraft;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.client.renderer.entity.model.GreatAukModel;
import net.msrandom.cenozocraft.entity.passive.GreatAukEntity;

public class GreatAukRenderer extends CenozocraftRenderer<GreatAukEntity, GreatAukModel> {
    private static final Identifier ADULT = new Identifier(CenozoCraft.MOD_ID, "textures/entity/great_auk/adult.png");
    private static final Identifier CHILD = new Identifier(CenozoCraft.MOD_ID, "textures/entity/great_auk/child.png");

    public GreatAukRenderer(EntityRenderDispatcher rendermanagerIn) {
        super(rendermanagerIn,  new GreatAukModel.Adult(), new GreatAukModel.Child(), 0.3f);
    }

    @Override
    public Identifier getTexture(GreatAukEntity entity) {
        return entity.isBaby() ? CHILD : ADULT;
    }
}

