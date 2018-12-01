package erik.mmm.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import erik.mmm.Main;

public class Utils {

    public static Logger logger;

    public static Logger getLogger() {
        if(logger == null)
            logger = LogManager.getFormatterLogger(Main.MOD_ID);
        return logger;
    }
}
