package io.codelex.knowledgecheck.exercise2;

public class BasketFullException extends RuntimeException {
    public BasketFullException() {
        super("Basket is full");
    }
}
