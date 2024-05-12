package part3.usingStrings;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();


        if (username.equals("alex") && password.equals("sunshine")) {
            System.out.println("You have succesfully loged in " + username + "!");
        } else {
            System.out.println("Invalid username/password!");
        }
    }
}
