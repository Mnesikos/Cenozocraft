package rando.cenozocraft.common.init;

import net.minecraft.entity.EnumCreatureType;
import net.minecraftforge.common.BiomeDictionary;
import rando.cenozocraft.common.entity.passive.EntityHouseMouse;
import rando.cenozocraft.common.util.CenozocraftUtil;

public class CenozocraftEntities {

    public static void init() {
        CenozocraftUtil.registerEntity(EntityHouseMouse.class, "house_mouse", 5000, 3, 5, EnumCreatureType.CREATURE, 0x5C503F, 0x877754, BiomeDictionary.Type.FOREST);
    }
}
