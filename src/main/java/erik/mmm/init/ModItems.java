package erik.mmm.init;

import erik.mmm.Reference;
import erik.mmm.items.*;
import erik.mmm.util.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ModItems {

    public static Item cheese;
    public static Item cracker;
    public static ItemSword cword;
    public static Item cheese_cracker;
    public static Item uranium_ingot;


    public static void init() {
        cheese = new ItemCheese("cheese");
        cracker = new ItemCracker("cracker");
        cword = new ItemCword("cword");
        cheese_cracker = new ItemCheeseCracker("cheese_cracker");
        uranium_ingot = new ItemIngotUranium("uranium_ingot");
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        init();
        event.getRegistry().registerAll(
                cheese,
                cracker,
                cword,
                cheese_cracker,
                uranium_ingot
        );
        Utils.getLogger().info("Registered Items");
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event){
        registerRender(cheese);
        registerRender(cracker);
        registerRender(cword);
        registerRender(cheese_cracker);
        registerRender(uranium_ingot);

        Utils.getLogger().info("Registered Item Renders");
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
