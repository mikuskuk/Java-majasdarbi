package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StorageHouseTest {

    @Test
    public void testAddItemsAndPrint() {
        StorageHouse<String> storageHouse = new StorageHouse<>("Item one");
        storageHouse.addMoreItems("Item two");
        storageHouse.addMoreItems("Item three");

        System.out.println("Printing Items:");
        storageHouse.printItems();

        Optional<String> maybeFirst = storageHouse.getMaybeFirstItem();
        assertTrue(maybeFirst.isPresent());
        assertEquals("Item one", maybeFirst.get());
    }

    @Test
    public void testGetMaybeFirstWithEmptyStorage() {
        StorageHouse<Integer> storageHouse = new StorageHouse<>(13);

        storageHouse.addMoreItems(22);
        storageHouse.addMoreItems(8);
        storageHouse.addMoreItems(69);

        Optional<Integer> maybeFirst = storageHouse.getMaybeFirstItem();
        assertTrue(maybeFirst.isPresent());
        assertEquals(13, maybeFirst.get());
    }

    @Test
    public void testGetMaybeFirstWithNotEmptyStorage() {
        StorageHouse<Double> storageHouse = new StorageHouse<>(1.13);

        storageHouse.addMoreItems(1.11);
        Optional<Double> maybeFirst = storageHouse.getMaybeFirstItem();
        assertTrue(maybeFirst.isPresent());
        assertEquals(1.13, maybeFirst.get());
    }

    @Test
    public void testGetMaybeFirstWithEmptyStorageDifferentType() {
        StorageHouse<String> storageHouse = new StorageHouse<>("Test");

        Optional<String> maybeFirst = storageHouse.getMaybeFirstItem();
        assertTrue(maybeFirst.isPresent());
        assertEquals("Test", maybeFirst.get());
    }

    @Test
    public void testGetMaybeFirstWithNotEmptyStorageDifferentType() {
        StorageHouse<Boolean> storageHouse = new StorageHouse<>(true);

        Optional<Boolean> maybeFirst = storageHouse.getMaybeFirstItem();
        assertTrue(maybeFirst.isPresent());
        assertEquals(true, maybeFirst.get());
    }

}
