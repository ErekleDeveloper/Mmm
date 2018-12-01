package erik.mmm.items;

import erik.mmm.handler.EnumHandler.EnumChips;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemChip extends Item {

	public ItemChip(String name, CreativeTabs tab) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setHasSubtypes(true);
	}
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		for (int i = 0; i < EnumChips.values().length; i++)
			items.add(new ItemStack(this, 1, i));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < EnumChips.values().length; i++)
			return this.getUnlocalizedName() + "." + EnumChips.values()[i].getName();
		return this.getUnlocalizedName() + "." + EnumChips.BASIC.getName();
	}
	
	
}
