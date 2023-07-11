package io.codelex.oop.multishapes;

public class Qube extends ThreeDShape {
    private double side;

    public Qube(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 6 * side * side;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }
}
