package rando.cenozocraft.common.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import rando.cenozocraft.common.util.CenozocraftReference;

@SuppressWarnings("unused")
@Mod(modid = CenozocraftReference.ID, name = CenozocraftReference.NAME, version = CenozocraftReference.VERSION)
public class CenozocraftMain {
    private static Logger logger;

    @Instance
    public static CenozocraftMain instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    public static Logger getLogger() {
        return logger;
    }
}
