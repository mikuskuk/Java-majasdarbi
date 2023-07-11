package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarService {
    private final List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public void removeCar(Car car) {
        carList.remove(car);
    }

    public List<Car> getAllCars() {
        return new ArrayList<>(carList);
    }

    public List<Car> getCarsWithV12Engine() {
        List<Car> carsWithV12Engine = new ArrayList<>();
        for (Car car : carList) {
            if (car.getEngineType() == EngineType.V12) {
                carsWithV12Engine.add(car);
            }
        }
        return carsWithV12Engine;
    }

    public List<Car> getCarsProducedBefore(int year) {
        List<Car> carsProducedBefore = new ArrayList<>();
        for (Car car : carList) {
            if (car.getYearOfManufacture() < year) {
                carsProducedBefore.add(car);
            }
        }
        return carsProducedBefore;
    }

    public Car getMostExpensiveCar() {
        Car mostExpensive = null;
        double maxPrice = Double.MIN_VALUE;
        for (Car car : carList) {
            if (car.getPrice() > maxPrice) {
                maxPrice = car.getPrice();
                mostExpensive = car;
            }
        }
        return mostExpensive;
    }

    public Car getCheapestCar() {
        Car cheapest = null;
        double minPrice = Double.MAX_VALUE;
        for (Car car : carList) {
            if (car.getPrice() < minPrice) {
                minPrice = car.getPrice();
                cheapest = car;
            }
        }
        return cheapest;
    }

    public List<Car> getCarsWithMultipleManufacturers(int manufacturerCount) {
        List<Car> carsWithMultipleManufacturers = new ArrayList<>();
        for (Car car : carList) {
            int count = 0;
            if (car.getManufacturer() != null) {
                count++;
            }
            if (count >= manufacturerCount) {
                carsWithMultipleManufacturers.add(car);
            }
        }
        return carsWithMultipleManufacturers;
    }

    public List<Car> getCarsSortedByPrice(boolean ascending) {
        List<Car> sortedCars = new ArrayList<>(carList);
        sortedCars.sort(Comparator.comparingDouble(Car::getPrice));
        if (!ascending) {
            java.util.Collections.reverse(sortedCars);
        }
        return sortedCars;
    }

    public boolean hasCar(Car car) {
        return carList.contains(car);
    }

    public List<Car> getCarsByManufacturer(Manufacturer manufacturer) {
        List<Car> carsByManufacturer = new ArrayList<>();
        for (Car car : carList) {
            if (car.getManufacturer().equals(manufacturer)) {
                carsByManufacturer.add(car);
            }
        }
        return carsByManufacturer;
    }

    public List<Car> getCarsByManufacturerWithTheYearOfEstablishment(Manufacturer manufacturer, String comparisonOperator, int year) {
        List<Car> carsByManufacturer = new ArrayList<>();
        for (Car car : carList) {
            Manufacturer carManufacturer = car.getManufacturer();
            int yearEstablished = carManufacturer.getYearOfEstablishment();

            if (carManufacturer.equals(manufacturer) && switch (comparisonOperator) {
                case "<" -> yearEstablished < year;
                case ">" -> yearEstablished > year;
                case "<=" -> yearEstablished <= year;
                case ">=" -> yearEstablished >= year;
                case "=" -> yearEstablished == year;
                case "!=" -> yearEstablished != year;
                default -> false;
            }) {
                carsByManufacturer.add(car);
            }
        }
        return carsByManufacturer;
    }
}
