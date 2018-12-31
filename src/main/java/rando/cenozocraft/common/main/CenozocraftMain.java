package rando.cenozocraft.common.main;

import rando.cenozocraft.common.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import rando.cenozocraft.common.util.CenozocraftReference;

@Mod(modid = CenozocraftReference.ID, name = CenozocraftReference.NAME, version = CenozocraftReference.VERSION)
public class CenozocraftMain
{
	
	@SidedProxy(clientSide = CenozocraftReference.CLIENT_PROXY, serverSide = CenozocraftReference.COMMON_PROXY)
	public static CommonProxy proxy;
	
    @Instance
    public static CenozocraftMain instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
    }
}
