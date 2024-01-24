import java.util.Scanner;

public class Carry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Shall we carry on?");
            String answer = scanner.nextLine();

            if (answer.equals("no")) {
                break;
            }
        }
    }
}
