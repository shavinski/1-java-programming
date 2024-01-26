package part3.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class SumList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println("Input some numbers: ");
        while (true) {
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == -1) {
                break;
            }

            nums.add(userNum);
        }

        int sum = 0;

        for (int num: nums) {
            sum += num;
        }

        System.out.println("Sum of nums: " + sum);
    }
}
