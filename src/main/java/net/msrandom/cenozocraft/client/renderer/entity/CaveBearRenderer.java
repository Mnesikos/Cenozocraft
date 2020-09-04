package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.util.Identifier;
import net.msrandom.cenozocraft.client.renderer.entity.model.CaveBearModel;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.monster.CaveBearEntity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class CaveBearRenderer extends CenozocraftRenderer<CaveBearEntity, CaveBearModel> {
    private final CaveBearModel adultStanding = new CaveBearModel.AdultStanding();
    private final CaveBearModel childStanding = new CaveBearModel.ChildStanding();
    private Identifier[] childTextures;

    public CaveBearRenderer(EntityRenderDispatcher rendermanagerIn) {
        super(rendermanagerIn, new CaveBearModel.Adult(), new CaveBearModel.Child(), 0.3f);
    }

    @Nullable
    @Override
    protected Identifier getTexture(@Nonnull CaveBearEntity entity) {
        return (entity.isChild() ?
                (childTextures = getTextures(entity, "child", childTextures)) :
                (textures = getTextures(entity, "adult", textures)))
                [entity.getVariant()];
    }

    @Override
    protected ModelBase getModel(CaveBearEntity entity) {
        if(entity.isStanding()) {
            if(entity.isChild()) return childStanding;
            else return adultStanding;
        }

        return super.getModel(entity);
    }
}
