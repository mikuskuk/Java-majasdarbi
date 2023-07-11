package io.codelex.oop.cars;

import java.util.Objects;

public class Car {
    private final String name;
    private final String model;
    private final double price;
    private final int yearOfManufacture;
    private final Manufacturer manufacturer;
    private final EngineType engineType;

    public Car(String name, String model, double price, int yearOfManufacture, Manufacturer manufacturer, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturer = manufacturer;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && yearOfManufacture == car.yearOfManufacture && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(manufacturer, car.manufacturer) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturer, engineType);
    }

    @Override
    public String toString() {
        return "Car: " +
                "name:'" + name + '\'' +
                ", model:'" + model + '\'' +
                ", price:" + price +
                ", yearOfManufacture:" + yearOfManufacture +
                ", manufacturer:" + manufacturer +
                ", engineType:" + engineType;
    }
}
