package rando.cenozocraft.client.proxy;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import rando.cenozocraft.client.renderer.entity.RenderHouseMouse;
import rando.cenozocraft.common.entity.passive.EntityHouseMouse;
import rando.cenozocraft.common.proxy.CommonProxy;

public class ClientProxy  extends CommonProxy {

    public void preInit(){
        super.preInit();
        RenderingRegistry.registerEntityRenderingHandler(EntityHouseMouse.class, new RenderHouseMouse.RenderFactory());
    }
}
