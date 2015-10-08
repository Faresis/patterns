package ua.dp.mign.log;

public class LogManager {

    private final Logger logger;

    LogManager() {
        logger = createLogger();
    }

    public void log(String message) {
        logger.info(message);
    }

    /*
     * This is a factory method pattern
     * which allows subclasses to decide which
     * class to instantiate.
     */
    Logger createLogger() {
        return new DefaultLogger();
    }
}
