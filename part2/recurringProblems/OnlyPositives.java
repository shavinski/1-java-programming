package part2.recurringProblems;
import java.util.Scanner;

public class OnlyPositives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a num:");
            int answer = Integer.valueOf(scanner.nextLine());

            if (answer < 0) {
                System.out.println("Unsuitable Number");
                continue;
            } else if (answer > 0) {
                System.out.println(answer * answer);
                continue;
            } else if (answer == 0) {
                break;
            }
        }
    }
}
