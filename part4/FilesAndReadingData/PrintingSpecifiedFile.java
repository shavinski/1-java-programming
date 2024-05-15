package part4.FilesAndReadingData;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingSpecifiedFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("WHich file should have its contents printed?");
        System.out.println("Options: song.txt or data.txt");

        String input = scanner.nextLine();

        try(Scanner scanner2 = new Scanner(Paths.get(input))) {
            while(scanner2.hasNextLine()) {
                String line = scanner2.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
