package io.codelex.knowledgecheck.exercise2;

public class BasketEmptyException extends RuntimeException {
    public BasketEmptyException() {
        super("Basket is empty");
    }
}
