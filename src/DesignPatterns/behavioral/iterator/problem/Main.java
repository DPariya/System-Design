package DesignPatterns.behavioral.iterator.problem;

public class Main {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();
        collection.addBook(new Book("Design Pattern"));
        collection.addBook(new Book("Clean Code"));

        // ❌ Direct access to internal list
        for (Book book : collection.getBooks()) {
            System.out.println(book.getTitle());
        }
    }
}
