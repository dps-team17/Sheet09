package team17.sheet09.client;


public class Stopwatch {

    private long time_running = 0;

    /**
     * Starts the timer
     */
    public void Start() {
        time_running = System.nanoTime();
    }

    /**
     * Stops the timer
     */
    public void Stop() {
        time_running = System.nanoTime() - time_running;
    }

    /**
     * The time between the start and stop event in milliseconds
     *
     * @return measured time in milliseconds
     */
    public double getMillis() {
        return time_running / 1000000.0;
    }
}
