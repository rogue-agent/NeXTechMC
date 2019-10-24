package nxt.nextech.main;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import nxt.nextech.crafting.NexCraft;
import nxt.nextech.lib.*;


@Mod(modid = Main.nextech, name = Main.nextechm, version = Main.nextv)
public class Main {

    public static final String nextech = "NeXT";
    public static final String nextechm = "NeXTech Mod";
    public static final String nextv = "b4.1710";
    public static final String nexgui = "nexgui";


    @Mod.Instance
    public static Main instance = new Main();



    @SidedProxy(clientSide="nxt.nextech.lib.ClientProxy", serverSide="nxt.nextech.lib.ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }

}