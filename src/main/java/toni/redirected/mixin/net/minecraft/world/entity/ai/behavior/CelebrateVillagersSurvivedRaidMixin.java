package toni.redirected.mixin.net.minecraft.world.entity.ai.behavior;

import toni.redirected.utils.values.CommonValues;
import net.minecraft.world.entity.ai.behavior.CelebrateVillagersSurvivedRaid;
import net.minecraft.world.item.DyeColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(CelebrateVillagersSurvivedRaid.class)
public abstract class CelebrateVillagersSurvivedRaidMixin {
    @Redirect(method = "tick(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/npc/Villager;J)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/DyeColor;values()[Lnet/minecraft/world/item/DyeColor;"))
    private DyeColor[] redirectDyeColors() {
        return CommonValues.DYE_COLORS;
    }
}
