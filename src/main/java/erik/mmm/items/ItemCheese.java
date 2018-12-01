package erik.mmm.items;

import erik.mmm.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemCheese extends ItemFood{
	
	public ItemCheese(String name) {
		super(1, false);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.CREATIVE_TAB);
	}
	
}
