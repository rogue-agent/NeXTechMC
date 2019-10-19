package nxt.nextech.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import net.minecraft.world.World;
import nxt.nextech.items.NexItems;
import nxt.nextech.main.Main;


public class Forge extends Block//Container
{

    public Forge(String Forge, Material material) {
        super(material);
        this.setBlockName(Forge);
        this.setBlockTextureName(Main.nextech + ":" + Forge);
        this.setCreativeTab(NexItems.tabTech);
        this.setHardness(4.5F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 3);
        stepSound = soundTypeMetal;
        blockParticleGravity = 1.0F;
        slipperiness = 0.6F;
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        lightOpacity = 20; // cast a light shadow
        setTickRandomly(false);
        useNeighborBrightness = false;
    }

    public static void updateBlockState(boolean b, World worldObj, int xCoord, int yCoord, int zCoord) {
    }
}