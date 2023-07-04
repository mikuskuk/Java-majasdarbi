package io.codelex.classesandobjects.practice.fuelgauge;

public class Odometer {
    private int currentMileage;

    public Odometer() {
        currentMileage = 0;
    }

    public int getCurrentMileage() {
        return currentMileage;
    }

    public void incrementMileage() {
        currentMileage++;
        if (currentMileage > 999999) {
            currentMileage = 0;
        }
    }

    public void decreaseFuel(FuelGauge fuelGauge) {
        if (currentMileage % 10 == 0) {
            fuelGauge.decrementFuel();
        }
    }
}
