package rando.cenozocraft.common.util;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import rando.cenozocraft.common.main.CenozocraftMain;

import java.util.ArrayList;
import java.util.List;

public class CenozocraftUtil {

    private static int entityId = 0;

    public static ResourceLocation getTextureLocation(String entityName){
        return new ResourceLocation(CenozocraftReference.ID + ":textures/entity/" + entityName + ".png");
    }

    public static ResourceLocation getTextureLocation(String entityName, String textureName){
        return new ResourceLocation(CenozocraftReference.ID + ":textures/entity/" + entityName + "/" + textureName + ".png");
    }

    public static void registerEntity(Class<? extends EntityLiving> entityClass, String name, int rarity, int minSpawn, int maxSpawn, EnumCreatureType creatureType, int mainEggColor, int secondaryEggColor, BiomeDictionary.Type... types) {
        EntityRegistry.registerModEntity(new ResourceLocation(CenozocraftReference.ID, name), entityClass, name, entityId++, CenozocraftMain.instance, 80, 1, true, mainEggColor, secondaryEggColor);
        List<Biome> biomes = new ArrayList<>();
        for (BiomeDictionary.Type type : types) {
            biomes.addAll(BiomeDictionary.getBiomes(type));
        }
        EntityRegistry.addSpawn(entityClass, rarity, minSpawn, maxSpawn, creatureType, biomes.toArray(new Biome[0]));
    }
}
