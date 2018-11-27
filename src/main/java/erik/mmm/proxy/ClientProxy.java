package erik.mmm.proxy;

import erik.mmm.init.ModArmour;
import erik.mmm.init.ModBlocks;
import erik.mmm.init.ModItems;
import erik.mmm.tileenitity.TileEntityJar;
import erik.mmm.tileenitity.render.RendererJar;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy implements CommonProxy{

	@Override
	public void init() {;

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityJar.class, new RendererJar());
	}

}
