package part4.introToOOP;

import java.util.Scanner;

import part4.introToOOP.*;

public class Main {
    public static void main(String[] args) {
        Statistics sumAll = new Statistics();
        Statistics sumEven = new Statistics();
        Statistics sumOdd = new Statistics();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter numbers, when finished type -1 to exit");

        while(true) {
            int input = scanner.nextInt();
            
            if (input == -1) {
                break;
            }

            if (input % 2 == 0) {
                sumEven.addNumber(input);
            } else {
                sumOdd.addNumber(input);
            }

            sumAll.addNumber(input);
        }

        System.out.println("Sum: " + sumAll.sum());
        System.out.println("Sum even: " + sumEven.sum());
        System.out.println("Sum odd: " + sumOdd.sum());
        
    }
}
