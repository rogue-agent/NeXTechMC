package nxt.nextech.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import nxt.nextech.items.NexItems;
import nxt.nextech.main.Main;

public class OreCadmium extends Block {

    protected OreCadmium(String OreCadmium, Material material) {
        super(material);
        this.setBlockName(OreCadmium);
        this.setBlockTextureName(Main.nextech + ":" + OreCadmium);
        this.setCreativeTab(NexItems.tabTech);
        this.setHardness(4.0F);
        this.setResistance(6.0F);
        this.setHarvestLevel("pickaxe", 4);
    }
}