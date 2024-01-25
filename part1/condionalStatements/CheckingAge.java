package part1.condionalStatements;
import java.util.Scanner;

public class CheckingAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = Integer.valueOf(scanner.nextLine());

        if (age <= 0 || age >= 120) {
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
        }
    }
}
