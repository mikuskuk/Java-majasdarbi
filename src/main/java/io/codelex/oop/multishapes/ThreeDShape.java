package io.codelex.oop.multishapes;

public abstract class ThreeDShape extends Shape {
    public abstract double calculateVolume();

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
