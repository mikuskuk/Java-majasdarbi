package io.codelex.oop.summary.ordersandinvoices;

import java.util.ArrayList;
import java.util.List;

public class OrderProgram {
    public static void main(String[] args) {
        Item foodItem = new FoodItem("Milk", 0.75, "01.08.2023");
        Item electronicsItem = new ElectronicsItem("Radio", 25.00, 100);
        Item householdItem = new HouseholdItem("Bucket", 5.00, "red");

        List<Item> items = new ArrayList<>();
        Order order = new Order(items);
        order.addItem(foodItem);
        order.addItem(electronicsItem);
        order.addItem(householdItem);
        order.addItem(new ItemPacking());

        Invoice invoice = new Invoice(order, "INV123");

        System.out.println(invoice.generateInvoiceText());
    }
}
