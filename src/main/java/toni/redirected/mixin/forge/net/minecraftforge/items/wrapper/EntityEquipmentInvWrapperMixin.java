#if FORGELIKE
package toni.redirected.mixin.forge.net.minecraftforge.items.wrapper;

import toni.redirected.utils.values.CommonValues;
import net.minecraft.world.entity.EquipmentSlot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

#if mc >= 211
import net.neoforged.neoforge.items.wrapper.EntityEquipmentInvWrapper;
#else
import net.minecraftforge.items.wrapper.EntityEquipmentInvWrapper;
#endif

@Mixin(value = EntityEquipmentInvWrapper.class, remap = false)
public abstract class EntityEquipmentInvWrapperMixin {
    @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/EquipmentSlot;values()[Lnet/minecraft/world/entity/EquipmentSlot;"))
    private EquipmentSlot[] redirectEquipmentSlots() {
        return CommonValues.EQUIPMENT_SLOTS;
    }
}

#endif