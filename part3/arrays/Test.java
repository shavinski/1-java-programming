package part3.arrays;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class Test {
    public static void main(String[] args) {
        File output = new File("fruit.txt");
        try {
            Files.writeString(output.toPath(), "Banana", StandardOpenOption.CREATE);
            Files.writeString(output.toPath(), "Mango", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            Files.writeString(output.toPath(), "Pear", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
