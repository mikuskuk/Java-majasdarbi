package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        String input;

        do {
            System.out.println("Enter animal information or 'End' to exit:");
            input = scanner.nextLine();

            if (!input.equals("End")) {
                String[] animalInfo = input.split(" ");
                String animalType = animalInfo[0];
                String animalName = animalInfo[1];
                double animalWeight = Double.parseDouble(animalInfo[2]);
                String animalLivingRegion = animalInfo[3];

                Animal animal;
                switch (animalType) {
                    case "Mouse" -> animal = new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
                    case "Zebra" -> animal = new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
                    case "Cat" -> {
                        String breed = animalInfo[4];
                        animal = new Cat(animalName, animalType, animalWeight, animalLivingRegion, breed);
                    }
                    case "Tiger" -> animal = new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
                    default -> animal = null;
                }

                if (animal != null) {
                    animals.add(animal);
                    animal.makeSound();
                }

                System.out.println("Enter food information:");
                input = scanner.nextLine();
                String[] foodInfo = input.split(" ");
                String foodType = foodInfo[0];
                int quantity = Integer.parseInt(foodInfo[1]);

                Food food;
                switch (foodType) {
                    case "Vegetable" -> food = new Vegetable(quantity);
                    case "Meat" -> food = new Meat(quantity);
                    default -> food = null;
                }

                if (food != null) {
                    feedAnimal(animal, food);
                }
            }
        } while (!input.equals("End"));

        printAnimalInfo(animals);
    }

    private static void feedAnimal(Animal animal, Food food) {
        if (animal instanceof Mouse || animal instanceof Zebra) {
            if (food instanceof Vegetable) {
                animal.eat(food);
            } else {
                System.out.println(animal.getAnimalType() + "s are not eating that type of food!");
            }
        } else if (animal instanceof Cat) {
            animal.eat(food);
        } else if (animal instanceof Tiger) {
            if (food instanceof Meat) {
                animal.eat(food);
            } else {
                System.out.println("Tigers are not eating that type of food!");
            }
        }
    }

    private static void printAnimalInfo(List<Animal> animals) {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        for (Animal animal : animals) {
            String foodEaten = decimalFormat.format(animal.getFoodEaten());
            String animalInfo = animal.getAnimalType() +
                    "[" +
                    animal.getAnimalName() +
                    ", " +
                    (animal instanceof Cat ? ((Cat) animal).getBreed() + ", " : "") +
                    animal.getAnimalWeight() +
                    ", " +
                    (animal instanceof Mammal ? ((Mammal) animal).getLivingRegion() : "") +
                    ", " +
                    foodEaten +
                    "]";

            System.out.println(animalInfo);
        }
    }
}



