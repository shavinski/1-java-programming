package part4.introToOOP;

public class Gauge {
    private int value;

    public Gauge() {
        this.value = 0;
    }

    public void increase() {
        this.value = this.value + 1;
    }

    public void decrease() {
        this.value = this.value - 1;
    }

    public int value() {
        return this.value;
    }

    public boolean full() {
        return this.value == 5;
    }
}
