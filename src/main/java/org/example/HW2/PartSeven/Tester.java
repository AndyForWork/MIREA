package org.example.HW2.PartSeven;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args)
    {
        Bookshelf bookshelf = new Bookshelf();
        System.out.println("Enter 1 to add book to bookshelf\n" +
                           "Enter 2 to delete book from bookshelf\n" +
                           "Enter 3 to sort books in bookshelf\n" +
                           "Enter 4 to see all books in bookshelf\n" +
                           "Enter 5 to exit this program");
        boolean stay = true;
        Scanner scanner = new Scanner(System.in);
        int n;
        while(stay)
        {
            Book book = new Book();
            n = scanner.nextInt();
            switch (n)
            {
                case 1:
                    book.getAll();
                    bookshelf.addBook(book);
                    break;
                case 2:
                    book.getAll();
                    bookshelf.getBook(book);
                    break;
                case 3:
                    bookshelf.sort();
                    break;
                case 4:
                    System.out.println(bookshelf);
                    break;
                case 5:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("you entered wrong command");
            }
        }
    }
}
