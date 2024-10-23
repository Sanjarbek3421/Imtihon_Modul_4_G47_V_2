package org.example.task_4;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomHandler {
    private static final Logger logger = Logger.getLogger("CustomLoger");
    static {
        try {
            String fileName = String.format("%tY.%<tm.%<td_%<tH:%<tM.log", System.currentTimeMillis());
            FileHandler fileHandler = new FileHandler(fileName, true);
            fileHandler.setFormatter(new CustomFormatter());
            logger.addHandler(fileHandler);
            logger.setLevel(Level.ALL);
            logger.setFilter(null);
            Logger rootLogger = Logger.getLogger("");
            rootLogger.setLevel(Level.OFF);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void log(String message) {
        logger.info(message);
    }
    public static void logError(String message, Throwable throwable) {
        logger.log(Level.SEVERE, message, throwable);
    }

}
