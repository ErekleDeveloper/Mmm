package erik.mmm.blocks;

import erik.mmm.Main;
import erik.mmm.init.ModItems;
import erik.mmm.tileenitity.TileEntityJar;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockJar extends Block implements ITileEntityProvider{
	
	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.0625*3, 0, 0.0625*3, 0.0625*13, 0.0625*12, 0.0625*13);
	private static final AxisAlignedBB COLLISION_BOX = new AxisAlignedBB(0.0625*4, 0, 0.0625*4, 0.0625*12, 0.0625*11, 0.0625*12);

	public BlockJar(String name) {
		super(Material.GLASS);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.CREATIVE_TAB);
		setHardness(1.0f);
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BOUNDING_BOX;
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
		if(!worldIn.isRemote) {
			TileEntity tileEntity = worldIn.getTileEntity(pos);
			if(tileEntity instanceof TileEntityJar) {
				TileEntityJar jar = (TileEntityJar) tileEntity;

				if(playerIn.getHeldItemMainhand() == new ItemStack(ModItems.cracker)) {
					if(jar.addCracker()) {
						//playerIn.getHeldItem(hand).setCount(playerIn.getHeldItem(hand).getCount()-1);
						//playerIn.getHeldItemMainhand().setCount(playerIn.getHeldItemMainhand().getCount()-1);
						return true;
					}
				}

				jar.removeCracker();
			}
		}

		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityJar();
	}

}
