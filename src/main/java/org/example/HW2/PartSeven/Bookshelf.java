package org.example.HW2.PartSeven;

import java.util.Collections;
import java.util.LinkedList;

public class Bookshelf {
    private LinkedList<Book> books = new LinkedList<>();
    private int count;

    public void sort(){
        Collections.sort(books);
    }

    public void addBook(Book book){
        books.add(book);
        count = books.size();
    }

    public boolean getBook(Book book){
        if (books.contains(book)) {
            books.remove(book);
            count = books.size();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("books in bookshelf:\n");
        for(int i=0;i<count;i++)
            res.append(books.get(i).toString()+'\n');
        res.append("amount of books in bookshelf = " + count);
        return res.toString();

    }
}
