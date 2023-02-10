package org.example.HW2.PartOne;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] argc)
    {
        String name = "Author", email = "author@mail.com";
        char gender = 'm';
        Author author = new Author(name,email,gender);
        System.out.println(author);
        System.out.print("enter author's email: ");
        Scanner scanner = new Scanner(System.in);
        email = scanner.next();
        author.setEmail(email);
        System.out.printf("author's new email: %s\nauthor's name: %s\nauthor's gender: %c",author.getEmail(),author.getName(),author.getGender());
    }

}
