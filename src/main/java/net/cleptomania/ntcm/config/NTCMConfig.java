package net.cleptomania.ntcm.config;

import net.cleptomania.ntcm.NTCM;
import net.minecraftforge.common.config.Configuration;

import com.gtnewhorizon.gtnhlib.config.Config;

@Config(modid = NTCM.MODID, category = Configuration.CATEGORY_GENERAL)
public class NTCMConfig {

    @Config.Comment("Enable Default Recipes From NTCM")
    @Config.DefaultBoolean(true)
    @Config.RequiresMcRestart
    public static boolean enableNTCMRecipes;
}
