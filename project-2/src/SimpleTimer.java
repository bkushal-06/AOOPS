import java.util.Timer;
import java.util.TimerTask;

public class SimpleTimer {
    private Timer timer;
    private long remainingTimeInMillis;
    private boolean isRunning;

    public SimpleTimer() {
        this.timer = new Timer();
        this.remainingTimeInMillis = 0;
        this.isRunning = false;
    }

    // Set countdown time in seconds
    public void setCountdownTime(long seconds) {
        if (isRunning) {
            throw new IllegalStateException("Timer is running, stop it before setting a new countdown time.");
        }
        this.remainingTimeInMillis = seconds * 1000;
    }

    // Start the timer
    public void start() {
        if (isRunning) {
            throw new IllegalStateException("Timer is already running.");
        }

        if (remainingTimeInMillis <= 0) {
            throw new IllegalArgumentException("Set a valid countdown time before starting the timer.");
        }

        isRunning = true;
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (remainingTimeInMillis > 0) {
                    remainingTimeInMillis -= 1000;
                } else {
                    stop();
                }
            }
        }, 0, 1000);
    }

    // Stop the timer
    public void stop() {
        if (!isRunning) {
            throw new IllegalStateException("Timer is not running.");
        }
        timer.cancel();
        isRunning = false;
    }

    // Get remaining time in seconds
    public long getRemainingTime() {
        return remainingTimeInMillis / 1000;
    }
}
