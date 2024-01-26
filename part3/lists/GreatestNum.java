package part3.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        int userNum = 0;

        System.out.println("Input some numbers: ");
        while (userNum != -1) {
            userNum = Integer.valueOf(scanner.nextLine());

            nums.add(userNum);
        }

        int maxNum = nums.get(0);

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > maxNum) {
                maxNum = nums.get(i);
            }
        }

        System.out.println("The greatest number is " + maxNum + "!");
    }
}
