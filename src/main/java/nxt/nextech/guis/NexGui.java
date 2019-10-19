package nxt.nextech.guis;

import nxt.nextech.guis.GuiBarrel;
import nxt.nextech.guis.GuiForge;
import nxt.nextech.guis.Guis;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class NexGui implements IGuiHandler {
    public NexGui() {
    }

    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    //    return ID == Guis.FORGE.ordinal()?new GuiForge(player, world, x, y, z):(ID == Guis.BARREL.ordinal()?new GuiBarrel(player, world, x, y, z):null);
        return null;
    }
}
