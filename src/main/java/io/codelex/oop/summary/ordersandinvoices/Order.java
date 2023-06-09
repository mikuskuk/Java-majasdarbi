package io.codelex.oop.summary.ordersandinvoices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<SellableThing> items;

    public Order(List<Item> items) {
        this.items = new ArrayList<>();
    }

    public void addItem(SellableThing item) throws BadFoodException {
        if (item instanceof FoodItem) {
            FoodItem foodItem = (FoodItem) item;
            LocalDate bestBefore = LocalDate.parse(foodItem.getBestBefore(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            if (bestBefore.isBefore(LocalDate.now())) {
                throw new BadFoodException("Cannot add food item with an expiration date in the past.");
            }
        }
        items.add(item);
    }

    public List<SellableThing> getItems() {
        return items;
    }

    public String getItemsList() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            SellableThing item = items.get(i);
            sb.append(i + 1).append(". ").append(item.fullInfo()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
