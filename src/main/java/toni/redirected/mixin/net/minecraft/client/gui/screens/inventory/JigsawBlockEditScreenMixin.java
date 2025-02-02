package toni.redirected.mixin.net.minecraft.client.gui.screens.inventory;

import toni.redirected.utils.values.CommonValues;
import net.minecraft.client.gui.screens.inventory.JigsawBlockEditScreen;
import net.minecraft.world.level.block.entity.JigsawBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(JigsawBlockEditScreen.class)
public abstract class JigsawBlockEditScreenMixin {
    @Redirect(method = "init", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/entity/JigsawBlockEntity$JointType;values()[Lnet/minecraft/world/level/block/entity/JigsawBlockEntity$JointType;"))
    private JigsawBlockEntity.JointType[] redirectJigsawBlockEntityJointTypes() {
        return CommonValues.JOINT_TYPES;
    }
}
