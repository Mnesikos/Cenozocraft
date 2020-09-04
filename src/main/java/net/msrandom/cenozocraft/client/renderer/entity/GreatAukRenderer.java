package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.util.Identifier;
import net.msrandom.cenozocraft.CenozoCraft;
import net.msrandom.cenozocraft.client.renderer.entity.model.GreatAukModel;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.passive.GreatAukEntity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class GreatAukRenderer extends CenozocraftRenderer<GreatAukEntity> {
    private static final Identifier ADULT = new Identifier(CenozoCraft.MOD_ID, "textures/entity/great_auk/adult.png");
    private static final Identifier CHILD = new Identifier(CenozoCraft.MOD_ID, "textures/entity/great_auk/child.png");

    public GreatAukRenderer(EntityRenderDispatcher rendermanagerIn) {
        super(rendermanagerIn,  new GreatAukModel.Adult(), new GreatAukModel.Child(), 0.3f);
    }

    @Nullable
    @Override
    protected Identifier getTexture(@Nonnull GreatAukEntity entity) {
        return entity.isChild() ? CHILD : ADULT;
    }
}

