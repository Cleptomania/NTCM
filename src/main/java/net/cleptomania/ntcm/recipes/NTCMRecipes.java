package net.cleptomania.ntcm.recipes;

import net.cleptomania.ntcm.blocks.NTCMBlocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;

public class NTCMRecipes {

    public static void preInit() {
        GameRegistry.addRecipe(
            new ItemStack(NTCMBlocks.fancyBlock),
            "XXX",
            "XYX",
            "XXX",
            'X',
            Items.diamond,
            'Y',
            new ItemStack(Items.dye, 1, 1));
    }
}
