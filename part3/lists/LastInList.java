package part3.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Give names (Enter to escape):");

        while (true) {
            String name = scanner.nextLine();
            
            if (name.equals("")) {
                int length = names.size();
                System.out.println(names.get(length - 1));
                break;
            }
            
            names.add(name);
        }

    }
}
