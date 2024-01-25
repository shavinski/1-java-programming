package part2.methods;

import java.util.Scanner;

public class HoleInGround {
    public static void main(String[] args) {
        printText();
    }

    public static void printText() {
        System.out.println("How many times?");
        Scanner scanner = new Scanner(System.in);

        int ans = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < ans; i++) {
            System.out.println("In a hole in the ground there lived a method");
        }

    }
}
