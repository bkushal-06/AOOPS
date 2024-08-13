public class DebugHandler extends LogHandler {
    @Override
    public void logMessage(LogLevel level, String message) {
        if (level == LogLevel.DEBUG) {
            System.out.println("DEBUG: " + message);
        } else if (nextHandler != null) {
            nextHandler.logMessage(level, message);
        }
    }
}
