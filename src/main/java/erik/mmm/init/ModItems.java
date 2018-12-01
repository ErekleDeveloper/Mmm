package erik.mmm.init;

import erik.mmm.Main;
import erik.mmm.handler.EnumHandler.EnumChips;
import erik.mmm.items.ItemCheese;
import erik.mmm.items.ItemChip;
import erik.mmm.items.ItemCracker;
import erik.mmm.items.ItemGeneric;
import erik.mmm.util.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ModItems {

    public static Item cheese = new ItemCheese("cheese");
    public static Item cracker = new ItemCracker("cracker");
    public static Item cheese_cracker = new ItemFood(4, 1.0f, true).setRegistryName("cheese_cracker").setUnlocalizedName("cheese_cracker").setCreativeTab(CreativeTabs.FOOD);
    public static Item uranium_ingot = new ItemGeneric("uranium_ingot", CreativeTabs.MATERIALS);
    public static Item chip = new ItemChip("chip", CreativeTabs.MISC);
    
    public static Item[] items = new Item[] {cheese, cracker, cheese_cracker, uranium_ingot, chip};

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(items);
        
        Utils.getLogger().info("Registered Items");
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event){
        registerRender(items);
        
        for(EnumChips chip_ : EnumChips.values())
        	registerRender(chip, chip_.getId(), "chip_" + chip_.getName());

        Utils.getLogger().info("Registered Item Renders");
    }

    private static void registerRender(Item item, int meta, String filaname) {
    		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Main.MOD_ID, filaname), "inventory"));
    }
    private static void registerRender(Item... items) {
		for(Item item : items)
			if(!item.getHasSubtypes())
				ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
