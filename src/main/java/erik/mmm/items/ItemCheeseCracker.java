package erik.mmm.items;

import erik.mmm.Main;
import erik.mmm.Reference;
import net.minecraft.item.ItemFood;;

public class ItemCheeseCracker extends ItemFood {

	public ItemCheeseCracker(String name) {
		super(4, 1.0f, true);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.CREATIVE_TAB);
		
	}
	
}
