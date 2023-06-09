package io.codelex.oop.summary.ordersandinvoices;

public class FoodItem extends AbstractItem {
    private final String bestBefore;

    public FoodItem(String name, double price, String bestBefore) {
        super(name, price);
        this.bestBefore = bestBefore;
    }

    public String getBestBefore() {
        return bestBefore;
    }

    @Override
    public String fullInfo() {
        return String.format("%s, %.2f EUR, best before: %s", getName(), getPrice(), bestBefore);
    }
}
