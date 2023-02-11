package org.example.HW2.PartSeven;

import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable<Book> {
    private String author;
    private String name;
    private int yearOfWriting;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfWriting() {
        return yearOfWriting;
    }

    public void setYearOfWriting(int yearOfWriting) {
        this.yearOfWriting = yearOfWriting;
    }

    public Book(String author, String name, int yearOfWriting) {
        this.author = author;
        this.name = name;
        this.yearOfWriting = yearOfWriting;
    }

    @Override
    public int compareTo(Book o) {
        if (o==null)
            return 1;
        return this.yearOfWriting-o.yearOfWriting;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", yearOfWriting=" + yearOfWriting +
                '}';
    }

    public void getAll()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter author's name, name of book and age of its writing:");
        author = scanner.next();
        name = scanner.next();
        yearOfWriting = scanner.nextInt();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfWriting == book.yearOfWriting && Objects.equals(author, book.author) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, yearOfWriting);
    }
}
