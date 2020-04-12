package nxt.nextech.crafting;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import nxt.nextech.blocks.NexBlocks;
import nxt.nextech.items.NexItems;

public class NexCraft {

    public static final void init() {
        //Shaped
        GameRegistry.addRecipe(new ItemStack(NexItems.PlateTitanium), new Object[]{"xxx", " y ", " y ", 'x', NexItems.IngotTitanium, 'y', NexItems.IngotUranium,});
        GameRegistry.addRecipe(new ItemStack(NexBlocks.Forge, 1), new Object[]{"xxx", "xox", "xxx", Character.valueOf('x'), Items.iron_ingot, Character.valueOf('o'), Blocks.furnace});
        //GameRegistry.addRecipe(new ItemStack(NexBlocks.BarrelRadio, 1), new Object[]{"xmx", "mom", "xmx", Character.valueOf('m'), NexItems.IngotOsmium, Character.valueOf('x'), NexItems.PlateIridium});
        GameRegistry.addRecipe(new ItemStack(NexItems.PlateIridium, 2), new Object[]{"xxx", "xox", "xxx", Character.valueOf('x'), NexItems.IngotIridium, Character.valueOf('o'), NexItems.IngotOsmium});


        //Shapeless
        //GameRegistry.addShapelessRecipe(new ItemStack(MinecrewBlock.AdvancedMachineFrame, 1), new Object[]{MinecrewBlock.MachineFrame, Blocks.field_150484_ah});


        //Furnace recipes here
        GameRegistry.addSmelting(NexItems.ChunkCadmium, new ItemStack(NexItems.IngotCadmium, 1), 1700.0F);
        GameRegistry.addSmelting(NexItems.ChunkCopper, new ItemStack(NexItems.IngotCopper, 1), 1600.0F);
        GameRegistry.addSmelting(NexItems.ChunkGallium, new ItemStack(NexItems.IngotGallium, 1), 1600.0F);
        GameRegistry.addSmelting(NexItems.ChunkIridium, new ItemStack(NexItems.IngotIridium, 1), 1600.0F);
        GameRegistry.addSmelting(NexItems.ChunkOsmium, new ItemStack(NexItems.IngotOsmium, 1), 1600.0F);
        GameRegistry.addSmelting(NexItems.ChunkSilver, new ItemStack(NexItems.IngotSilver, 1), 1600.0F);
        //GameRegistry.addSmelting(NexItems.ChunkThorium, new ItemStack(NexItems.Ingot, 1), 1600.0F);
        GameRegistry.addSmelting(NexItems.ChunkTitanium, new ItemStack(NexItems.IngotTitanium, 1), 1600.0F);
        GameRegistry.addSmelting(NexItems.ChunkUranium, new ItemStack(NexItems.IngotUranium, 1), 1600.0F);
    }
}