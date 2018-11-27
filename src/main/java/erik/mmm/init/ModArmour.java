package erik.mmm.init;

import erik.mmm.Reference;
import erik.mmm.items.ItemModArmour;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class ModArmour {

    public static ArmorMaterial uraniumMat = EnumHelper.addArmorMaterial("uranium", Reference.MOD_ID+":uranium", 200, new int[] {4,8,7,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0f);

    public static ItemArmor uraniumHelm = new ItemModArmour(uraniumMat, 1, EntityEquipmentSlot.HEAD, "uranium_helmet");
    public static ItemArmor uraniumChestplate = new ItemModArmour(uraniumMat, 1, EntityEquipmentSlot.CHEST, "uranium_chestplate");
    public static ItemArmor uraniumLeggings = new ItemModArmour(uraniumMat, 2, EntityEquipmentSlot.LEGS, "uranium_leggings");
    public static ItemArmor uraniumBoots = new ItemModArmour(uraniumMat, 1, EntityEquipmentSlot.FEET, "uranium_boots");
    
    public static ItemArmor[] armour = new ItemArmor[] {uraniumHelm, uraniumChestplate, uraniumLeggings, uraniumBoots};


    @SubscribeEvent
    public static void registerArmour(RegistryEvent.Register<Item> event){
        for(ItemArmor armor : armour)
        	event.getRegistry().register(armor);
    }
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event){
        registerRender(uraniumHelm);
        registerRender(uraniumChestplate);
        registerRender(uraniumLeggings);
        registerRender(uraniumBoots);
    }
    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
