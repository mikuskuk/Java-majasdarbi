package io.codelex.oop.shapes;

public class Test {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10.0, 5.0);

        System.out.println("Rectangle area: " + rect.getArea());
        System.out.println("Rectangle perimeter: " + rect.getPerimeter());

        Triangle triangle = new Triangle(5.0, 7.0);

        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
    }
}
