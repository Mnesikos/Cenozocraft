package net.msrandom.cenozocraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Cenozocraft.MOD_ID, name = "Cenozocraft", version = "1.0.0")
public class Cenozocraft {
    public static final String MOD_ID = "cenozocraft";
    private static Logger logger;

    @Instance
    public static Cenozocraft instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    public static Logger getLogger() {
        return logger;
    }
}
