package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.util.Identifier;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.client.renderer.entity.model.CaveBearModel;
import net.msrandom.cenozocraft.entity.monster.CaveBearEntity;

public class CaveBearRenderer extends CenozocraftRenderer<CaveBearEntity, CaveBearModel> {
    private final CaveBearModel adultStanding = new CaveBearModel.AdultStanding();
    private final CaveBearModel childStanding = new CaveBearModel.ChildStanding();
    private Identifier[] childTextures;

    public CaveBearRenderer(EntityRenderDispatcher rendermanagerIn) {
        super(rendermanagerIn, new CaveBearModel.Adult(), new CaveBearModel.Child(), 0.3f);
    }

    @Override
    public Identifier getTexture(CaveBearEntity entity) {
        return (entity.isBaby() ?
                (childTextures = getTextures(entity, "child", childTextures)) :
                (textures = getTextures(entity, "adult", textures)))
                [entity.getVariant()];
    }

    @Override
    protected CaveBearModel getModel(CaveBearEntity entity) {
        if (entity.isStanding()) {
            if (entity.isBaby()) return childStanding;
            else return adultStanding;
        }

        return super.getModel(entity);
    }
}
