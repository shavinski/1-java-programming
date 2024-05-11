package part3.arrays;

public class PrintInStars {
    public static void main(String[] args) {
        int[] array = {5,1,3,4,2};

        for (int i = 0; i <= array.length; i++) {
            int currentNum = array[i];

            for (int j = 0; j < currentNum; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
