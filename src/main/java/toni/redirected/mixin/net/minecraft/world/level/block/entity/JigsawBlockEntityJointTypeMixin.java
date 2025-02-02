package toni.redirected.mixin.net.minecraft.world.level.block.entity;

import toni.redirected.utils.map.CommonMaps;
import net.minecraft.world.level.block.entity.JigsawBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.Optional;

@Mixin(JigsawBlockEntity.JointType.class)
public abstract class JigsawBlockEntityJointTypeMixin {
    /**
     * @author Kasualix
     * @reason use faster map impl
     */
    @Overwrite
    public static Optional<JigsawBlockEntity.JointType> byName(String string) {
        return Optional.ofNullable(CommonMaps.JOINT_TYPE_NAME_MAP.get(string));
    }
}
