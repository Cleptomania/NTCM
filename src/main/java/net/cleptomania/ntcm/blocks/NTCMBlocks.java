package net.cleptomania.ntcm.blocks;

import net.minecraft.block.Block;

import cpw.mods.fml.common.registry.GameRegistry;

public class NTCMBlocks {

    public static Block fancyBlock;

    public static void preInit() {
        fancyBlock = new FancyBlock();
        GameRegistry.registerBlock(fancyBlock, fancyBlock.getUnlocalizedName());
    }

}
