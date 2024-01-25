package part1.condionalStatements;

import java.util.Scanner;;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a year:");
        int year = Integer.valueOf(scanner.nextLine());

        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println("Not leap year");
        } else {
            System.out.println("Leap year");
        }
    }
}
