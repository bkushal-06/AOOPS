public class Main {
    public static void main(String[] args) {
        
        Logger logger = Logger.getInstance();

        logger.log("This is a log message.");
        logger.log("Logging another message.");

        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("This should be the same logger instance.");
    }
}
