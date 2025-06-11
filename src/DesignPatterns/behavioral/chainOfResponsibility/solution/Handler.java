package DesignPatterns.behavioral.chainOfResponsibility.solution;

public abstract class Handler {
    protected Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public abstract void handler(Request request);

}
