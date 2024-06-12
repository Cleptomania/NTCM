package net.cleptomania.ntcm.client.render;

import net.cleptomania.ntcm.NTCM;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class TESRFancierBlock extends TileEntitySpecialRenderer implements IItemRenderer {

    IModelCustom model = AdvancedModelLoader.loadModel(new ResourceLocation(NTCM.MODID, "obj/fancierblock.obj"));
    ResourceLocation texture = new ResourceLocation(NTCM.MODID, "textures/blocks/fancierblock.png");

    @Override
    public void renderTileEntityAt(TileEntity entity, double x, double y, double z, float randomTick) {
        bindTexture(texture);

        GL11.glPushMatrix();

        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glColor4f(1F, 0F, 0F, 1F);
        GL11.glTranslatef((float) x + 0.5F, (float) y + 0.0F, (float) z + 0.5F);
        GL11.glScalef(2.5F, 2.5F, 2.5F);

        model.renderAll();

        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        GL11.glPopMatrix();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        bindTexture(texture);

        GL11.glPushMatrix();
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glColor4f(1F, 0F, 0F, 1F);
        GL11.glTranslatef((float) 0 + 0.5F, (float) 0 + 0.0F, (float) 0 + 0.5F);
        GL11.glScalef(2.5F, 2.5F, 2.5F);

        model.renderAll();

        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        GL11.glPopMatrix();
    }
}
