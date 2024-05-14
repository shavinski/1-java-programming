package part3.usingStrings;

import java.util.Scanner;

public class AgeOfOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter names and values!");
        System.out.println("Example: jakob,24");

        int oldestAge = Integer.MIN_VALUE;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] nameAge = input.split(",");

            if (Integer.valueOf(nameAge[1]) > oldestAge) {
                oldestAge = Integer.valueOf(nameAge[1]);
            }
        }

        System.out.println("Oldest age entered: " + oldestAge);
    }
}
