package erik.mmm.tileenitity;

import erik.mmm.init.ModItems;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityJar extends TileEntity{
	
	public int crackerCount = 0;
	
	public boolean addCracker() {
		if(crackerCount < 8) {
			crackerCount++;
			markDirty();
			IBlockState state = world.getBlockState(pos);
			world.notifyBlockUpdate(pos, state, state, 3);
			return true;
		}
		return false;
	}
	
	public void removeCracker() {
		if(crackerCount > 0) {
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1.0, pos.getZ()+0.5, new ItemStack(ModItems.cracker)));
			crackerCount--;
			IBlockState state = world.getBlockState(pos);
			world.notifyBlockUpdate(pos, state, state, 3);
			markDirty();
		}
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound)
	{
		super.writeToNBT(compound);
		this.writeUpdateTag(compound);
		
		return compound;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound)
	{	
		super.readFromNBT(compound);
		this.readUpdateTag(compound);
	}
	
	@Override
	public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
		NBTTagCompound tag = pkt.getNbtCompound();
		this.crackerCount = tag.getInteger("CrackerCount");
		
	}
	
	@Override
	public SPacketUpdateTileEntity getUpdatePacket() {
		NBTTagCompound tag = new NBTTagCompound();
		tag.setInteger("CrackerCount", this.crackerCount);
		return new SPacketUpdateTileEntity(pos, getBlockMetadata(), tag);
	}
	
	@Override
	public NBTTagCompound getUpdateTag() {
		NBTTagCompound tag = super.getUpdateTag();
		tag.setInteger("CrackerCount", this.crackerCount);
		return tag;
	}
	
	public void writeUpdateTag(NBTTagCompound tag) {
		tag.setInteger("CrackerCount", this.crackerCount);
	}
	
	public void readUpdateTag(NBTTagCompound tag) {
		this.crackerCount = tag.getInteger("CrackerCount");
	}
	
}
