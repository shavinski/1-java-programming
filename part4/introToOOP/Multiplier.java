package part4.introToOOP;

public class Multiplier {

    private int number;
    
    public Multiplier(int number) {
        this.number = number;
    }

    public int multiply(int number) {
        return this.number * number;
    }
}
