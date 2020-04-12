package nxt.nextech.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import nxt.nextech.items.NexItems;
import nxt.nextech.main.Main;

import java.util.ArrayList;

public class OreCopper extends Block {

    protected OreCopper(String OreCopper, Material material) {
        super(material);
        this.setBlockName(OreCopper);
        this.setBlockTextureName(Main.nextech + ":" + OreCopper);
        this.setCreativeTab(NexItems.tabTech);
        this.setHardness(3.5F);
        this.setResistance(4.0F);
        this.setHarvestLevel("pickaxe", 2);
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        drops.add(new ItemStack(NexItems.ChunkCopper, world.rand.nextInt(1) + 1));
        return drops;

    }
}