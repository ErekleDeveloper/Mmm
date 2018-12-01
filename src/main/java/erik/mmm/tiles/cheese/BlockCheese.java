package erik.mmm.tiles.cheese;

import erik.mmm.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCheese extends Block {

	public BlockCheese(String name) {
		super(Material.CAKE);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.CREATIVE_TAB);
		setHardness(1.0f);
	}

}
