#if FORGELIKE && mc <= 201
package toni.redirected.mixin.forge.net.minecraftforge.common;

import toni.redirected.utils.values.CommonValues;
import net.minecraft.server.packs.PackType;
import net.minecraftforge.common.ForgeHooks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = ForgeHooks.class, remap = false)
public abstract class ForgeHooksMixin {
    @Redirect(method = "readTypedPackFormats", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/packs/PackType;values()[Lnet/minecraft/server/packs/PackType;"))
    private static PackType[] redirectPackTypes() {
        return CommonValues.PACK_TYPES;
    }
}

#endif