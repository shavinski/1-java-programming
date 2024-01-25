package part2.methods;

public class DivisibleThree {
    public static void main(String[] args) {
        divisibleByThree(2, 12);
    }

    public static void divisibleByThree(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
