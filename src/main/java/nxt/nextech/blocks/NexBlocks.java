package nxt.nextech.blocks;


import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

public final class NexBlocks {

    //Ores
    public static Block OreCadmium;
    public static Block OreIridium;
    public static Block OreCopper;
    public static Block OreUranium;
    public static Block OreOsmium;
    public static Block OreWolfram;
    public static Block OreOsmiridium;
    public static Block OrePlatinum;
    public static Block OreNickel;
    public static Block OreSulfur;
    public static Block OreTitanium;
    public static Block OreGallium;
    public static Block OreSilver;
    public static Block OreThorium;
    public static Block OreCoalAnthracite;
    public static Block OrePotassiumNitrate;

    //Machines
    public static BlockContainer Forge;
    public static Block ForgeActive;

    public static final void init() {

        //Ores
        GameRegistry.registerBlock(OreCadmium = new OreCadmium("OreCadmium", Material.rock), "OreCadmium");
        GameRegistry.registerBlock(OreIridium = new OreIridium("OreIridium", Material.rock), "OreIridium");
        GameRegistry.registerBlock(OreCopper = new OreCopper("OreCopper", Material.rock), "OreCopper");
        GameRegistry.registerBlock(OreUranium = new OreUranium("OreUranium", Material.rock), "OreUranium");
        GameRegistry.registerBlock(OreOsmium = new OreOsmium("OreOsmium", Material.rock), "OreOsmium");
        GameRegistry.registerBlock(OreWolfram = new OreWolfram("OreWolfram", Material.rock), "OreWolfram");
        GameRegistry.registerBlock(OreOsmiridium = new OreOsmiridium("OreOsmiridium", Material.rock), "OreOsmiridium");
        GameRegistry.registerBlock(OrePlatinum = new OrePlatinum("OrePlatinum", Material.rock), "OrePlatinum");
        GameRegistry.registerBlock(OreNickel = new OreNickel("OreNickel", Material.rock), "OreNickel");
        GameRegistry.registerBlock(OreSulfur = new OreSulfur("OreSulfur", Material.rock), "OreSulfur");
        GameRegistry.registerBlock(OreTitanium = new OreTitanium("OreTitanium", Material.rock), "OreTitanium");
        GameRegistry.registerBlock(OreGallium = new OreGallium("OreGallium", Material.rock), "OreGallium");
        GameRegistry.registerBlock(OreSilver = new OreSilver("OreSilver", Material.rock), "OreSilver");
        GameRegistry.registerBlock(OreThorium = new OreThorium("OreThorium", Material.rock), "OreThorium");
        GameRegistry.registerBlock(OreCoalAnthracite = new OreCoalAnthracite("OreCoalAnthracite", Material.rock), "OreCoalAnthracite");
        GameRegistry.registerBlock(OrePotassiumNitrate = new OrePotassiumNitrate("OrePotassiumNitrate", Material.rock), "OrePotassiumNitrate");

        //Machines
        //GameRegistry.registerBlock(Forge = new Forge("Forge", Material.iron), "Forge");
        //GameRegistry.registerBlock(Forge = new ForgeActive("ForgeActive", Material.iron), "ForgeActive");
    }
}