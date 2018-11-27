package erik.mmm.init;

import erik.mmm.Reference;
import erik.mmm.blocks.BlockCheese;
import erik.mmm.blocks.BlockCheeseMaker;
import erik.mmm.blocks.BlockJar;
import erik.mmm.blocks.BlockUraniumOre;
import erik.mmm.util.Utils;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModBlocks {
	
	public static Block cheese;
	public static Block jar;
	public static Block cheesemaker;
	public static Block uranium_ore;

		
	public static void init() {
		cheese = new BlockCheese("blockcheese");
		jar = new BlockJar("jar");
		cheesemaker = new BlockCheeseMaker("cheesemaker");
		uranium_ore = new BlockUraniumOre("uranium_ore");
	}

	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event){
		init();
		event.getRegistry().registerAll(
				cheese,
				jar,
				cheesemaker,
				uranium_ore
		);
		Utils.getLogger().info("Registered Blocks");
	}

	@SubscribeEvent
	public static void registerItemBlocks(final RegistryEvent.Register<Item> event){
		registerItemAll(event,
				cheese,
				jar,
				cheesemaker,
				uranium_ore
		);
		Utils.getLogger().info("Registered ItemBlocks");
	}


	private static void registerItemAll(RegistryEvent.Register<Item> event, Block... blocks) {
		for (Block block : blocks) {
			ItemBlock itemBlock = new ItemBlock(block);
			itemBlock.setRegistryName(block.getRegistryName());
			event.getRegistry().register(itemBlock);
		}
	}

	@SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(cheese);
        registerRender(jar);
        registerRender(cheesemaker);
        registerRender(uranium_ore);

        Utils.getLogger().info("Registered ItemBlock Renders");
    }

	private static void registerRender(Block block) {
		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "#inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
}