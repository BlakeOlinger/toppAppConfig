package com.practice;

/*
General TOPP App GUI Config Tool
 */

// TODO - Check for .../test install/config/<microservice>/*.config

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger =
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        logger.log(Level.INFO, "Main Thread - Start");

        logger.log(Level.INFO, "Main Thread - Exit");
    }
}
