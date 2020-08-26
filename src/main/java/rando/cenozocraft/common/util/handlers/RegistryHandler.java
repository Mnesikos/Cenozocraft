package rando.cenozocraft.common.util.handlers;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import rando.cenozocraft.client.renderer.entity.*;
import rando.cenozocraft.common.entity.monster.*;
import rando.cenozocraft.common.entity.passive.*;
import rando.cenozocraft.common.init.CenozocraftEntities;
import rando.cenozocraft.common.util.CenozocraftReference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = CenozocraftReference.ID)
public class RegistryHandler {

    @SubscribeEvent
    public static void registerEntities(RegistryEvent.Register<EntityEntry> event){
        List<EntityEntry> list = new ArrayList<>();
        CenozocraftEntities.LIST.sort(Comparator.comparing(registryEntry -> registryEntry.name));
        for(CenozocraftEntities.RegistryEntry entry : CenozocraftEntities.LIST) {
            EntityEntryBuilder entity = EntityEntryBuilder.create().entity(entry.cls).id(entry.name, CenozocraftEntities.entityId++).name(entry.name).tracker(80, 1, true);
            if(entry.egg != null) entity.egg(entry.egg.primary, entry.egg.secondry);
            if(entry.spawn != null) entity.spawn(entry.spawn.type, entry.spawn.weight, entry.spawn.min, entry.spawn.max, entry.spawn.biomes);
            list.add(entity.build());
        }
        event.getRegistry().registerAll(list.toArray(new EntityEntry[0]));
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntitySmilodon.class, RenderSmilodon::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityAurochs.class, RenderAurochs::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityCaveBear.class, RenderCaveBear::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityCaveLion.class, RenderCaveLion::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityDireWolf.class, RenderDireWolf::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityDodo.class, RenderDodo::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityElasmotherium.class, RenderElasmotherium::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityGiantBeaver.class, RenderGiantBeaver::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityGreatAuk.class, RenderGreatAuk::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHouseMouse.class, RenderHouseMouse::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityIrishElk.class, RenderIrishElk::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityMegatherium.class, RenderMegatherium::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityProcoptodon.class, RenderProcoptodon::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityQuagga.class, RenderQuagga::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityThylacine.class, RenderThylacine::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTitanis.class, RenderTitanis::new);
    }
}
