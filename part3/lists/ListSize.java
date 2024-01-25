package part3.lists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Input names (When done hit enter):");

        while (true) {
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }

            names.add(name);
        }

        System.out.println(names.size());
    }
}
