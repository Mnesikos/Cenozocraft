package net.msrandom.cenozocraft.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.msrandom.cenozocraft.CenozoCraft;
import net.msrandom.cenozocraft.entity.monster.*;
import net.msrandom.cenozocraft.entity.passive.*;

public class CenozoCraftEntities {
    public static final EntityType<SmilodonEntity.Populator> POPULATOR_SMILODON = create("populator_smilodon", SmilodonEntity.Populator::new, 1, 0.5f, 0x5C503F, 0x877754);
    public static final EntityType<SmilodonEntity.Fatalis> FATALIS_SMILODON = create("fatalis_smilodon", SmilodonEntity.Fatalis::new, 1, 0.5f, 0x5C503F, 0x877754);
    public static final EntityType<SmilodonEntity.Gracilis> GRACILIS_SMILODON = create("gracilis_smilodon", SmilodonEntity.Gracilis::new, 1, 0.5f, 0x5C503F, 0x877754);
    public static final EntityType<AurochsEntity> AUROCHS = create("aurochs", AurochsEntity::new, 3, 2.5f, 0x5c503f, 0x877754);
    public static final EntityType<CaveBearEntity> CAVEBEAR = create("cave_bear", CaveBearEntity::new, 1.5f, 1, 0x5c503f, 0x877754);
    public static final EntityType<CaveLionEntity> CAVELION = create("cave_lion", CaveLionEntity::new, 1.5f, 1, 0x5c503f, 0x877754);
    public static final EntityType<DireWolfEntity> DIREWOLF = create("dire_wolf", DireWolfEntity::new, 1, 0.5f, 0x5c503f, 0x877754);
    public static final EntityType<DodoEntity> DODO = create("dodo", DodoEntity::new, 0f, 0f, 0x5c503f, 0x877754);
    public static final EntityType<ElasmotheriumEntity> ELASMOTHERIUM = create("elasmotherium", ElasmotheriumEntity::new, 0f, 0f, 0x5c503f, 0x877754);
    //public static final EntityType<GiantBeaverEntity> GIANT_BEAVER = create("giant_beaver", GiantBeaverEntity::new, 0f, 0f, 0x5c503f, 0x877754);
    public static final EntityType<GreatAukEntity> GREAT_AUK = create("great_auk", GreatAukEntity::new, 0f, 0f, 0x5c503f, 0x877754);
    public static final EntityType<HouseMouseEntity> HOUSE_MOUSE = create("house_mouse", HouseMouseEntity::new, 0.2f, 0.1f, 0x5c503f, 0x877754);
    public static final EntityType<IrishElkEntity> IRISH_ELK = create("irish_elk", IrishElkEntity::new, 1, 0.5f, 0x5c503f, 0x877754);
    //public static final EntityType<MegatheriumEntity> MEGATHERIUM = create("megatherium", MegatheriumEntity::new, 0f, 0f, 0x5c503f, 0x877754);
    //public static final EntityType<ProcoptodonEntity> PROCOPTODON = create("procoptodon", ProcoptodonEntity::new, 0f, 0f, 0x5c503f, 0x877754);
    public static final EntityType<QuaggaEntity> QUAGGA = create("quagga", QuaggaEntity::new, 0f, 0f, 0x5c503f, 0x877754);
    //public static final EntityType<ThylacineEntity> THYLACINE = create("thylacine", ThylacineEntity::new, 0f, 0f, 0x5c503f, 0x877754);
    //public static final EntityType<TitanisEntity> TITANIS = create("titanis", TitanisEntity::new, 0f, 0f, 0x5c503f, 0x877754);

    private static <T extends CenozoCraftEntityBase> EntityType<T> create(String name, EntityType.EntityFactory<T> factory, float width, float height, int eggPrimary, int eggSecondary) {
        EntityType<T> type = FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, factory).dimensions(EntityDimensions.changing(width, height)).trackable(80, 3).build();
        Registry.register(Registry.ENTITY_TYPE, new Identifier(CenozoCraft.MOD_ID, name), type);
        Registry.register(Registry.ITEM, new Identifier(CenozoCraft.MOD_ID, name + "_spawn_egg"), new SpawnEggItem(type, eggPrimary, eggSecondary, new Item.Settings().group(ItemGroup.MISC)));
        return type;
    }
}
