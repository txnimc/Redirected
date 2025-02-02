package toni.redirected.mixin.net.minecraft.world.level.levelgen.feature;

import toni.redirected.utils.values.CommonValues;
import net.minecraft.core.Direction;
import net.minecraft.world.level.levelgen.feature.GlowstoneFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(GlowstoneFeature.class)
public abstract class GlowstoneFeatureMixin {
    @Redirect(method = "place", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/Direction;values()[Lnet/minecraft/core/Direction;"))
    private Direction[] redirectDirections() {
        return CommonValues.DIRECTIONS;
    }
}
