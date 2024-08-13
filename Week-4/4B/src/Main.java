public class Main {
    public static void main(String[] args) {
        // Create handlers
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        // Set up chain of responsibility
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Create logger
        Logger logger = new Logger();

        // Create commands
        Command logInfo = new LogCommand(infoHandler, LogLevel.INFO, "This is an info message.");
        Command logDebug = new LogCommand(infoHandler, LogLevel.DEBUG, "This is a debug message.");
        Command logError = new LogCommand(infoHandler, LogLevel.ERROR, "This is an error message.");

        // Add commands to logger
        logger.addCommand(logInfo);
        logger.addCommand(logDebug);
        logger.addCommand(logError);

        // Process commands
        logger.processCommands();
    }
}
