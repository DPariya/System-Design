package DesignPatterns.behavioral.iterator.solution;

import java.util.List;

//Implements Iterator<Book>, iterates over the list
public class BookIterator implements Iterator<Book> {
    private final List<Book> books;
    private int position = 0;

    public BookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return position < books.size(); // true/false
    }

    public Book next() {
        return books.get(position++);
    }

}
