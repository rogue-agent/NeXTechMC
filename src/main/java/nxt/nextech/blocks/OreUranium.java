package nxt.nextech.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import nxt.nextech.items.NexItems;
import nxt.nextech.main.Main;

import java.util.ArrayList;

public class OreUranium extends Block {

    protected OreUranium(String OreUranium, Material material) {
        super(material);
        this.setBlockName(OreUranium);
        this.setBlockTextureName(Main.nextech + ":" + OreUranium);
        this.setCreativeTab(NexItems.tabTech);
        this.setHardness(4.0F);
        this.setResistance(3.0F);
        this.setHarvestLevel("pickaxe", 2);
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        drops.add(new ItemStack(NexItems.ChunkUranium, world.rand.nextInt(1) + 1));
        if (world.rand.nextFloat() < 0.2F)
            drops.add(new ItemStack(NexItems.DustTechnetium));
        return drops;

    }
}