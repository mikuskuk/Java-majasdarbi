package io.codelex.classesandobjects.practice.car;

public class Car {
    private static double startKilometers;
    private static double endKilometers;
    private static double liters;

    public Car(double startOdo, double endingOdo, double liters) {
        this.startKilometers = startOdo;
        this.endKilometers = endingOdo;
        this.liters = liters;
    }

    public Car(double startOdo) {
        this.startKilometers = startOdo;
    }

    public void fillUp(int mileage, double liters) {
        startKilometers = endKilometers;
        endKilometers = mileage;
        this.liters = liters;
    }

    public double calculateConsumption() {
        double distance = endKilometers - startKilometers;
        return (liters / distance) * 100;
    }

    public boolean gasHog() {
        if (calculateConsumption() > 15.0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean economyCar() {
        if (calculateConsumption() < 5.0) {
            return true;
        } else {
            return false;
        }
    }
}
