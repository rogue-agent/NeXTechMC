package nxt.nextech.te;

import cpw.mods.fml.common.registry.GameRegistry;

import static nxt.nextech.main.Main.nextech;

public class NexTE {

    public static void mainRegistry(){
        registerTileEntity();
    }

    private static void registerTileEntity() {
        GameRegistry.registerTileEntity(ForgeTE.class, nextech.MODID);
    }

}