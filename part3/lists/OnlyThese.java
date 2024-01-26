package part3.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlyThese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        int userNum = 0;

        System.out.println("Input some numbers: ");
        while (userNum != -1) {
            userNum = Integer.valueOf(scanner.nextLine());

            nums.add(userNum);
        }

        System.out.print("From where: ");
        int fromWhere = Integer.valueOf(scanner.nextLine());
        System.out.print("To where: ");
        int toWhere = Integer.valueOf(scanner.nextLine());

        for (int i = fromWhere; i <= toWhere; i++) {
            System.out.println(nums.get(i));
        }
    }
}
