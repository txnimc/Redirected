package toni.redirected.utils;

import toni.redirected.utils.values.CommonValues;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Predicate;

public class Utils {
    public static @NotNull DirectionProperty create(String name, Predicate<Direction> filter) {
        List<Direction> directions = new ObjectArrayList<>();
        for (Direction direction : CommonValues.DIRECTIONS) {
            if (filter.test(direction)) directions.add(direction);
        }
        return DirectionProperty.create(name, directions);
    }
}