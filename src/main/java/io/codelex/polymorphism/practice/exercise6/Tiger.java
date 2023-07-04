package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {

    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
        setFoodEaten(0);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            setFoodEaten(getFoodEaten() + food.getQuantity());
        } else {
            System.out.println(getAnimalType() + " are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        return getAnimalType() + "[" +
                getAnimalName() + ", " +
                ", " +
                getAnimalWeight() + ", " +
                getLivingRegion() + ", " +
                getFoodEaten() +
                "]";
    }
}
