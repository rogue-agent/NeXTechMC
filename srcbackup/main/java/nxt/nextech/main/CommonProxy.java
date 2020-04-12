package nxt.nextech.main;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import nxt.nextech.crafting.NexCraft;
import nxt.nextech.guis.NexGui;
import nxt.nextech.lib.*;
import nxt.nextech.items.NexItems;
import nxt.nextech.blocks.NexBlocks;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        NexItems.init();
        NexBlocks.init();
        NexCraft.init();
        NexGui.init();

    }

    public void init(FMLInitializationEvent e) {
        GameRegistry.registerWorldGenerator(new NexGen(), 0);
        NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new NexGui());
        GameRegistry.registerFuelHandler(new NexFuelhandler());
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}