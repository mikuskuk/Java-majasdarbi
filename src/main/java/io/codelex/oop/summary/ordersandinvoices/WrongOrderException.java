package io.codelex.oop.summary.ordersandinvoices;

public class WrongOrderException extends RuntimeException {
    public WrongOrderException(String message) {
        super(message);
    }
}
