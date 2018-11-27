package erik.mmm;

import erik.mmm.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MmmTab extends CreativeTabs{

	public MmmTab() {
		super("tabMmm");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.cheese_cracker);
	}
	
	
	
	
	
}
