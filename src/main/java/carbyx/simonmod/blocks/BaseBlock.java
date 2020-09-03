package carbyx.simonmod.blocks;

import carbyx.simonmod.SimonMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BaseBlock extends Block {
    public BaseBlock (String name, Material mat, CreativeTabs tab) {
        super(mat);
        this.setUnlocalizedName(SimonMod.MODID + "." + name);
        this.setRegistryName(name);
        this.setCreativeTab(tab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel () {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0,
                new ModelResourceLocation(this.getRegistryName(), "inventory"));
    }
}
