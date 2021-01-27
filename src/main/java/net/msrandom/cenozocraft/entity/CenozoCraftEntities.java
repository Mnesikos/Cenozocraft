package net.msrandom.cenozocraft.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.msrandom.cenozocraft.CenozoCraft;
import net.msrandom.cenozocraft.entity.monster.*;
import net.msrandom.cenozocraft.entity.passive.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CenozoCraftEntities {
    public static final EntityType<AurochsEntity> AUROCHS = create("aurochs", AurochsEntity::new, 2.0F, 2.0F, 0x5c503f, 0x877754);
    public static final EntityType<CaveBearEntity> CAVE_BEAR = create("cave_bear", CaveBearEntity::new, 1.8F, 2.0F, 0x5c503f, 0x877754);
//    public static final EntityType<CaveHyenaEntity> CAVE_HYENA = create("cave_hyena", CaveHyenaEntity::new, 1.5F, 1.6F, 0x5c503f, 0x877754);
    public static final EntityType<CaveLionEntity> CAVE_LION = create("cave_lion", CaveLionEntity::new, 1.5F, 1.6F, 0x5c503f, 0x877754);
    public static final EntityType<DireWolfEntity> DIRE_WOLF = create("dire_wolf", DireWolfEntity::new, 1.3F, 1.2F, 0x5c503f, 0x877754);
    public static final EntityType<DodoEntity> DODO = create("dodo", DodoEntity::new, 0.5F, 0.5F, 0x5c503f, 0x877754);
    public static final EntityType<ElasmotheriumEntity> ELASMOTHERIUM = create("elasmotherium", ElasmotheriumEntity::new, 3.5F, 3.0F, 0x5c503f, 0x877754);
    public static final EntityType<GiantBeaverEntity> GIANT_BEAVER = create("giant_beaver", GiantBeaverEntity::new, 1.0F, 1.0F, 0x5c503f, 0x877754);
//    public static final EntityType<GigantopithecusEntity> GIGANTOPITHECUS = create("gigantopithecus", GigantopithecusEntity::new, 1.5F, 2.5F, 0x5c503f, 0x877754);
    public static final EntityType<GreatAukEntity> GREAT_AUK = create("great_auk", GreatAukEntity::new, 0.8F, 1.5F, 0x5c503f, 0x877754);
    public static final EntityType<HouseMouseEntity> HOUSE_MOUSE = create("house_mouse", HouseMouseEntity::new, 0.3f, 0.3f, 0x5c503f, 0x877754);
    public static final EntityType<IrishElkEntity> IRISH_ELK = create("irish_elk", IrishElkEntity::new, 1.0F, 1.0F, 0x5c503f, 0x877754);
    public static final EntityType<MegatheriumEntity> MEGATHERIUM = create("megatherium", MegatheriumEntity::new, 2.0F, 2.0F, 0x5c503f, 0x877754);
    public static final EntityType<ProcoptodonEntity> PROCOPTODON = create("procoptodon", ProcoptodonEntity::new, 1.0F, 2.0F, 0x5c503f, 0x877754);
    public static final EntityType<QuaggaEntity> QUAGGA = create("quagga", QuaggaEntity::new, 2.5F, 2.5F, 0x5c503f, 0x877754);
    public static final EntityType<SmilodonEntity.Populator> SMILODON_POPULATOR = create("smilodon_populator", SmilodonEntity.Populator::new, 1.6F, 1.6F, 0x5C503F, 0x877754);
    public static final EntityType<SmilodonEntity.Fatalis> SMILODON_FATALIS = create("smilodon_fatalis", SmilodonEntity.Fatalis::new, 1.4F, 1.4F, 0x5C503F, 0x877754);
    public static final EntityType<SmilodonEntity.Gracilis> SMILODON_GRACILIS = create("smilodon_gracilis", SmilodonEntity.Gracilis::new, 1.2F, 1.2F, 0x5C503F, 0x877754);
    public static final EntityType<ThylacineEntity> THYLACINE = create("thylacine", ThylacineEntity::new, 1.0F, 0.5F, 0x5c503f, 0x877754);
    public static final EntityType<TitanisEntity> TITANIS = create("titanis", TitanisEntity::new, 1.0F, 0.5F, 0x5c503f, 0x877754);

    private static <T extends CenozoCraftEntityBase> EntityType<T> create(String name, EntityType.EntityFactory<T> factory, float width, float height, int eggPrimary, int eggSecondary) {
        EntityType<T> type = FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, factory).dimensions(EntityDimensions.changing(width, height)).trackable(80, 3).build();
        Registry.register(Registry.ENTITY_TYPE, new Identifier(CenozoCraft.MOD_ID, name), type);
        Registry.register(Registry.ITEM, new Identifier(CenozoCraft.MOD_ID, name + "_spawn_egg"), new SpawnEggItem(type, eggPrimary, eggSecondary, new Item.Settings().group(ItemGroup.MISC)));
        FabricDefaultAttributeRegistry.register(type, MobEntity.createMobAttributes());
        return type;
    }
}
