import java.util.Scanner;

public class SumSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last Number?");
        int userInput = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= userInput; i++) {
            sum += i;
        }

        System.out.println("Sum: " + sum);
    }
}
