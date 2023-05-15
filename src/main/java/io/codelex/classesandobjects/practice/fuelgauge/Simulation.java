package io.codelex.classesandobjects.practice.fuelgauge;

public class Simulation {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge();
        Odometer ododometer = new Odometer();

        for (int i = 0; i < 70; i++) {
            fuelGauge.incrementFuel();
        }

        while (fuelGauge.getCurrentFuel() > 0) {
            ododometer.incrementMileage();
            ododometer.decreaseFuel(fuelGauge);

            System.out.println("Mileage: " + ododometer.getCurrentMileage() + " km");
            System.out.println("Fuel: " + fuelGauge.getCurrentFuel() + " liters");
        }
    }
}
