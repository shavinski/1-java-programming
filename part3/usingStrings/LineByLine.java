package part3.usingStrings;

import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a few words! ");

        String input = scanner.nextLine();
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
