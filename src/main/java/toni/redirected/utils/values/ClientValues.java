package toni.redirected.utils.values;

import com.mojang.blaze3d.platform.InputConstants;
import com.mojang.realmsclient.client.Ping;
import com.mojang.realmsclient.util.LevelType;
import net.minecraft.client.gui.screens.advancements.AdvancementTabType;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.world.entity.player.PlayerModelPart;

public class ClientValues {
    public static final InputConstants.Type[] INPUT_CONSTANTS_TYPES = InputConstants.Type.values();
    public static final Ping.Region[] REGIONS = Ping.Region.values();
    public static final LevelType[] LEVEL_TYPES = LevelType.values();
    public static final PlayerModelPart[] PLAYER_MODEL_PARTS = PlayerModelPart.values();
    public static final ServerData.ServerPackStatus[] SERVER_PACK_STATUSES = ServerData.ServerPackStatus.values();
    public static final AdvancementTabType[] ADVANCEMENT_TAB_TYPES = AdvancementTabType.values();
}
