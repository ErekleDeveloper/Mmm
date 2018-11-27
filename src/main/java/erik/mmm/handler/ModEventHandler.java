package erik.mmm.handler;

import erik.mmm.util.Utils;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ModEventHandler {
    @SubscribeEvent
    public static void pickupItem(EntityItemPickupEvent event){
        if (event.getEntity() instanceof EntityPlayer) {
            Utils.getLogger().info("=========DIDPLAYER=========");
            EntityPlayer player = event.getEntityPlayer();
            if (true) {
                player.setHealth(player.getMaxHealth() - 8.0f);
                Utils.getLogger().info("=========DID=========");
            }
        }
        Utils.getLogger().info("==============EVEEEEEEEEENTZ==============");
    }
}
