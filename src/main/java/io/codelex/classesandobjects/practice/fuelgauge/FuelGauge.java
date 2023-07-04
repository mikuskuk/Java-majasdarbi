package io.codelex.classesandobjects.practice.fuelgauge;

public class FuelGauge {
    private int currentFuel;

    public FuelGauge() {
        currentFuel = 0;
    }

    public int getCurrentFuel() {
        return currentFuel;
    }

    public void incrementFuel() {
        if (currentFuel < 70) {
            currentFuel++;
        }
    }

    public void decrementFuel() {
        if (currentFuel > 0) {
            currentFuel--;
        }
    }
}
