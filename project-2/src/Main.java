public class Main {
    public static void main(String[] args) {
        // Create an instance of SimpleTimer
        SimpleTimer timer = new SimpleTimer();

        // Set countdown time to 10 seconds
        timer.setCountdownTime(10);
        System.out.println("Countdown time set to 10 seconds.");

        // Start the timer
        timer.start();
        System.out.println("Timer started.");

        // Continuously check remaining time every second
        while (timer.getRemainingTime() > 0) {
            System.out.println("Remaining time: " + timer.getRemainingTime() + " seconds");
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Timer should be stopped automatically when time runs out
        System.out.println("Time is up!");
        
        // Check if the timer is running
        if (timer.getRemainingTime() == 0) {
            System.out.println("Timer stopped.");
        }
    }
}
