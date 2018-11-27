package erik.mmm;

import erik.mmm.init.ModArmour;
import erik.mmm.init.ModBlocks;
import erik.mmm.init.ModItems;
import erik.mmm.init.ModRecipes;
import erik.mmm.proxy.CommonProxy;
import erik.mmm.tileenitity.TileEntityJar;
import erik.mmm.util.Utils;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid=Reference.MOD_ID, name=Reference.NAME, version=Reference.VERSION, acceptedMinecraftVersions=Reference.ACCEPTED_VERSIONS)
public class Main {

	@Instance(Reference.MOD_ID)
	public static Main instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs CREATIVE_TAB = new MmmTab();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Utils.getLogger().info("==================PRE-INIT==================");
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		Utils.getLogger().info("==================INIT==================");
		proxy.init();
		ModRecipes.registerSmelting();

		GameRegistry.registerTileEntity(TileEntityJar.class, Reference.MOD_ID+"TileEntityJar");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		Utils.getLogger().info("==================POST-INIT==================");
	}
}
