package net.msrandom.cenozocraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.entity.EntityType;
import net.msrandom.cenozocraft.client.renderer.entity.*;
import net.msrandom.cenozocraft.entity.CenozoCraftEntities;
import net.msrandom.cenozocraft.entity.CenozoCraftEntityBase;

import java.util.function.Function;

public class CenozoCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        registerRenderer(CenozoCraftEntities.POPULATOR_SMILODON, SmilodonRenderer::new);
        registerRenderer(CenozoCraftEntities.FATALIS_SMILODON, SmilodonRenderer::new);
        registerRenderer(CenozoCraftEntities.GRACILIS_SMILODON, SmilodonRenderer::new);
        registerRenderer(CenozoCraftEntities.AUROCHS, AurochsRenderer::new);
        registerRenderer(CenozoCraftEntities.CAVEBEAR, CaveBearRenderer::new);
        registerRenderer(CenozoCraftEntities.CAVELION, CaveLionRenderer::new);
        registerRenderer(CenozoCraftEntities.DIREWOLF, DireWolfRenderer::new);
        registerRenderer(CenozoCraftEntities.DODO, DodoRenderer::new);
        registerRenderer(CenozoCraftEntities.ELASMOTHERIUM, ElasmotheriumRenderer::new);
        registerRenderer(CenozoCraftEntities.GIANT_BEAVER, GiantBeaverRenderer::new);
        registerRenderer(CenozoCraftEntities.GREAT_AUK, GreatAukRenderer::new);
        registerRenderer(CenozoCraftEntities.HOUSE_MOUSE, HouseMouseRenderer::new);
        registerRenderer(CenozoCraftEntities.IRISH_ELK, IrishElkRenderer::new);
        registerRenderer(CenozoCraftEntities.MEGATHERIUM, MegatheriumRenderer::new);
        registerRenderer(CenozoCraftEntities.PROCOPTODON, ProcoptodonRenderer::new);
        registerRenderer(CenozoCraftEntities.QUAGGA, QuaggaRenderer::new);
        registerRenderer(CenozoCraftEntities.THYLACINE, ThylacineRenderer::new);
        registerRenderer(CenozoCraftEntities.TITANIS, TitanisRenderer::new);
    }

    private <T extends CenozoCraftEntityBase> void registerRenderer(EntityType<T> type, Function<EntityRenderDispatcher, ? extends EntityRenderer<T>> renderer) {
        EntityRendererRegistry.INSTANCE.register(type, (dispatcher, context) -> renderer.apply(dispatcher));
    }
}
