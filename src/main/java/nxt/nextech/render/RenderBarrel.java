package nxt.nextech.render;

import nxt.nextech.models.Models;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

public class RenderBarrel {/*extends TileEntitySpecialRenderer {
    private final BarrelModel model = new BarrelModel();

    public BarrelRender() {
    }

    private void adjustRotatePivotViaMeta(World world, int x, int y, int z) {
        int meta = world.func_72805_g(x, y, z);
        GL11.glPushMatrix();
        GL11.glRotatef((float)(meta * -90), 0.0F, 0.0F, 1.0F);
        GL11.glPopMatrix();
    }

    public void func_147500_a(TileEntity te, double x, double y, double z, float scale) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
        ResourceLocation textures = new ResourceLocation("nextech:textures/blocks/RADIOBARREL.png");
        Minecraft.func_71410_x().field_71446_o.func_110577_a(textures);
        GL11.glPushMatrix();
        GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
        this.model.func_78088_a((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }

    private void adjustLightFixture(World world, int i, int j, int k, Block block) {
        Tessellator tess = Tessellator.field_78398_a;
        float brightness = (float)block.getLightValue(world, i, j, k);
        int skyLight = world.func_72802_i(i, j, k, 0);
        int modulousModifier = skyLight % 65536;
        int divModifier = skyLight / 65536;
        tess.func_78386_a(brightness, brightness, brightness);
        OpenGlHelper.func_77475_a(OpenGlHelper.field_77476_b, (float)modulousModifier, (float)divModifier);
    }
*/}