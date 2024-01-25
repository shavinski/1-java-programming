package part2.moreLoops;
import java.util.Scanner;

public class RepBreRem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");

        int sum = 0;
        int count = 0;
        int oddNums = 0;
        int evenNums = 0;
        
        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput == -1) {
                System.out.println("Thx bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + count);
                System.out.println("Average: " + (double) sum / count);
                System.out.println("Even: " + evenNums);
                System.out.println("Odd: " + oddNums);
                break;
            }

            if (userInput % 2 == 0) {
                evenNums++;
            } else {
                oddNums++;
            }

            sum += userInput;
            count++;
        }  
    }
}
