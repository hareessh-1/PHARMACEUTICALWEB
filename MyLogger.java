package sample.model;

import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class MyLogger {
    private static final Logger logger = Logger.getLogger("MyLog");

    public MyLogger(String text) {
        FileHandler fh = null;
        try {
            fh = new FileHandler("MyLog.log",true);
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            logger.info(text);
            fh.close();
        } catch (Exception e) {
            logger.warning("Failed to create log file: " + e.getMessage());
        }
    }
}
