package nxt.nextech.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import nxt.nextech.items.NexItems;
import nxt.nextech.main.Main;

import java.util.ArrayList;

public class OreSilver extends Block {

    protected OreSilver(String OreSilver, Material material) {
        super(material);
        this.setBlockName(OreSilver);
        this.setBlockTextureName(Main.nextech + ":" + OreSilver);
        this.setCreativeTab(NexItems.tabTech);
        this.setHardness(4.0F);
        this.setResistance(4.0F);
        this.setHarvestLevel("pickaxe", 3);
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        drops.add(new ItemStack(NexItems.ChunkSilver, world.rand.nextInt(1) + 1));
        return drops;

    }
}