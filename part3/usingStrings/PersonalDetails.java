package part3.usingStrings;

import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        Double averageBirthYears = 0.00;
        Double totalBirthYears = 0.00;

        System.out.println("Please enter a name and birth year");
        System.out.println("Example format: jakob,1999");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] nameAge = input.split(",");

            if (nameAge[0].length() > longestName.length()) {
                longestName = nameAge[0];
            }

            averageBirthYears += Integer.valueOf(nameAge[1]);
            totalBirthYears += 1;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years " + averageBirthYears / totalBirthYears);

    }
}
