package io.codelex.polymorphism.practice.exercise6;

public abstract class Food {
    protected Integer quantity;

    public Food(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public abstract String getFoodType();
}
