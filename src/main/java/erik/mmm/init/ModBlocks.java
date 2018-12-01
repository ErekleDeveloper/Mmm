package erik.mmm.init;

import java.util.ArrayList;
import java.util.List;

import erik.mmm.Main;
import erik.mmm.tiles.cheese.BlockCheese;
import erik.mmm.tiles.cheesemaker.BlockCheeseMaker;
import erik.mmm.tiles.energized_furnace.BlockFurnace;
import erik.mmm.tiles.jar.BlockJar;
import erik.mmm.tiles.uranium_ore.BlockUraniumOre;
import erik.mmm.util.Utils;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class ModBlocks {
	
	public static Block cheese = new BlockCheese("blockcheese");
	public static Block jar = new BlockJar("jar");
	public static Block cheesemaker = new BlockCheeseMaker("cheesemaker");
	public static Block uranium_ore = new BlockUraniumOre("uranium_ore");
	public static Block energized_furnace = new BlockFurnace("energized_furnace", Main.CREATIVE_TAB);
	
	public static Block[] blocks = new Block[] {cheese, jar, cheesemaker, uranium_ore, energized_furnace};
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event){
		event.getRegistry().registerAll(blocks);
		
		Utils.getLogger().info("Registered Blocks");
	}

	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event){
		registerItemAll(event, blocks);
		
		Utils.getLogger().info("Registered ItemBlocks");
	}


	private static void registerItemAll(RegistryEvent.Register<Item> event, Block... blocks) {
		for (Block block : blocks) {
			event.getRegistry().register((ItemBlock) new ItemBlock(block).setRegistryName(block.getRegistryName()));
		}
	}

	@SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
		registerRender(blocks);

        Utils.getLogger().info("Registered ItemBlock Renders");
    }

	private static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	private static void registerRender(Block... blocks) {
		for(Block block : blocks)
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
}