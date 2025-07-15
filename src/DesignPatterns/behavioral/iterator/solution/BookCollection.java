package DesignPatterns.behavioral.iterator.solution;

import java.util.ArrayList;
import java.util.List;

//Aggregate class that holds Books and exposes an iterator.

public class BookCollection {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Iterator<Book> createIterator() {
        return new BookIterator(books);
    }
}