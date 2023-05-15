package io.codelex.classesandobjects.practice;

public class Product {
    private String name;
    private double price;
    private int amount;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }

    public static void main(String[] args) {
        Product mouse = new Product("Logitech mouse", 70.00, 14);
        Product iPhone = new Product("iPhone 5s", 999.99, 3);
        Product epson = new Product("Epson EB-U05", 440.46, 1);

        mouse.printProduct();
        iPhone.printProduct();
        epson.printProduct();

        mouse.setPrice(50.00);
        iPhone.setAmount(1);
        epson.setPrice(200.20);

        System.out.println();
        System.out.println("SALE is HERE!");
        System.out.println();

        mouse.printProduct();
        iPhone.printProduct();
        epson.printProduct();
    }

    public void printProduct() {
        System.out.println(name + ", price " + price + " EUR, amount " + amount);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
