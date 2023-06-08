package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private int dimension;
    private int numberOfCopies;
    private int costPerCopy;

    public Poster(int fee, int dimension, int numberOfCopies, int costPerCopy) {
        super(fee);
        this.dimension = dimension;
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
    }

    @Override
    public int cost() {
        return super.cost() + dimension * numberOfCopies * costPerCopy;
    }

    @Override
    public String toString() {
        return super.toString() + " Poster: Dimensions= " + dimension + " Number of copies= " + numberOfCopies + " Cost per copy= " + costPerCopy;
    }
}
