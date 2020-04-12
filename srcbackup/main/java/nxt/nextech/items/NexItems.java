package nxt.nextech.items;


import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nxt.nextech.main.Main;

public final class NexItems {

    //items
    public static Item PelletsPlastic;
    public static Item StonePebbles;
    public static Item CoalAnthracite;

    //Platings
    public static Item PlateIridium;
    public static Item PlateTitanium;
    public static Item PlateSteel;
    public static Item PlateTitanGold;
    public static Item PlateOsmCadmium;

    //Dusts
    public static Item DustSulfur;
    public static Item DustTechnetium;
    public static Item DustPotassiumNitrate;

    //Chunks
    public static Item ChunkUranium;
    public static Item ChunkCopper;
    public static Item ChunkIridium;
    public static Item ChunkOsmium;
    public static Item ChunkOsmiridium;
    public static Item ChunkTitanium;
    public static Item ChunkGallium;
    public static Item ChunkSilver;
    public static Item ChunkCadmium;
    public static Item ChunkThorium;

    //Ingots
    public static Item IngotOsmium;
    public static Item IngotSilver;
    public static Item IngotGallium;
    public static Item IngotTitanium;
    public static Item IngotCopper;
    public static Item IngotIridium;
    public static Item IngotUranium;
    public static Item IngotCadmium;

    //Tools

