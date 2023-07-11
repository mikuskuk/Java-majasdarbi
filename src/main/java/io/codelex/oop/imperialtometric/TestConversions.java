package io.codelex.oop.imperialtometric;

public class TestConversions {
    public static void main(String[] args) {
        MeasurementConverter converter = new MeasurementConverter();

        double meters = 13;
        double yards = converter.convert(meters, ConversionType.METERS_TO_YARDS);
        System.out.println(meters + " meters are " + yards + " yards");

        double centimeters = 200;
        double inches = converter.convert(centimeters, ConversionType.CENTIMETERS_TO_INCHES);
        System.out.println(centimeters + " centimeters are " + inches + " inches");

        double kilometers = 7;
        double miles = converter.convert(kilometers, ConversionType.KILOMETERS_TO_MILES);
        System.out.println(kilometers + " kilometers are " + miles + " miles");

        double yards2 = 35;
        double meters2 = converter.convert(meters, ConversionType.YARDS_TO_METERS);
        System.out.println(yards2 + " yards are " + meters2 + " meters");
    }
}
