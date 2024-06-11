package net.cleptomania.ntcm;

import net.cleptomania.ntcm.blocks.NTCMBlocks;
import net.cleptomania.ntcm.config.NTCMConfig;
import net.cleptomania.ntcm.items.NTCMItems;
import net.cleptomania.ntcm.recipes.NTCMRecipes;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {

        NTCMItems.preInit();
        NTCMBlocks.preInit();

        if (NTCMConfig.enableNTCMRecipes) {
            NTCMRecipes.preInit();
        }
    }

    public void init(FMLInitializationEvent event) {}

    public void postInit(FMLPostInitializationEvent event) {}

    public void serverStarting(FMLServerStartingEvent event) {}
}
