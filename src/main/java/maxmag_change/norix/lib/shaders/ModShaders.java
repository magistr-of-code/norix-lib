package maxmag_change.norix.lib.shaders;

import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import team.lodestar.lodestone.systems.postprocess.PostProcessor;

public class ModShaders {

    public static PostProcessor register(Identifier identifier){
        return new PostProcessor() {

            @Override
            public Identifier getPostChainLocation() {
                return identifier;
            }

            @Override
            public void beforeProcess(MatrixStack viewModelStack) {

            }

            @Override
            public void afterProcess() {

            }
        };
    }
}
