package part3.arrays;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first index");
        int firstIndex = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter second index");
        int secondIndex = Integer.valueOf(scanner.nextLine());

        System.out.println(" ");

    
        int helper = numbers[firstIndex];
        numbers[firstIndex] = numbers[secondIndex];
        numbers[secondIndex] = helper;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
    }
}
