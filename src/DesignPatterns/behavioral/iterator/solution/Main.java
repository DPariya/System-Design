package DesignPatterns.behavioral.iterator.solution;

public class Main {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();

        collection.addBook(new Book("Clean Code"));
        collection.addBook((new Book("DSA")));

        Iterator<Book> iterator = collection.createIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getTitle());
        }
    }
}
