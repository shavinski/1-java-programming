package part4.ObjectsInAList;

import java.util.ArrayList;
import java.util.Scanner;

import part4.ObjectsInAList.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String bookTitle = scanner.nextLine();

            if (bookTitle.equals("")) {
                break;
            }

            System.out.print("Pages: ");
            int numPages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication Year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());

            Book newBook = new Book();
            newBook.setName(bookTitle);
            newBook.setPages(numPages);
            newBook.setPublicationYear(pubYear);

            books.add(newBook);
        }

        System.out.print("What info would you like to be printed?");
        System.out.println("Options: everything or name");

        String inputOption = scanner.nextLine();

        if (inputOption.equals("everything")) {
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i));
            }
        } else if (inputOption.equals("name")) {
            for (int i = 0; i< books.size(); i++) {
                System.out.println(books.get(i).getName());
            }
        }

    }
}
