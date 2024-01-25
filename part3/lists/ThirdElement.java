package part3.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter names (press Enter to finish):");

        while (true) {
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }

            names.add(name);
        }

        System.out.println(names.get(2));
    }
}
