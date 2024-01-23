package calculatingWithNums;
import java.util.Scanner;

public class Seconds {
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days do you want to convert to seconds?");

        int days = Integer.valueOf(scanner.nextLine());
        System.out.println("You gavve " + days);

        int daysToSeconds = 86400 * days;
        System.out.println("Seconds: " + daysToSeconds);
    }
}
