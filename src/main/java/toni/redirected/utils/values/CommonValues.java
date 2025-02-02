package toni.redirected.utils.values;

import net.minecraft.core.Direction;
import net.minecraft.core.Direction8;
import net.minecraft.server.packs.PackType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.animal.horse.Markings;
import net.minecraft.world.entity.animal.horse.Variant;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SupportType;
import net.minecraft.world.level.block.entity.CommandBlockEntity;
import net.minecraft.world.level.block.entity.JigsawBlockEntity;
import net.minecraft.world.level.block.state.properties.DripstoneThickness;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.chunk.storage.IOWorker;
import net.minecraft.world.level.levelgen.DensityFunctions;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.scores.criteria.ObjectiveCriteria;

#if mc >= 211
import net.minecraft.world.level.pathfinder.PathType;
#else
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.saveddata.maps.MapDecoration;
#endif

public class CommonValues {
    #if mc >= 211
    public static final PathType[] BLOCK_PATH_TYPES = PathType.values();
    #else
    public static final MapDecoration.Type[] MAP_DECORATION_TYPES = MapDecoration.Type.values();
    public static final BlockPathTypes[] BLOCK_PATH_TYPES = BlockPathTypes.values();
    #endif

    public static final PackType[] PACK_TYPES = PackType.values();
    public static final Half[] HALVES = Half.values();
    public static final Direction8[] DIRECTION_8_S = Direction8.values();
    public static final IOWorker.Priority[] IO_WORKER_PRIORITIES = IOWorker.Priority.values();
    public static final GenerationStep.Carving[] GENERATION_STEP_CARVINGS = GenerationStep.Carving.values();
    public static final Direction[] DIRECTIONS = Direction.values();
    public static final Direction.Axis[] AXES = Direction.Axis.values();
    public static final InteractionHand[] INTERACTION_HANDS = InteractionHand.values();
    public static final SoundSource[] SOUND_SOURCES = SoundSource.values();
    public static final Heightmap.Types[] HEIGHT_MAP_TYPES = Heightmap.Types.values();
    public static final MobCategory[] MOB_CATEGORIES = MobCategory.values();
    public static final Difficulty[] DIFFICULTIES = Difficulty.values();
    public static final CommandBlockEntity.Mode[] COMMAND_BLOCK_ENTITY_MODES = CommandBlockEntity.Mode.values();
    public static final JigsawBlockEntity.JointType[] JOINT_TYPES = JigsawBlockEntity.JointType.values();
    public static final Mirror[] MIRRORS = Mirror.values();
    public static final DyeColor[] DYE_COLORS = DyeColor.values();
    public static final GameType[] GAME_TYPES = GameType.values();
    public static final DripstoneThickness[] DRIPSTONE_THICKNESSES = DripstoneThickness.values();
    public static final EquipmentSlot[] EQUIPMENT_SLOTS = EquipmentSlot.values();
    public static final ObjectiveCriteria.RenderType[] OBJECTIVE_CRITERIA_RENDER_TYPES = ObjectiveCriteria.RenderType.values();
    public static final Markings[] MARKINGS = Markings.values();
    public static final Variant[] HORSE_VARIANTS = Variant.values();
    public static final AbstractArrow.Pickup[] PICKUPS = AbstractArrow.Pickup.values();
    public static final int directionsLength = DIRECTIONS.length;
    public static final SupportType[] SUPPORT_TYPES = SupportType.values();
    public static final Rotation[] ROTATIONS = Rotation.values();
    public static final GenerationStep.Decoration[] DECORATIONS = GenerationStep.Decoration.values();
    public static final DensityFunctions.Marker.Type[] DENSITY_FUNCTIONS_MARKER_TYPES = DensityFunctions.Marker.Type.values();
    public static final DensityFunctions.Mapped.Type[] DENSITY_FUNCTIONS_MAPPED_TYPES = DensityFunctions.Mapped.Type.values();
    public static final DensityFunctions.TwoArgumentSimpleFunction.Type[] DENSITY_FUNCTIONS_TWO_ARGUMENT_SIMPLE_FUNCTION_TYPES = DensityFunctions.TwoArgumentSimpleFunction.Type.values();
}