    public static final void init() {

        //items
        PelletsPlastic = new Item().setUnlocalizedName("Plastic").setCreativeTab(tabTech).setTextureName(Main.nextech + ":PlasticPellets");
        GameRegistry.registerItem(PelletsPlastic, "Plastic");
        StonePebbles = new Item().setUnlocalizedName("StonePebbles").setCreativeTab(tabTech).setTextureName(Main.nextech + ":StonePebbles");
        GameRegistry.registerItem(StonePebbles, "StonePebbles");
        CoalAnthracite = new Item().setUnlocalizedName("CoalAnthracite").setCreativeTab(tabTech).setTextureName(Main.nextech + ":CoalAnthracite").setHasSubtypes(true).setMaxDamage(0);
        GameRegistry.registerItem(CoalAnthracite, "CoalAnthracite");


        //Platings
        PlateIridium = new Item().setUnlocalizedName("PlateIridium").setCreativeTab(tabTech).setTextureName(Main.nextech + ":PlateIridium");
        GameRegistry.registerItem(PlateIridium, "PlateIridium");
        PlateTitanium = new Item().setUnlocalizedName("PlateTitanium").setCreativeTab(tabTech).setTextureName(Main.nextech + ":PlateTitanium");
        GameRegistry.registerItem(PlateTitanium, "PlateTitanium");
        PlateSteel = new Item().setUnlocalizedName("PlateSteel").setCreativeTab(tabTech).setTextureName(Main.nextech + ":PlateSteel");
        GameRegistry.registerItem(PlateSteel, "PlateSteel");
        PlateTitanGold = new Item().setUnlocalizedName("PlateTitanGold").setCreativeTab(tabTech).setTextureName(Main.nextech + ":PlateTitanGold");
        GameRegistry.registerItem(PlateTitanGold, "PlateTitanGold");
        PlateOsmCadmium = new Item().setUnlocalizedName("PlateOsmCadmium").setCreativeTab(tabTech).setTextureName(Main.nextech + ":PlateOsmCadmium");
        GameRegistry.registerItem(PlateOsmCadmium, "PlateOsmCadmium");



        //Tools


        //Dusts
        DustTechnetium = new Item().setUnlocalizedName("DustTechnetium").setCreativeTab(tabTech).setTextureName(Main.nextech + ":DustTechnetium");
        GameRegistry.registerItem(DustTechnetium, "DustTechnetium");
        DustSulfur = new Item().setUnlocalizedName("DustSulfur").setCreativeTab(tabTech).setTextureName(Main.nextech + ":DustSulfur");
        GameRegistry.registerItem(DustSulfur, "DustSulfur");
        DustPotassiumNitrate = new Item().setUnlocalizedName("DustPotassiumNitrate").setCreativeTab(tabTech).setTextureName(Main.nextech + ":DustPotassiumNitrate");
        GameRegistry.registerItem(DustPotassiumNitrate, "DustPotassiumNitrate");


        //Ingots
        IngotOsmium = new Item().setUnlocalizedName("IngotOsmium").setCreativeTab(tabTech).setTextureName(Main.nextech + ":IngotOsmium");
        GameRegistry.registerItem(IngotOsmium, "IngotOsmium");
        IngotSilver = new Item().setUnlocalizedName("IngotSilver").setCreativeTab(tabTech).setTextureName(Main.nextech + ":IngotSilver");
        GameRegistry.registerItem(IngotSilver, "IngotSilver");
        IngotGallium = new Item().setUnlocalizedName("IngotGallium").setCreativeTab(tabTech).setTextureName(Main.nextech + ":IngotGallium");
        GameRegistry.registerItem(IngotGallium, "IngotGallium");
        IngotTitanium = new Item().setUnlocalizedName("IngotTitanium").setCreativeTab(tabTech).setTextureName(Main.nextech + ":IngotTitanium");
        GameRegistry.registerItem(IngotTitanium, "IngotTitanium");
        IngotCopper = new Item().setUnlocalizedName("IngotCopper").setCreativeTab(tabTech).setTextureName(Main.nextech + ":IngotCopper");
        GameRegistry.registerItem(IngotCopper, "IngotCopper");
        IngotIridium = new Item().setUnlocalizedName("IngotIridium").setCreativeTab(tabTech).setTextureName(Main.nextech + ":IngotIridium");
        GameRegistry.registerItem(IngotIridium, "IngotIridium");
        IngotUranium = new Item().setUnlocalizedName("IngotUranium").setCreativeTab(tabTech).setTextureName(Main.nextech + ":IngotUranium");
        GameRegistry.registerItem(IngotUranium, "IngotUranium");
        IngotCadmium = new Item().setUnlocalizedName("IngotCadmium").setCreativeTab(tabTech).setTextureName(Main.nextech + ":IngotCadmium");
        GameRegistry.registerItem(IngotCadmium, "IngotCadmium");


        //Chunks
        ChunkUranium = new Item().setUnlocalizedName("ChunkUranium").setCreativeTab(tabTech).setTextureName(Main.nextech + ":ChunkUranium");
        GameRegistry.registerItem(ChunkUranium, "ChunkUranium");
        ChunkCopper = new Item().setUnlocalizedName("ChunkCopper").setCreativeTab(tabTech).setTextureName(Main.nextech + ":ChunkCopper");
        GameRegistry.registerItem(ChunkCopper, "ChunkCopper");
        ChunkIridium = new Item().setUnlocalizedName("ChunkIridium").setCreativeTab(tabTech).setTextureName(Main.nextech + ":ChunkIridium");
        GameRegistry.registerItem(ChunkIridium, "ChunkIridium");
        ChunkOsmium = new Item().setUnlocalizedName("ChunkOsmium").setCreativeTab(tabTech).setTextureName(Main.nextech + ":ChunkOsmium");
        GameRegistry.registerItem(ChunkOsmium, "ChunkOsmium");
        ChunkOsmiridium = new Item().setUnlocalizedName("ChunkOsmiridium").setCreativeTab(tabTech).setTextureName(Main.nextech + ":ChunkOsmiridium");
        GameRegistry.registerItem(ChunkOsmiridium, "ChunkOsmiridium");
        ChunkTitanium = new Item().setUnlocalizedName("ChunkTitanium").setCreativeTab(tabTech).setTextureName(Main.nextech + ":ChunkTitanium");
        GameRegistry.registerItem(ChunkTitanium, "ChunkTitanium");
        ChunkGallium = new Item().setUnlocalizedName("ChunkGallium").setCreativeTab(tabTech).setTextureName(Main.nextech + ":ChunkGallium");
        GameRegistry.registerItem(ChunkGallium, "ChunkGallium");
        ChunkSilver = new Item().setUnlocalizedName("ChunkSilver").setCreativeTab(tabTech).setTextureName(Main.nextech + ":ChunkSilver");
        GameRegistry.registerItem(ChunkSilver, "ChunkSilver");
        ChunkCadmium = new Item().setUnlocalizedName("ChunkCadmium").setCreativeTab(tabTech).setTextureName(Main.nextech + ":ChunkCadmium");
        GameRegistry.registerItem(ChunkCadmium, "ChunkCadmium");
        ChunkThorium = new Item().setUnlocalizedName("ChunkThorium").setCreativeTab(tabTech).setTextureName(Main.nextech + ":ChunkThorium");
        GameRegistry.registerItem(ChunkThorium, "ChunkThorium");

    }

    public static final CreativeTabs tabTech = new CreativeTabs("techmod") {
        @Override
        public Item getTabIconItem() {
            return NexItems.PelletsPlastic;
        }
    };
}
