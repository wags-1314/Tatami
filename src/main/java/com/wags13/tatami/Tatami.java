package com.wags13.tatami;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Tatami.ID, name = Tatami.NAME, version = Tatami.VERSION)
public class Tatami {
    public static final String ID = "tatami";
    public static final String NAME = "Tatami";
    public static final String VERSION = "1.0.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }
}
