package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Skoda");
        cars.add("Volvo");
        cars.add("Porsche");
        cars.add("Volkswagen");
        cars.add("Subaru");
        cars.add("Nissan");
        cars.add("Mitsubishi");
        cars.add("Mercedes");
        System.out.println("List of cars: " + cars);

        cars.add(4, "Maserati");
        System.out.println("\nList of cars after new car added: " + cars);

        int lastPosition = cars.size() - 1;
        if (lastPosition >= 0) {
            cars.set(lastPosition, "Opel");
        }
        System.out.println("\nList of cars after changed value of last car on the list: " + cars);

        Collections.sort(cars);
        System.out.println("\nCars sorted alphabetically: " + cars);

        System.out.println("\nDoes list contains Foobar?: " + cars.contains("Foobar"));

        System.out.println();

        for (String car : cars) {
            System.out.println(car);
        }
    }

}
