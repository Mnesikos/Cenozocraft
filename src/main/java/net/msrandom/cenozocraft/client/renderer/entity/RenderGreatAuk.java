package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.msrandom.cenozocraft.Cenozocraft;
import net.msrandom.cenozocraft.client.renderer.entity.model.ModelGreatAuk;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.passive.EntityGreatAuk;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class RenderGreatAuk extends CenozocraftRenderer<EntityGreatAuk> {
    private static final ResourceLocation ADULT = new ResourceLocation(Cenozocraft.MOD_ID, "textures/entity/great_auk/adult.png");
    private static final ResourceLocation CHILD = new ResourceLocation(Cenozocraft.MOD_ID, "textures/entity/great_auk/child.png");

    public RenderGreatAuk(RenderManager rendermanagerIn) {
        super(rendermanagerIn,  new ModelGreatAuk.Adult(), new ModelGreatAuk.Child(), 0.3f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(@Nonnull EntityGreatAuk entity) {
        return entity.isChild() ? CHILD : ADULT;
    }
}

