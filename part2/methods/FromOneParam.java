package part2.methods;

public class FromOneParam {
    public static void main(String[] args) {
        printUntilNumber(2);
    }

    public static void printUntilNumber(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
