package erik.mmm.init;

import erik.mmm.util.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class ModTools {
	
	public static ToolMaterial CREATIVE = EnumHelper.addToolMaterial("CREATIVE", 10, 1000, 1000f, 1000f, 100);
	
	public static Item cword = new ItemSword(CREATIVE).setRegistryName("cword").setUnlocalizedName("cword").setCreativeTab(CreativeTabs.COMBAT);
	
	
	public static Item[] toolItems = new Item[] {cword};
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event){
		event.getRegistry().registerAll(toolItems);
		
		Utils.getLogger().info("Registered Tool Items");
	}
	
	@SubscribeEvent
	public static void registerItemRenders(ModelRegistryEvent event) {
		for(Item item : toolItems)
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		Utils.getLogger().info("Registered Tool Renders");
	}
	
}
