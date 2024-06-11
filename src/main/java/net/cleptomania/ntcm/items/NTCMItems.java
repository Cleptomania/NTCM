package net.cleptomania.ntcm.items;

import net.minecraft.item.Item;

import cpw.mods.fml.common.registry.GameRegistry;

public class NTCMItems {

    public static Item fancyItem;

    public static void preInit() {
        fancyItem = new FancyItem();
        GameRegistry.registerItem(fancyItem, fancyItem.getUnlocalizedName());
    }
}
