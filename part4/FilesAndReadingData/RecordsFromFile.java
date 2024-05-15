package part4.FilesAndReadingData;

import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Option: mockCSV.txt");
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();

        try (Scanner scanner2 = new Scanner(Paths.get(fileName))) {
            while (scanner2.hasNextLine()) {
                String line = scanner2.nextLine();

                String[] nameAge = line.split(",");
                String name = nameAge[0];
                String age = "";

                if (nameAge[1].equals("1")) {
                    age += nameAge[1] + " year";
                } else {
                    age += nameAge[1] + " years";
                }

                System.out.println(name + ", " + "age: " + age);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
