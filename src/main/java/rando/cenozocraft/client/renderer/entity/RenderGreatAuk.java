package rando.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import rando.cenozocraft.client.model.ModelGreatAuk;
import rando.cenozocraft.client.renderer.CenozocraftRenderer;
import rando.cenozocraft.common.entity.passive.EntityGreatAuk;
import rando.cenozocraft.common.util.CenozocraftReference;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class RenderGreatAuk extends CenozocraftRenderer<EntityGreatAuk> {

    private static final ResourceLocation ADULT = new ResourceLocation(CenozocraftReference.ID, "textures/entity/great_auk/adult.png");
    private static final ResourceLocation CHILD = new ResourceLocation(CenozocraftReference.ID, "textures/entity/great_auk/child.png");

    public RenderGreatAuk(RenderManager rendermanagerIn) {
        super(rendermanagerIn,  new ModelGreatAuk.Adult(), new ModelGreatAuk.Child(), 0.3f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(@Nonnull EntityGreatAuk entity) {
        return entity.isChild() ? CHILD : ADULT;
    }
}

