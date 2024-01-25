package part2.moreLoops;
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give num: ");
        int userNumber = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i <= userNumber; i++) {
            System.out.println(i);
        }
    }
}
