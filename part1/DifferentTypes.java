package part1;
import java.util.Scanner;

public class DifferentTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Give a string:");
        String myString = scanner.nextLine();

        System.out.println("Give an integer:");
        int myInt = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give a double:");
        double myDouble = Double.valueOf(scanner.nextLine());

        System.out.println("Give a boolean:");
        boolean myBoolean = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string " + myString);
        System.out.println("You gave the integer " + myInt);
        System.out.println("You gave the double " + myDouble);
        System.out.println("You gave the boolean " + myBoolean);
    }
}
