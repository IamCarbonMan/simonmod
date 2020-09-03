package carbyx.simonmod.items;

import carbyx.simonmod.SimonMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BaseItem extends Item {
    public BaseItem (String name, CreativeTabs tab) {
        super();
        this.setRegistryName(name);
        this.setUnlocalizedName(SimonMod.MODID + "." + name);
        this.setCreativeTab(tab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel () {
        ModelLoader.setCustomModelResourceLocation(this, 0,
                new ModelResourceLocation(this.getRegistryName(), "inventory"));
    }
}
