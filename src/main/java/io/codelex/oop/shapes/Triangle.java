package io.codelex.oop.shapes;

public class Triangle extends Shape {
    private final double width;
    private final double height;

    public Triangle(double width, double height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * width * height;
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.sqrt((width * width) + (height * height));
        return width + height + hypotenuse;
    }
}
