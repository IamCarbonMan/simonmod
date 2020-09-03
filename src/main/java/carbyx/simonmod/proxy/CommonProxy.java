package carbyx.simonmod.proxy;

import carbyx.simonmod.blocks.CoreInfuser;
import carbyx.simonmod.registry.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit (FMLPreInitializationEvent e) {}
    public void init (FMLInitializationEvent e) {}
    public void postInit (FMLPostInitializationEvent e) {}

    @SubscribeEvent
    public static void registerBlocks (RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                new CoreInfuser()
        );
    }

    @SubscribeEvent
    public static void registerItems (RegistryEvent.Register<Item> e) {
        e.getRegistry().registerAll(
                new ItemBlock(BlockRegistry.core_infuser).setRegistryName(BlockRegistry.core_infuser.getRegistryName())
        );
    }
}
