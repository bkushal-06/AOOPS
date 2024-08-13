public class ErrorHandler extends LogHandler {
    @Override
    public void logMessage(LogLevel level, String message) {
        if (level == LogLevel.ERROR) {
            System.out.println("ERROR: " + message);
        } else if (nextHandler != null) {
            nextHandler.logMessage(level, message);
        }
    }
}
