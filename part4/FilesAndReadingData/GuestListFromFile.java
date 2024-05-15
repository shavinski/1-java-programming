package part4.FilesAndReadingData;

import java.nio.file.Paths;
import java.util.Scanner;

public class GuestListFromFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        System.out.println("Options: names.txt or otherNames.txt");

        String input = scanner.nextLine();

        try (Scanner scanner2 = new Scanner(Paths.get(input))) {
            while(scanner2.hasNextLine()) {
                System.out.println(scanner2.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
