package io.codelex.knowledgecheck.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private static final int MAX_ITEMS = 10;
    private List<T> items;

    public Basket() {
        items = new ArrayList<>();
    }

    public void addToBasket(T item) {
        if (items.size() == MAX_ITEMS) {
            throw new BasketFullException();
        }
        items.add(item);
    }

    public void removeFromBasket() {
        if (items.isEmpty()) {
            throw new BasketEmptyException();
        }
        items.remove(items.size() - 1);
    }

    public int getItemCount() {
        return items.size();
    }
}
