package part4.introToOOP;

import part4.introToOOP.Person;
import part4.introToOOP.Whistle;
import part4.introToOOP.Door;
import part4.introToOOP.Product;
import part4.introToOOP.DecreasingCounter;
import part4.introToOOP.Debt;

public class Main {
    public static void main(String[] args) {
        Debt mortgage = new Debt(120000.0, 1.20);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        mortgage.printBalance();
    }
}
