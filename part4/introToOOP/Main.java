package part4.introToOOP;

import part4.introToOOP.Person;
import part4.introToOOP.Whistle;
import part4.introToOOP.Door;
import part4.introToOOP.Product;
import part4.introToOOP.DecreasingCounter;

public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }
}
