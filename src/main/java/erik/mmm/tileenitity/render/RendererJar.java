package erik.mmm.tileenitity.render;

import erik.mmm.init.ModItems;
import erik.mmm.tileenitity.TileEntityJar;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.animation.FastTESR;

public class RendererJar extends FastTESR<TileEntityJar>{
	
	private static final EntityItem ITEM = new EntityItem(Minecraft.getMinecraft().world, 0, 0, 0, new ItemStack(ModItems.cracker));
	

	@Override
	public void renderTileEntityFast(TileEntityJar te, double x, double y, double z, float partialTicks, int destroyStage, float partial, BufferBuilder buffer) {
		
		ITEM.hoverStart = 0.0f;
		
		GlStateManager.pushMatrix();
		{
			GlStateManager.translate(x, y, z);
			GlStateManager.rotate(90f, 1, 0, 0);
			GlStateManager.translate(0.5, 0.0, -0.1);
			
			for(int i = 0; i < te.crackerCount; i++) {
				Minecraft.getMinecraft().getRenderManager().renderEntity(ITEM, 0, 0, 0, 0f, 0f, false);
				GlStateManager.translate(0, 0, -0.0625);
			}
		}
		GlStateManager.popMatrix();
	}
	
}
