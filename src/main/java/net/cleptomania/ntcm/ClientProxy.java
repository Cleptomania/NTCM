package net.cleptomania.ntcm;

import net.cleptomania.ntcm.blocks.NTCMBlocks;
import net.cleptomania.ntcm.client.render.TESRFancierBlock;
import net.cleptomania.ntcm.tile.TileEntityFancierBlock;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    TESRFancierBlock fancierBlockRenderer;

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);

        fancierBlockRenderer = new TESRFancierBlock();

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFancierBlock.class, fancierBlockRenderer);
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(NTCMBlocks.fancierBlock), fancierBlockRenderer);
    }

}
