package io.codelex.classesandobjects.practice;

public class PrintProducts {

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

}
