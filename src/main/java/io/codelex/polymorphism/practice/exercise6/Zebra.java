package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {

    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
        setFoodEaten(0);
    }

    @Override
    public void makeSound() {
        System.out.println("Iaaaah");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            setFoodEaten(getFoodEaten() + food.getQuantity());
        } else {
            System.out.println(getAnimalType() + " are not eating that type of food!");
        }
    }
}
