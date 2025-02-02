package toni.redirected.mixin.net.minecraft.world.entity.monster;

import toni.redirected.utils.values.CommonValues;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.monster.Shulker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Shulker.class)
public abstract class ShulkerMixin {
    @Redirect(method = "findAttachableSurface", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/Direction;values()[Lnet/minecraft/core/Direction;"))
    private Direction[] redirectDirections() {
        return CommonValues.DIRECTIONS;
    }
}
