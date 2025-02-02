#if mc <= 201
package toni.redirected.mixin.net.minecraft.advancements;

import toni.redirected.utils.map.CommonMaps;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.advancements.FrameType;


@Mixin(FrameType.class)
public abstract class FrameTypeMixin {
    /**
     * @author Kasualix
     * @reason use faster map impl
     */
    @Overwrite
    public static FrameType byName(String name) {
        return CommonMaps.FRAME_TYPE_NAME_MAP.get(name);
    }
}
#endif