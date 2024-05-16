package part5.learningOOP;

public class Timer {
    private int seconds;
    private int milliseconds;
    private int limit;

    public Timer() {
        this.seconds = 0;
        this.milliseconds = 0;
        this.limit = 100;
    }

    public void advance() {
        this.milliseconds++;

        if (milliseconds == limit) {
            this.milliseconds = 0;
            this.seconds++;
        }
    }

    public String toString() {
        return this.seconds + "." + this.milliseconds;
    }
}
