package part3.usingStrings;

import java.util.Scanner;

public class PrintThrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a word");
        String userInput = scanner.nextLine();

        for (int i = 0; i <= 3; i++) {
            System.out.print(userInput);    
        }
    }
}
b