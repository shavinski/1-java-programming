package part3.usingStrings;

import java.util.Scanner;

public class AvClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a phrase please!");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("av")) {
                System.out.println(words[i]);
                break;
            }
        }
    }
}
