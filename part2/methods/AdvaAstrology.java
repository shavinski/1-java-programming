package part2.methods;

public class AdvaAstrology {
    public static void main(String[] args) {
        printTriangle(4);
        System.out.println("");
        christmasTree(4);
        christmasTree(10);

    }

    public static void printSpaces(int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        
            System.out.println("");
        }
    }

    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
            printSpaces(height - i);

            System.out.println("");
        }

        printSpaces(height - 2);
        printStars(3);
        System.out.println("");
        printSpaces(height - 2);
        printStars(3);

        System.out.println("");
    }
}
