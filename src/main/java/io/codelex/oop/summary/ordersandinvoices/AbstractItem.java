package io.codelex.oop.summary.ordersandinvoices;

public abstract class AbstractItem implements Item {
    private final String name;
    private final double price;

    public AbstractItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
