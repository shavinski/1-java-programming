package calculatingWithNums;
import java.util.Scanner;

public class SumTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give first num");
        int firstNum = Integer.valueOf(scanner.nextLine());

        System.out.println("GIve second num");
        int secondNum = Integer.valueOf(scanner.nextLine());

        int sum = firstNum + secondNum;

        System.out.println("Here is the sum: " + sum);
    }
}
