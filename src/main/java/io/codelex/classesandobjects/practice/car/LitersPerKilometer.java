package io.codelex.classesandobjects.practice.car;

import io.codelex.classesandobjects.practice.car.Car;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        carReading(scan);

        System.out.println("Enter data for next car!");

        carReading(scan);
    }

    private static void carReading(Scanner scan) {
        double startKilometers;
        double endKilometers;
        double liters;
        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();

        Car car = new Car(startKilometers, endKilometers, liters);

        System.out.println("Kilometers per liter are " + car.calculateConsumption());
        if (car.gasHog()) {
            System.out.println("Your car is a fuel graveyard!");
        } else if (car.economyCar()) {
            System.out.println("Your car is very economic!");
        } else {
            System.out.println("You car have pretty average fuel consumption!");
        }
    }
}
