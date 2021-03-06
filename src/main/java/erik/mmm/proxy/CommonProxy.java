package erik.mmm.proxy;

import erik.mmm.Main;
import erik.mmm.init.ModRecipes;
import erik.mmm.tiles.energized_furnace.TileFurnace;
import erik.mmm.tiles.jar.TileEntityJar;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e) {
		
	}
	
	public void init(FMLInitializationEvent e) {
		ModRecipes.registerSmelting();
		
		GameRegistry.registerTileEntity(TileEntityJar.class, Main.MOD_ID+"_jar");
		GameRegistry.registerTileEntity(TileFurnace.class, "_energized_funace");
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
	
}
