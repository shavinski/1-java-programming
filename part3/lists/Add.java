package part3.lists;

public class Add {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 18;
        int num3 = 15;
        int num4 = 0;
        if (num1 > num3) {
            num4 = 4;
        } else {
            if (num2 > num3) {
                num4 = 5;
            }
        }
        System.out.println(num4);
    }
}
