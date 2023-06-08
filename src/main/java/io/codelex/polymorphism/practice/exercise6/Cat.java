package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {

    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
        setFoodEaten(0);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        setFoodEaten(getFoodEaten() + food.getQuantity());
    }

    @Override
    public String toString() {
        return getAnimalType() + "[" +
                getAnimalName() + ", " +
                breed + ", " +
                getAnimalWeight() + ", " +
                getLivingRegion() + ", " +
                getFoodEaten() +
                "]";
    }
}

