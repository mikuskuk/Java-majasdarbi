package io.codelex.polymorphism.practice.exercise1;

public class Ferrari implements Car {

    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 25;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 25;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Rrrrarrrrr...");
    }
}
