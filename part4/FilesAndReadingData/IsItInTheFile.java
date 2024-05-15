package part4.FilesAndReadingData;

import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Options: names.txt or otherNames.txt");
        System.out.println("Name of file: ");
        String fileName = scanner.nextLine();

        System.out.println("Search for: ");
        String name = scanner.nextLine();

        try (Scanner scanner2 = new Scanner(Paths.get(fileName))) {
            while (scanner2.hasNextLine()) {
                if (scanner2.nextLine().equals(name)) {
                    System.out.println("Found!");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            System.out.println("Reading the file: " + fileName + " failed.");
        }

    }
}
