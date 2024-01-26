package part3.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println("Input some numbers: ");
        while (true) {
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == 9999) {
                break;
            }

            nums.add(userNum);
        }

        int smallestNum = nums.get(0);

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < smallestNum) {
                smallestNum = nums.get(i);
            }
        }

        System.out.println("Smallest number: " + smallestNum);

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == smallestNum) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
