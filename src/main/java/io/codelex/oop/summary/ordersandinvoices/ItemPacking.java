package io.codelex.oop.summary.ordersandinvoices;

public class ItemPacking implements Service {
    private static final String NAME = "Item packing";
    private static final double PRICE = 5.0;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public String fullInfo() {
        return getName() + ", " + String.format("%.2f", getPrice()) + " EUR";
    }
}
