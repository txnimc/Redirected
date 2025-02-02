#if FORGELIKE
package toni.redirected.mixin.forge.net.minecraftforge.client.model.generators;

import toni.redirected.utils.values.CommonValues;
import net.minecraft.core.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.function.BiConsumer;

#if mc >= 211
import net.neoforged.neoforge.client.model.generators.ModelBuilder;
#else
import net.minecraftforge.client.model.generators.ModelBuilder;
#endif

@Mixin(value = ModelBuilder.class, remap = false)
public abstract class ModelBuilderMixin {
    @Redirect(method = "lambda$toJson$0", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/Direction;values()[Lnet/minecraft/core/Direction;"))
    private Direction[] redirectDirections() {
        return CommonValues.DIRECTIONS;
    }



    @Mixin(value = ModelBuilder.ElementBuilder.class, remap = false)
    @SuppressWarnings("rawtypes")
    public static abstract class ElementBuilderMixin {
        @Shadow public abstract ModelBuilder.ElementBuilder.FaceBuilder face(Direction dir);

        /**
         * @author Kasualix
         * @reason aviod stream and {@link Direction#values()} allocation
         */
        @Overwrite
        public ModelBuilder.ElementBuilder allFaces(BiConsumer<Direction, ModelBuilder.ElementBuilder.FaceBuilder> action) {
            for (Direction direction : CommonValues.DIRECTIONS) action.accept(direction, face(direction));
            return (ModelBuilder.ElementBuilder)(Object) this;
        }
    }
}

#endif