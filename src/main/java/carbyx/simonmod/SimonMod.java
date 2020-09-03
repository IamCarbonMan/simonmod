package carbyx.simonmod;

import carbyx.simonmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = SimonMod.MODID, name = SimonMod.NAME, version = SimonMod.VERSION)
public class SimonMod {
    public static final String MODID = "simonmod";
    public static final String NAME = "OlManSimon";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "carbyx.simonmod.proxy.ClientProxy",
                serverSide = "carbyx.simonmod.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static SimonMod instance;

    @Mod.EventHandler
    public void preInit (FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init (FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
