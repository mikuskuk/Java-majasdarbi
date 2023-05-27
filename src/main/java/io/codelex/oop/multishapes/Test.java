package io.codelex.oop.multishapes;

import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(8, 12);
        Triangle tri = new Triangle(6, 4, 2, 3, 6);
        Hexagon hex = new Hexagon(9);
        Cone cone = new Cone(8, 16);
        Qube qube = new Qube(5);

        double rectPerimeter = rect.calculatePerimeter();
        double rectArea = rect.calculateArea();
        System.out.println("Perimeter for rectangle is " + String.format("%.2f", rectPerimeter) + " and area " + String.format("%.2f", rectArea));

        double triPerimeter = tri.calculatePerimeter();
        double triArea = tri.calculateArea();
        System.out.println("\nPerimeter for triangle is " + String.format("%.2f", triPerimeter) + " and area " + String.format("%.2f", triArea));

        double hexPerimeter = hex.calculatePerimeter();
        double hexArea = hex.calculateArea();
        System.out.println("\nPerimeter for hexagon is " + String.format("%.2f", hexPerimeter) + " and area " + String.format("%.2f", hexArea));

        double coneArea = cone.calculateArea();
        double coneVolume = cone.calculateVolume();
        System.out.println("\nArea for cone is " + String.format("%.2f", coneArea) + " and volume " + String.format("%.2f", coneVolume));

        double qubeArea = qube.calculateArea();
        double qubeVolume = qube.calculateVolume();
        System.out.println("\nArea for qube is " + String.format("%.2f", qubeArea) + " and volume " + String.format("%.2f", qubeVolume));
    }
}
