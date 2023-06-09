package io.codelex.oop.summary.ordersandinvoices;

public class ElectronicsItem extends AbstractItem {
    private final int power;

    public ElectronicsItem(String name, double price, int power) {
        super(name, price);
        this.power = power;
    }

    @Override
    public String fullInfo() {
        return String.format("%s, %.2f EUR, power: %dW", getName(), getPrice(), power);
    }
}
