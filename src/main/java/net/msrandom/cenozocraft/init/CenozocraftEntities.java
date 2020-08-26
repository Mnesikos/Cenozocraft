package net.msrandom.cenozocraft.init;

import com.google.common.base.CaseFormat;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.Biome;
import net.msrandom.cenozocraft.entity.CenozocraftEntityBase;
import net.msrandom.cenozocraft.entity.monster.*;
import net.msrandom.cenozocraft.entity.passive.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CenozocraftEntities {

    public static final List<RegistryEntry> LIST = new ArrayList<>();
    public static int entityId = 0;

    static {
        for (Class<? extends EntitySmilodon> smilodon : EntitySmilodon.TYPES) LIST.add(new RegistryEntry(smilodon, new Egg(0x5C503F, 0x877754), "smilodon_" + smilodon.getSimpleName().toLowerCase()));

        LIST.addAll(Arrays.asList(
                new RegistryEntry(EntityAurochs.class, new Egg(0x5C503F, 0x877754)),
                new RegistryEntry(EntityCaveBear.class, new Egg(0x5C503F, 0x877754)),
                new RegistryEntry(EntityCaveLion.class, new Egg(0x5C503F, 0x877754)),
                new RegistryEntry(EntityDireWolf.class, new Egg(0x5C503F, 0x877754)),
                new RegistryEntry(EntityDodo.class, new Egg(0x5C503F, 0x877754)),
                new RegistryEntry(EntityElasmotherium.class, new Egg(0x5C503F, 0x877754)),
                //new RegistryEntry(EntityGiantBeaver.class, new Egg(0x5C503F, 0x877754)),
                new RegistryEntry(EntityGreatAuk.class, new Egg(0x5C503F, 0x877754)),
                new RegistryEntry(EntityHouseMouse.class, new Egg(0x5C503F, 0x877754)),
                new RegistryEntry(EntityIrishElk.class, new Egg(0x5C503F, 0x877754)),
                //new RegistryEntry(EntityMegatherium.class, new Egg(0x5C503F, 0x877754)),
                //new RegistryEntry(EntityProcoptodon.class, new Egg(0x5C503F, 0x877754)),
                new RegistryEntry(EntityQuagga.class, new Egg(0x5C503F, 0x877754))//,
                //new RegistryEntry(EntityThylacine.class, new Egg(0x5C503F, 0x877754)),
                //new RegistryEntry(EntityTitanis.class, new Egg(0x5C503F, 0x877754))
        ));
    }

    public static class RegistryEntry {
        public Class<? extends CenozocraftEntityBase> cls;
        public Egg egg;
        public Spawn spawn;
        public String name = "";

        private RegistryEntry(Class<? extends CenozocraftEntityBase> cls, Egg egg, String name) {
            this.egg = egg;
            this.name = name;
            register(cls);
        }

        private RegistryEntry(Class<? extends CenozocraftEntityBase> cls, Egg egg) {
            this.egg = egg;
            register(cls);
        }

        private void register(Class<? extends CenozocraftEntityBase> cls) {
            this.cls = cls;
            if(this.name.isEmpty()) this.name = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, cls.getSimpleName().replace("Entity", ""));
        }
    }

    public static class Egg{
        public final int primary;
        public final int secondry;

        Egg(int primary, int secondry) {
            this.primary = primary;
            this.secondry = secondry;
        }
    }

    public static class Spawn{
        public final EnumCreatureType type;
        public final int weight;
        public final int min;
        public final int max;
        public final Biome[] biomes;

        public Spawn(EnumCreatureType type, int weight, int min, int max, Biome... biomes) {
            this.type = type;
            this.weight = weight;
            this.min = min;
            this.max = max;
            this.biomes = biomes;
        }
    }
}
