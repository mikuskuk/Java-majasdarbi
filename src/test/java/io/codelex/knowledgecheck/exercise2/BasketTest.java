package io.codelex.knowledgecheck.exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class BasketTest {

    @Test
    public void testAddToBasket() {
        Basket<Apple> appleBasket = new Basket<>();
        assertEquals(0, appleBasket.getItemCount());

        appleBasket.addToBasket(new Apple());
        assertEquals(1, appleBasket.getItemCount());

        appleBasket.addToBasket(new Apple());
        assertEquals(2, appleBasket.getItemCount());
    }

    @Test
    public void testRemoveFromBasket() {
        Basket<Mushroom> mushroomBasket = new Basket<>();
        assertEquals(0, mushroomBasket.getItemCount());

        mushroomBasket.addToBasket(new Mushroom());
        mushroomBasket.addToBasket(new Mushroom());
        assertEquals(2, mushroomBasket.getItemCount());

        mushroomBasket.removeFromBasket();
        assertEquals(1, mushroomBasket.getItemCount());

        mushroomBasket.removeFromBasket();
        assertEquals(0, mushroomBasket.getItemCount());
    }

    @Test
    public void testBasketFullException() {
        Basket<Apple> appleBasket = new Basket<>();
        assertEquals(0, appleBasket.getItemCount());

        for (int i = 0; i < 10; i++) {
            appleBasket.addToBasket(new Apple());
        }
        assertEquals(10, appleBasket.getItemCount());

        try {
            appleBasket.addToBasket(new Apple());
            fail("Expected BasketFullException to be thrown");
        } catch (BasketFullException e) {

        }
    }

    @Test
    public void testBasketEmptyException() {
        Basket<Mushroom> mushroomBasket = new Basket<>();
        assertEquals(0, mushroomBasket.getItemCount());

        try {
            mushroomBasket.removeFromBasket();
            fail("Expected BasketEmptyException to be thrown");
        } catch (BasketEmptyException e) {

        }
    }
}
