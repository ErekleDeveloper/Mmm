package erik.mmm.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
//	public static void registerCrafting() {
//		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cheese), "CCC","CCC","CCC", 'C', ModItems.cheese);
//		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.jar), " C ","GGG","CCC", 'C', Blocks.COAL_BLOCK, 'G', new ItemStack(Blocks.STAINED_GLASS, 1, 0));
//		GameRegistry.addShapedRecipe(new ItemStack(ModItems.cheese_cracker), "C", "K", 'C', ModItems.cheese, 'K', ModItems.cracker);
//	}
//
	public static void registerSmelting(){
		GameRegistry.addSmelting(Items.ENDER_EYE, new ItemStack(Items.ENDER_EYE), 0.2f);
		GameRegistry.addSmelting(ModBlocks.uranium_ore, new ItemStack(ModItems.uranium_ingot), 0.2f);
	}
//
//	private static void registerToolsRecipes(Item pickaxe, Item axe, Item hoe, Item shovel, Item sword, ItemStack ingot) {
//		GameRegistry.addRecipe(new ItemStack(pickaxe), new Object[] {"III"," S "," S ", 'I', ingot, 'S', Items.STICK });
//		GameRegistry.addRecipe(new ItemStack(axe), new Object[] {" II"," SI"," S ", 'I', ingot, 'S', Items.STICK });
//		GameRegistry.addRecipe(new ItemStack(axe), new Object[] {"II ","IS "," S ", 'I', ingot, 'S', Items.STICK });
//		GameRegistry.addRecipe(new ItemStack(hoe), new Object[] {"II "," S "," S ", 'I', ingot, 'S', Items.STICK });
//		GameRegistry.addRecipe(new ItemStack(hoe), new Object[] {" II"," S "," S ", 'I', ingot, 'S', Items.STICK });
//		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] {" I "," S "," S ", 'I', ingot, 'S', Items.STICK });
//		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] {"I  ","S  ","S  ", 'I', ingot, 'S', Items.STICK });
//		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] {"  I","  S","  S", 'I', ingot, 'S', Items.STICK });
//		GameRegistry.addRecipe(new ItemStack(sword), new Object[] {" I "," I "," S ", 'I', ingot, 'S', Items.STICK });
//		GameRegistry.addRecipe(new ItemStack(sword), new Object[] {"I  ","I  ","S  ", 'I', ingot, 'S', Items.STICK });
//		GameRegistry.addRecipe(new ItemStack(sword), new Object[] {"  I","  I","  S", 'I', ingot, 'S', Items.STICK });
//	}
//
//	private static void registerArmoursRecipes(Item helmet, Item chestplate, Item leggings, Item boots, Item ingot) {
//		GameRegistry.addRecipe(new ItemStack(helmet), new Object[] { "III","I I","   ",'I',ingot});
//		GameRegistry.addRecipe(new ItemStack(helmet), new Object[] { "   ","III","I I",'I',ingot});
//		GameRegistry.addRecipe(new ItemStack(chestplate), new Object[] { "I I","III","III",'I',ingot});
//		GameRegistry.addRecipe(new ItemStack(leggings), new Object[] { "III","I I","I I",'I',ingot});
//		GameRegistry.addRecipe(new ItemStack(boots), new Object[] { "I I","I I","   ",'I',ingot});
//		GameRegistry.addRecipe(new ItemStack(boots), new Object[] { "   ","I I","I I",'I',ingot});
//	}
}
