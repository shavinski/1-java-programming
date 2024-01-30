package part3.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Give some names:");

        while (true) {
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }

            names.add(name);
        }

        System.out.print("Search for? ");
        String searchName = scanner.nextLine();

        if (names.contains(searchName)) {
            System.out.println(searchName + " was found!!!");
        } else {
            System.out.println(searchName + " was not found ;(");
        }
    }
}
