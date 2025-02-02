#if FORGELIKE && mc <= 201
package toni.redirected.forge.utils;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.network.NetworkDirection;

public class CommonValues {
    public static final BiomeManager.BiomeType[] BIOME_TYPES = BiomeManager.BiomeType.values();
    public static final NetworkDirection[] NETWORK_DIRECTIONS = NetworkDirection.values();
}
#endif