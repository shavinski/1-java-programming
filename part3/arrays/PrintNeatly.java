package part3.arrays;

public class PrintNeatly {
    public static void main(String[] args) {
        int[] array = {5,1,3,4,2};

        for (int i = 0; i <= array.length - 1; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
                break;
            }

            System.out.print(array[i] + ", ");
        }
    }
}
