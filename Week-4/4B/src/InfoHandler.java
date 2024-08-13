public class InfoHandler extends LogHandler {
    @Override
    public void logMessage(LogLevel level, String message) {
        if (level == LogLevel.INFO) {
            System.out.println("INFO: " + message);
        } else if (nextHandler != null) {
            nextHandler.logMessage(level, message);
        }
    }
}
