package nxt.nextech.lib;

import nxt.nextech.blocks.NexBlocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import cpw.mods.fml.common.IWorldGenerator;

public class NexGen implements IWorldGenerator
{
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.dimensionId)
        {
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
                break;
        }
    }

    private void generateEnd(World world, Random random, int x, int z)
    {

    }

    private void generateSurface(World world, Random random, int x, int z)
    {
        this.addOreSpawn(NexBlocks.OreThorium, world, random, x, z, 4, 20, 3 + random.nextInt(3), 5, 15, 50);
        int Xcoord = x + random.nextInt(4);
        int Ycoord = 10 + random.nextInt(1);
        int Zcoord = z + random.nextInt(3);
        (new WorldGenMinable(NexBlocks.OreThorium, 1, 3, Blocks.stone)).generate(world, random, Xcoord, Ycoord, Zcoord);

        this.addOreSpawn(NexBlocks.OreIridium, world, random, x, z, 3, 15, 5 + random.nextInt(3), 5, 15, 50);
        (new WorldGenMinable(NexBlocks.OreIridium, 1, 4, Blocks.stone)).generate(world, random, Xcoord, Ycoord, Zcoord);

        this.addOreSpawn(NexBlocks.OreCadmium, world, random, x, z, 3, 16, 4 + random.nextInt(3), 5, 15, 50);
        (new WorldGenMinable(NexBlocks.OreCadmium, 1, 4, Blocks.stone)).generate(world, random, Xcoord, Ycoord, Zcoord);

        this.addOreSpawn(NexBlocks.OreCopper, world, random, x, z, 6, 23, 54 + random.nextInt(3), 5, 15, 50);
        (new WorldGenMinable(NexBlocks.OreCopper, 1, 8, Blocks.stone)).generate(world, random, Xcoord, Ycoord, Zcoord);

        this.addOreSpawn(NexBlocks.OreUranium, world, random, x, z, 65, 34, 54 + random.nextInt(3), 5, 15, 50);
        (new WorldGenMinable(NexBlocks.OreUranium, 1, 15, Blocks.stone)).generate(world, random, Xcoord, Ycoord, Zcoord);

        this.addOreSpawn(NexBlocks.OreOsmium, world, random, x, z, 56, 4, 5 + random.nextInt(3), 5, 15, 50);
        (new WorldGenMinable(NexBlocks.OreOsmium, 1, 6, Blocks.stone)).generate(world, random, Xcoord, Ycoord, Zcoord);

        this.addOreSpawn(NexBlocks.OreWolfram, world, random, x, z, 4, 5, 3 + random.nextInt(3), 5, 15, 50);
        (new WorldGenMinable(NexBlocks.OreWolfram, 1, 6, Blocks.stone)).generate(world, random, Xcoord, Ycoord, Zcoord);

        this.addOreSpawn(NexBlocks.OreOsmiridium, world, random, x, z, 5, 4, 5 + random.nextInt(3), 5, 15, 50);
        (new WorldGenMinable(NexBlocks.OreOsmiridium, 1, 3, Blocks.stone)).generate(world, random, Xcoord, Ycoord, Zcoord);

        this.addOreSpawn(NexBlocks.OrePlatinum, world, random, x, z, 6, 7, 8 + random.nextInt(3), 5, 15, 50);
        (new WorldGenMinable(NexBlocks.OrePlatinum, 1, 5, Blocks.stone)).generate(world, random, Xcoord, Ycoord, Zcoord);

        this.addOreSpawn(NexBlocks.OreNickel, world, random, x, z, 54, 7, 56 + random.nextInt(3), 5, 15, 50);
        (new WorldGenMinable(NexBlocks.OreNickel, 1, 8, Blocks.stone)).generate(world, random, Xcoord, Ycoord, Zcoord);

        this.addOreSpawn(NexBlocks.OreSulfur, world, random, x, z, 45, 56, 2 + random.nextInt(3), 5, 15, 50);
        (new WorldGenMinable(NexBlocks.OreSulfur, 1, 15, Blocks.stone)).generate(world, random, Xcoord, Ycoord, Zcoord);

        this.addOreSpawn(NexBlocks.OreTitanium, world, random, x, z, 23, 43, 65 + random.nextInt(3), 5, 15, 50);
        (new WorldGenMinable(NexBlocks.OreTitanium, 1, 4, Blocks.stone)).generate(world, random, Xcoord, Ycoord, Zcoord);

        this.addOreSpawn(NexBlocks.OreGallium, world, random, x, z, 23, 16, 9 + random.nextInt(3), 5, 15, 50);
        (new WorldGenMinable(NexBlocks.OreGallium, 1, 7, Blocks.stone)).generate(world, random, Xcoord, Ycoord, Zcoord);

        this.addOreSpawn(NexBlocks.OreSilver, world, random, x, z, 16, 2, 4 + random.nextInt(3), 5, 15, 50);
        (new WorldGenMinable(NexBlocks.OreSilver, 1, 6, Blocks.stone)).generate(world, random, Xcoord, Ycoord, Zcoord);

        this.addOreSpawn(NexBlocks.OreCoalAnthracite, world, random, x, z, 50, 15, 30 + random.nextInt(3), 5, 15, 50);
        (new WorldGenMinable(NexBlocks.OreCoalAnthracite, 1, 6, Blocks.stone)).generate(world, random, Xcoord, Ycoord, Zcoord);
    }

    private void generateNether(World world, Random random, int x, int z)
    {

    }

    /**
     * Adds an Ore Spawn to Minecraft. Simply register all Ores to spawn with this method in your Generation method in your IWorldGeneration extending Class
     *
     * @param The Block to spawn
     * @param The World to spawn in
     * @param A Random object for retrieving random positions within the world to spawn the Block
     * @param An int for passing the X-Coordinate for the Generation method
     * @param An int for passing the Z-Coordinate for the Generation method
     * @param An int for setting the maximum X-Coordinate values for spawning on the X-Axis on a Per-Chunk basis
     * @param An int for setting the maximum Z-Coordinate values for spawning on the Z-Axis on a Per-Chunk basis
     * @param An int for setting the maximum size of a vein
     * @param An int for the Number of chances available for the Block to spawn per-chunk
     * @param An int for the minimum Y-Coordinate height at which this block may spawn
     * @param An int for the maximum Y-Coordinate height at which this block may spawn
     **/
    public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
    {
        assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

        int diffBtwnMinMaxY = maxY - minY;
        for (int x = 5; x < chancesToSpawn; x++)
        {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
            break;
        }
    }
}