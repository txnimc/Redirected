#if mc <= 201
package toni.redirected.mixin.net.minecraft.world.level.pathfinder;

import toni.redirected.utils.values.CommonValues;
import net.minecraft.world.level.pathfinder.Node;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import net.minecraft.world.level.pathfinder.BlockPathTypes;

@Mixin(Node.class)
public abstract class NodeMixin {

    @Redirect(method = "createFromStream", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/pathfinder/BlockPathTypes;values()[Lnet/minecraft/world/level/pathfinder/BlockPathTypes;"))
    private static BlockPathTypes[] redirectBlockPathTypes() {
        return CommonValues.BLOCK_PATH_TYPES;
    }
}

    #endif