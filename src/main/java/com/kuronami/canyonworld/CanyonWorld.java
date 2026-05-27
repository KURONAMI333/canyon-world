package com.kuronami.canyonworld;

import com.kuronami.isekaiapi.api.Isekai;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(CanyonWorld.MODID)
public final class CanyonWorld {
    public static final String MODID = "canyon_world";
    public static final String VERSION = "0.1.0";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CanyonWorld(IEventBus modBus) {
        LOGGER.info("Canyon World v{} loading", VERSION);
        LOGGER.info("Canyon World: Isekai API facade ready (query={}, remap={})",
                Isekai.query().getClass().getSimpleName(),
                Isekai.remap().getClass().getSimpleName());
    }
}
