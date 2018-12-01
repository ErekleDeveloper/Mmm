package erik.mmm;

import erik.mmm.init.ModBlocks;
import erik.mmm.init.ModItems;
import erik.mmm.proxy.CommonProxy;
import erik.mmm.util.Utils;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Main.MOD_ID, name=Main.NAME, version=Main.VERSION, acceptedMinecraftVersions=Main.ACCEPTED_VERSIONS)
public class Main {
	
	public static final String MOD_ID = "mmm";
	public static final String NAME = "Mmm";
	public static final String VERSION = "1.0.0.0";
	public static final String ACCEPTED_VERSIONS = "[1.12.2]";
	public static final String CLIENT_PROXY_CLASS = "erik.mmm.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "erik.mmm.proxy.ServerProxy";

	@Instance(MOD_ID)
	public static Main instance;
	
	@SidedProxy(clientSide=CLIENT_PROXY_CLASS, serverSide=SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
	public static final CreativeTabs CREATIVE_TAB = new CreativeTabs("mmm") {
		@Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.cheese);
        }
	};
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Utils.getLogger().info("==================PRE-INIT==================");
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		Utils.getLogger().info("==================INIT==================");
		proxy.init(event);
		
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		Utils.getLogger().info("==================POST-INIT==================");
		proxy.postInit(event);
	}
	
	
}
