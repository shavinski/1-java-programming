package part1.calculatingWithNums;
import java.util.Scanner;

public class AverageTwoNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second num:");
        int secondNum = Integer.valueOf(scanner.nextLine());

        double average = (double) (firstNum + secondNum) / 2;

        System.out.println("The average is " + average);
    }
}
