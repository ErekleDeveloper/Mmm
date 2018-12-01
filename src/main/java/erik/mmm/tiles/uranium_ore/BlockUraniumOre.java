package erik.mmm.tiles.uranium_ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockUraniumOre extends Block {
    public BlockUraniumOre(String name) {
        super(Material.ROCK);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(1.5f);
    }

//    @Override
//    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
//        return new ItemStack(ModItemsOld.uranium_ingot);
//    }

//    @Override
//    public String getHarvestTool(IBlockState state) {
//        return "pickaxe";
//    }

    @Override
    public int getHarvestLevel(IBlockState state) {
        return 4;
    }

}
