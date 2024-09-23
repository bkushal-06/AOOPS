import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleTimerTest {

    private SimpleTimer simpleTimer;

    @BeforeEach
    public void setUp() {
        simpleTimer = new SimpleTimer();
    }

    @Test
    public void testSetCountdownTime() {
        simpleTimer.setCountdownTime(10);
        assertEquals(10, simpleTimer.getRemainingTime());
    }

    @Test
    public void testStartTimer() throws InterruptedException {
        simpleTimer.setCountdownTime(3);
        simpleTimer.start();
        Thread.sleep(2000); // Sleep for 2 seconds
        long remainingTime = simpleTimer.getRemainingTime();
        assertTrue(remainingTime <= 1 && remainingTime >= 0);
    }

    @Test
    public void testStopTimer() throws InterruptedException {
        simpleTimer.setCountdownTime(5);
        simpleTimer.start();
        Thread.sleep(2000); // Sleep for 2 seconds
        simpleTimer.stop();
        long remainingTimeAfterStop = simpleTimer.getRemainingTime();
        Thread.sleep(2000); // Sleep for another 2 seconds
        assertEquals(remainingTimeAfterStop, simpleTimer.getRemainingTime());
    }

    @Test
    public void testGetRemainingTime() throws InterruptedException {
        simpleTimer.setCountdownTime(5);
        simpleTimer.start();
        Thread.sleep(1000); // Sleep for 1 second
        assertEquals(4, simpleTimer.getRemainingTime());
    }

    @Test
    public void testStartTimerWithoutSettingTime() {
        assertThrows(IllegalArgumentException.class, () -> {
            simpleTimer.start();
        });
    }

    @Test
    public void testSetCountdownTimeWhileRunning() {
        simpleTimer.setCountdownTime(5);
        simpleTimer.start();
        assertThrows(IllegalStateException.class, () -> {
            simpleTimer.setCountdownTime(10);
        });
    }

    @Test
    public void testStartTimerTwice() {
        simpleTimer.setCountdownTime(5);
        simpleTimer.start();
        assertThrows(IllegalStateException.class, () -> {
            simpleTimer.start();
        });
    }

    @Test
    public void testStopTimerWithoutStarting() {
        assertThrows(IllegalStateException.class, () -> {
            simpleTimer.stop();
        });
    }
}
