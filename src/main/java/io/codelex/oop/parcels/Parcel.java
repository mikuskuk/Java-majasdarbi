package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private final int xLength;
    private final int yLength;
    private final int zLength;
    private final float weight;
    private final boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        boolean valid = true;

        int dimensionsSum = xLength + yLength + zLength;
        if (dimensionsSum > 300) {
            System.out.println("Sum of dimensions over 300!");
            valid = false;
        }

        if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("Each dimension must be at least 30!");
            valid = false;
        }

        float maxWeight = isExpress ? 15.0f : 30.0f;
        if (weight > maxWeight) {
            System.out.println("Weight exceeds maximum weight of " + maxWeight + "!");
            valid = false;
        }
        return valid;
    }
}
