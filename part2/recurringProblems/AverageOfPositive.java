package part2.recurringProblems;
import java.util.Scanner;

public class AverageOfPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give Number:");
            int answer = Integer.valueOf(scanner.nextLine());

            if (answer > 0) {
                count++;
                sum += answer;
            }

            if (answer == 0 && count == 0) {
                System.out.println("Cannot calculate the average.");
                break;
            } else if (answer == 0) {
                System.out.println("Average: " + (double) sum / count);
                break;
            }
        }

    }
}
