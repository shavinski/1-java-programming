package part3.arrays;

import java.util.Scanner;

public class IndexNoFound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[5];
        
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;
        
        System.out.println("Search for?");

        int userInput = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == userInput) {
                System.out.println(userInput + " is at index " + i);
            }
        }
    }
}
