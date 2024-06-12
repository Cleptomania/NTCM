package net.cleptomania.ntcm.blocks;

import net.cleptomania.ntcm.tile.TileEntityFancierBlock;
import net.minecraft.block.Block;

import cpw.mods.fml.common.registry.GameRegistry;

public class NTCMBlocks {

    public static Block fancyBlock;
    public static Block fancierBlock;

    public static void preInit() {
        fancyBlock = new FancyBlock();
        GameRegistry.registerBlock(fancyBlock, fancyBlock.getUnlocalizedName());
        fancierBlock = new FancierBlock();
        GameRegistry.registerBlock(fancierBlock, fancierBlock.getUnlocalizedName());
        GameRegistry.registerTileEntity(TileEntityFancierBlock.class, fancierBlock.getUnlocalizedName());
    }

}
