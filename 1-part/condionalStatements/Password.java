package condionalStatements;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Password?");
        String password = scanner.nextLine();
        String correct = "Caput Draconis";

        if (password.equals(correct)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }

}
