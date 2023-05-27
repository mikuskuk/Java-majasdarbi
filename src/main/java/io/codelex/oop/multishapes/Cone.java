package io.codelex.oop.multishapes;

public class Cone extends ThreeDShape {
    private final double radius;
    private final double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double baseArea = Math.PI * radius * radius;
        double sideArea = Math.PI * radius * Math.sqrt(radius * radius + height * height);
        return baseArea + sideArea;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }
}
