package carbyx.simonmod.registry;

import carbyx.simonmod.items.InfusionCore;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemRegistry {
    @GameRegistry.ObjectHolder("simonmod:infusion_core")
    public static InfusionCore infusion_core;

    @SideOnly(Side.CLIENT)
    public static void initModels () {
        infusion_core.initModel();
    }
}
