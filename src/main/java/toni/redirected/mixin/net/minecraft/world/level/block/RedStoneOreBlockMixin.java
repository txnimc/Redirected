package toni.redirected.mixin.net.minecraft.world.level.block;

import toni.redirected.utils.values.CommonValues;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.RedStoneOreBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(RedStoneOreBlock.class)
public abstract class RedStoneOreBlockMixin {
    @Redirect(method = "spawnParticles", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/Direction;values()[Lnet/minecraft/core/Direction;"))
    private static Direction[] redirectDirections() {
        return CommonValues.DIRECTIONS;
    }
}
