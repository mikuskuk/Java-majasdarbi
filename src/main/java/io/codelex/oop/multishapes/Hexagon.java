package io.codelex.oop.multishapes;

public class Hexagon extends Shape {
    private final double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 6 * side;
    }

    @Override
    public double calculateArea() {
        return (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
    }
}
