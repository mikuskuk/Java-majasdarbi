package io.codelex.oop.summary.ordersandinvoices;

public class HouseholdItem extends AbstractItem {
    private final String color;

    public HouseholdItem(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }

    @Override
    public String fullInfo() {
        return String.format("%s, %.2f EUR, color: %s", getName(), getPrice(), color);
    }
}
