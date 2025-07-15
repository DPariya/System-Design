package DesignPatterns.behavioral.iterator.solution;

// The object being iterated over.

public class Book {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
