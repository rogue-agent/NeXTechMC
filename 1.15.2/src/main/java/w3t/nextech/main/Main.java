package w3t.nextech.main;

import w3t.nextech.main.*;
import w3t.nextech.items.*;

import net.minecraftforge.fml.common.Mod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Main.MODID)
public final class Main {

    public static final String MODID = "nextech";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public Main() {
        LOGGER.debug("If you see this, give yourself a pat on the shoulder");
    }
}
