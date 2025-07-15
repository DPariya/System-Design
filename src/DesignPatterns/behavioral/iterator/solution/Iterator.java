package DesignPatterns.behavioral.iterator.solution;

//Generic Iterator Interface : Interface for iteration behavior.
public interface Iterator<T> {
    boolean hasNext();

    T next();

}
