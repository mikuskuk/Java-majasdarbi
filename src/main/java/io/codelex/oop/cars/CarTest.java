package io.codelex.oop.cars;

public class CarTest {
    public static void main(String[] args) {
        Manufacturer bmw = new Manufacturer("BMW", 1916, "Germany");
        Manufacturer skoda = new Manufacturer("Skoda", 1895, "Czech Republic");
        Manufacturer lambo = new Manufacturer("Lamborghini", 1963, "Italy");

        Car bmw1 = new Car("BMW", "840", 20000.00, 1992, bmw, EngineType.V8);
        Car skoda1 = new Car("Skoda", "Superb", 12000.00, 2005, skoda, EngineType.V6);
        Car lambo1 = new Car("Lamborghini", "Aventador", 800000.00, 2022, lambo, EngineType.V12);

        CarService carService = new CarService();

        carService.addCar(bmw1);
        carService.addCar(skoda1);
        carService.addCar(lambo1);

        System.out.println("List of all cars:");
        carService.getAllCars().forEach(System.out::println);

        System.out.println("Remove car from list:");
        carService.removeCar(bmw1);

        System.out.println("\nAll cars after removal:");
        carService.getAllCars().forEach(System.out::println);

        carService.addCar(bmw1);

        System.out.println("\nCars with V12 engine:");
        carService.getCarsWithV12Engine().forEach(System.out::println);

        System.out.println("\nCars produced before 1999:");
        carService.getCarsProducedBefore(1999).forEach(System.out::println);

        System.out.println("\nThe most expensive car:");
        System.out.println(carService.getMostExpensiveCar());

        System.out.println("\nThe cheapest car");
        System.out.println(carService.getCheapestCar());

        System.out.println("\nThe car with at least 3 manufacturers:");
        carService.getCarsWithMultipleManufacturers(3).forEach(System.out::println);

        System.out.println("\nList of cars sorted by price in ascending order:");
        carService.getCarsSortedByPrice(true).forEach(System.out::println);

        System.out.println("\nCheck if Skoda is in the list:");
        System.out.println(carService.hasCar(skoda1));

        System.out.println("\nList of cars manufactured by BMW:");
        carService.getCarsByManufacturer(bmw).forEach(System.out::println);

        System.out.println("\nList of cars by manufacturer with establishment year older than 1993:");
        carService.getCarsByManufacturerWithTheYearOfEstablishment(bmw, "<", 1993).forEach(System.out::println);
    }
}
