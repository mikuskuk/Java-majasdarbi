package io.codelex.classesandobjects.practice.car;

import io.codelex.classesandobjects.practice.car.Car;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double startOdo;
        int mileage;
        double liters;

        carReading(scan);

        System.out.println("Enter data for next car!");

        carReading(scan);
    }

    private static void carReading(Scanner scan) {
        double startOdo;
        int mileage;
        double liters;
        System.out.println("Enter first reading: ");
        startOdo = scan.nextDouble();
        Car car = new Car(startOdo);

        System.out.println("Enter mileage for fill-up: ");
        mileage = scan.nextInt();
        System.out.println("Enter liters for fill-up: ");
        liters = scan.nextDouble();
        car.fillUp(mileage, liters);

        System.out.println("Fuel consumption: " + car.calculateConsumption());
        if (car.gasHog()) {
            System.out.println("Your car is a fuel graveyard!");
        } else if (car.economyCar()) {
            System.out.println("Your car is very economic!");
        } else {
            System.out.println("You car have pretty average fuel consumption!");
        }
    }
}
