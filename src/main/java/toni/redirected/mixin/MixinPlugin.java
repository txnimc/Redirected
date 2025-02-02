package toni.redirected.mixin;

import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.Set;

#if FORGE
import net.minecraftforge.fml.loading.FMLLoader;
#elif NEO
import net.neoforged.fml.loading.FMLLoader;
#else
import net.fabricmc.loader.api.FabricLoader;
#endif

public class MixinPlugin implements IMixinConfigPlugin {
    @Override
    public void onLoad(String s) {

    }

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @SuppressWarnings("RedundantIfStatement")
    @Override
    public boolean shouldApplyMixin(String s, String s1) {
        #if FORGELIKE
        if (FMLLoader.getLoadingModList().getModFileById("sculkhorde") != null && s1.contains("FrameTypeMixin"))
            return false;

        return true;
        #else
        return !FabricLoader.getInstance().isModLoaded("nicerportals") || !s1.contains("BaseFireBlockMixin");
        #endif
    }

    @Override
    public void acceptTargets(Set<String> set, Set<String> set1) {

    }

    @Override
    public List<String> getMixins() {
        return null;
    }

    @Override
    public void preApply(String s, ClassNode classNode, String s1, IMixinInfo iMixinInfo) {

    }

    @Override
    public void postApply(String s, ClassNode classNode, String s1, IMixinInfo iMixinInfo) {

    }
}