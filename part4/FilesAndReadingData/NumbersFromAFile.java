package part4.FilesAndReadingData;

import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("File? ");
        String fileName = scanner.nextLine();

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());

        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int numsInRange = 0;

        try (Scanner scanner2 = new Scanner(Paths.get(fileName))) {
            while (scanner2.hasNextLine()) {
                int currentNum = Integer.valueOf(scanner2.nextLine());

                if (currentNum >= lowerBound && currentNum <= upperBound) {
                    numsInRange++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println(numsInRange);

    }
}
