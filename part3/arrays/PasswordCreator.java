package part3.arrays;

import java.util.Random;
import java.util.Scanner;

public class PasswordCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String newPassword = generatePassword();
            System.out.println("Generated password: " + newPassword);
            System.out.println("\nAre you happy with this password? Enter yes or no");
            String happyUser = scanner.nextLine();
            if (happyUser.equals("yes")) {
                System.out.println("\nPerfect! Here is your new password: " + newPassword);
                break;
            }
        }

        scanner.close();
    }

    public static String generatePassword() {
        // Create a String that contains all characters for use in a password
        String randomCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*?";

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter your desired password length, length must be between 8 and 16");
        int passwordLength = 0;

        // Do a while loop for a user input asking for an integer between 8 and 16
        while (true) {
            int userInput = scanner.nextInt();

            // Validate this input in the loop
                // If it is good, then break the loop and store the user input
                // Else if it is not, repeat and ask again for user input
            if (userInput >= 8 && userInput <= 16) {
                passwordLength = userInput;
                break;
            } else {
                System.out.println("Make sure the number you enter includes or is between 8 and 16");
            }
        }

        // After validation

        // Create a String variable to be a the new user password
        // Create a loop, loop up until the user input Integer from earlier
            // Each iteration will get a random character from the string of characters
            // Append this character to the new password string

        String generatedPassword = "";
        Random random = new Random();
        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = random.nextInt(randomCharacters.length());
            char randomChar = randomCharacters.charAt(randomIndex);
            generatedPassword += randomChar;
        }

        return generatedPassword;
    }
}
