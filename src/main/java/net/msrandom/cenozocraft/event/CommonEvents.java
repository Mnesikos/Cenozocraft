package net.msrandom.cenozocraft.event;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.village.Village;
import net.minecraft.village.VillageCollection;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.msrandom.cenozocraft.Cenozocraft;
import net.msrandom.cenozocraft.entity.passive.EntityHouseMouse;

import java.util.List;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = Cenozocraft.MOD_ID)
public class CommonEvents {

    @SuppressWarnings("ConstantConditions")
    @SubscribeEvent
    public static void livingUpdate(LivingEvent.LivingUpdateEvent event) {
        EntityLivingBase entity = event.getEntityLiving();
        World world = entity.world;
        VillageCollection collection = world.getVillageCollection();
        Village village = collection == null ? null : collection.getNearestVillage(entity.getPosition(), 512);
        if(village != null) {
            int r = village.getVillageRadius();
            List<EntityHouseMouse> mice = world.getEntitiesWithinAABB(EntityHouseMouse.class, new AxisAlignedBB(village.getCenter().add(-r, -r, -r), village.getCenter().add(r, r, r)));
            if(mice.size() < 8) {
                if(world.rand.nextInt(5) == 0) {
                    EntityHouseMouse houseMouse = new EntityHouseMouse(world);
                    BlockPos pos = world.getTopSolidOrLiquidBlock(village.getCenter().add(-r, 0, -r).add(world.rand.nextInt(r/2)*2, 0, world.rand.nextInt(r/2)*2));
                    houseMouse.setLocationAndAngles(pos.getX(), pos.getY(), pos.getZ(), 0, 0);
                    houseMouse.onInitialSpawn(world.getDifficultyForLocation(pos), null);
                    world.spawnEntity(houseMouse);
                }
            }
        }
    }
}
