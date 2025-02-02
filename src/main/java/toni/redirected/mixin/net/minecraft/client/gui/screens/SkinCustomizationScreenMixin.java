package toni.redirected.mixin.net.minecraft.client.gui.screens;

import toni.redirected.utils.values.ClientValues;
import net.minecraft.world.entity.player.PlayerModelPart;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

#if mc >= 211
import net.minecraft.client.gui.screens.options.SkinCustomizationScreen;
#else
import net.minecraft.client.gui.screens.SkinCustomizationScreen;
#endif

@Mixin(SkinCustomizationScreen.class)
public abstract class SkinCustomizationScreenMixin {
    @Redirect(method = "init", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/player/PlayerModelPart;values()[Lnet/minecraft/world/entity/player/PlayerModelPart;"))
    private PlayerModelPart[] redirectPlayerModelParts() {
        return ClientValues.PLAYER_MODEL_PARTS;
    }
}
