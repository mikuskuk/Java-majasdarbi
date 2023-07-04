package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes. +
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice. +
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car. +
 * 3. Create one instance of an each car and add them to list. +
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one. +
 * 5. Print out the car name and speed of the fastest car +
 */
public class DragRace {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        Car audi = new Audi();
        Car bmw = new Bmw();
        Car ferrari = new Ferrari();
        Car lexus = new Lexus();
        Car subaru = new Subaru();
        Car tesla = new Tesla();

        cars.add(audi);
        cars.add(bmw);
        cars.add(ferrari);
        cars.add(lexus);
        cars.add(subaru);
        cars.add(tesla);

        for (int i = 0; i < 10; i++) {
            for (Car car : cars) {
                car.speedUp();
                if (car instanceof Boost) {
                    Boost boostCar = (Boost) car;
                    if (i == 2) {
                        boostCar.useNitrousOxideEngine();
                    }
                }
            }
        }

        Car fastestCar = cars.get(0);
        int maxSpeed = Integer.parseInt(fastestCar.showCurrentSpeed());
        for (Car car : cars) {
            int speed = Integer.parseInt(car.showCurrentSpeed());
            if (speed > maxSpeed) {
                maxSpeed = speed;
                fastestCar = car;
            }
        }

        System.out.println("Fastest car: " + fastestCar.getClass().getSimpleName());
        System.out.println("Speed: " + maxSpeed);
    }
}
