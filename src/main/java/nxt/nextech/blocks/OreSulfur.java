package nxt.nextech.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import nxt.nextech.items.NexItems;
import nxt.nextech.main.Main;

import java.util.ArrayList;

public class OreSulfur extends Block {

    protected OreSulfur(String OreSulfur, Material mat) {
        super(mat);
        this.setBlockName(OreSulfur);
        this.setBlockTextureName(Main.nextech + ":" + OreSulfur);
        this.setCreativeTab(NexItems.tabTech);
        this.setHardness(2.0F);
        this.setResistance(2.0F);
        this.setHarvestLevel("pickaxe", 2);
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        drops.add(new ItemStack(NexItems.DustSulfur, world.rand.nextInt(3) + 1));
        drops.add(new ItemStack(NexItems.StonePebbles, world.rand.nextInt(2) + 1));
        return drops;
    }
}