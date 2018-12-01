package erik.mmm.proxy;

import erik.mmm.tiles.jar.RendererJar;
import erik.mmm.tiles.jar.TileEntityJar;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}
	
	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityJar.class, new RendererJar());
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}

}
