package nxt.nextech.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import nxt.nextech.items.NexItems;
import nxt.nextech.main.Main;

import java.util.ArrayList;

public class OrePotassiumNitrate extends Block {

    protected OrePotassiumNitrate(String OrePotassiumNitrate, Material material) {
        super(material);
        this.setBlockName(OrePotassiumNitrate);
        this.setBlockTextureName(Main.nextech + ":" + OrePotassiumNitrate);
        this.setCreativeTab(NexItems.tabTech);
        this.setHardness(4.5F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 3);
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        drops.add(new ItemStack(NexItems.CoalAnthracite, world.rand.nextInt(1) + 1));
        drops.add(new ItemStack(NexItems.StonePebbles, world.rand.nextInt(1) + 1));
        return drops;

    }
}