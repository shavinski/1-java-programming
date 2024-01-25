package part3.lists;

import java.util.ArrayList;

public class IndexOutBounds {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(2);
        nums.add(5);
        nums.add(6);

        nums.get(3);
    }
}
