package io.codelex.knowledgecheck.exercise2;

public class Basket<T> {
    private static final int MAX_ITEMS = 10;
    private int itemCount;

    public Basket() {
        itemCount = 0;
    }

    public void addToBasket(T item) {
        if (itemCount == MAX_ITEMS) {
            throw new BasketFullException();
        }
        itemCount++;
    }

    public void removeFromBasket() {
        if (itemCount == 0) {
            throw new BasketEmptyException();
        }
        itemCount--;
    }

    public int getItemCount() {
        return itemCount;
    }
}
