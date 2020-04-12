package nxt.nextech.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import nxt.nextech.items.NexItems;
import nxt.nextech.main.Main;

public class OreNickel extends Block {

    protected OreNickel(String OreNickel, Material material) {
        super(material);
        this.setBlockName(OreNickel);
        this.setBlockTextureName(Main.nextech + ":" + OreNickel);
        this.setCreativeTab(NexItems.tabTech);
        this.setHardness(5.0F);
        this.setResistance(4.0F);
        this.setHarvestLevel("pickaxe", 3);
    }
}