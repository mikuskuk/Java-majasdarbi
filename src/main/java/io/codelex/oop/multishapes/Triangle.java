package io.codelex.oop.multishapes;

public class Triangle extends Shape {
    private final double base;
    private final double height;
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
