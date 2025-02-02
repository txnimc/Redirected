#if FORGELIKE && mc <= 201
package toni.redirected.mixin.forge.net.minecraftforge.common;

import toni.redirected.forge.utils.CommonValues;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import net.minecraftforge.common.BiomeManager;

@Mixin(value = BiomeManager.class, remap = false)
public abstract class BiomeManagerMixin {
    @Redirect(method = "setupBiomes", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/common/BiomeManager$BiomeType;values()[Lnet/minecraftforge/common/BiomeManager$BiomeType;"))
    private static BiomeManager.BiomeType[] redirectBiomeManagerBiomeTypes() {
        return CommonValues.BIOME_TYPES;
    }
}

#endif