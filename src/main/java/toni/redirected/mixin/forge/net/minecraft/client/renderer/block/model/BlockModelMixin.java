#if FORGELIKE
package toni.redirected.mixin.forge.net.minecraft.client.renderer.block.model;

import toni.redirected.forge.utils.ClientValues;
import net.minecraft.client.renderer.block.model.BlockModel;
import net.minecraft.world.item.ItemDisplayContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(BlockModel.class)
public abstract class BlockModelMixin {
    @Redirect(method = "getTransforms", at = @At(value = "INVOKE", remap = false, target = "Lnet/minecraft/world/item/ItemDisplayContext;values()[Lnet/minecraft/world/item/ItemDisplayContext;"))
    private ItemDisplayContext[] redirectItemTransformsTransformTypes() {
        return ClientValues.ITEM_DISPLAY_CONTEXTS;
    }
}
#endif