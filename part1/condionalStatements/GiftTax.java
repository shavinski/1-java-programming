package part1.condionalStatements;

import java.util.Scanner;

public class GiftTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of gift");
        int gift = Integer.valueOf(scanner.nextLine());

        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift >= 5000 && gift <= 25000) { 
            double tax = (double) 100 + (gift - 5000) * .08;
            System.out.println("Tax:" + tax);
        } else if (gift > 25000 && gift <= 55000) {
            double tax = (double) (1700 + ((gift - 25000) * .10));
            System.out.println("Tax:" + tax);
        } else if (gift > 55000 && gift <= 200000) {
            double tax = (double) 4700 + (gift - 55000) * .12;
            System.out.println("Tax:" + tax);
        }
    }
}
