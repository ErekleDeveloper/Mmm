package erik.mmm.items;

import erik.mmm.Main;
import erik.mmm.MmmTab;
import erik.mmm.Reference;
import erik.mmm.mats.ToolMats;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemCword extends ItemSword {

	public ItemCword(String name) {
		super(ToolMats.CREATIVE);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.CREATIVE_TAB);
	}

}
