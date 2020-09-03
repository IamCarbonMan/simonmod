package carbyx.simonmod.registry;

import carbyx.simonmod.SimonMod;
import carbyx.simonmod.blocks.CoreInfuser;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockRegistry {
    @GameRegistry.ObjectHolder(SimonMod.MODID + ":" + "core_infuser")
    public static CoreInfuser core_infuser;

    @SideOnly(Side.CLIENT)
    public static void initModels () {
        core_infuser.initModel();
    }
}
