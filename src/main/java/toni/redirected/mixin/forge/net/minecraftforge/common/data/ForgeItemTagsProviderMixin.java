#if FORGELIKE
package toni.redirected.mixin.forge.net.minecraftforge.common.data;

import toni.redirected.utils.values.CommonValues;
import net.minecraft.world.item.DyeColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

#if mc >= 211
import net.neoforged.neoforge.common.data.internal.NeoForgeBlockTagsProvider;
#else
import net.minecraftforge.common.data.ForgeItemTagsProvider;
#endif

@Mixin(value = #if mc >= 211 NeoForgeBlockTagsProvider  #else ForgeItemTagsProvider #endif.class, remap = false)
public abstract class ForgeItemTagsProviderMixin {
    @Redirect(method = {"addColored", "copyColored"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/DyeColor;values()[Lnet/minecraft/world/item/DyeColor;"))
    private DyeColor[] redirectDyeColors() {
        return CommonValues.DYE_COLORS;
    }
}

#endif