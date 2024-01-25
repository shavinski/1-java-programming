package part2.methods;

public class StarSign {
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);

        printSquare(4);

        printRectangle(17, 3);

        printTriangle(4);
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }

        System.out.println("");
    }

    public static void printSquare(int size) {
        System.out.println("");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printRectangle(int width, int height) {
        System.out.println("");

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    public static void printTriangle(int size) {
        System.out.println("");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
