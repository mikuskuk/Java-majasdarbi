package io.codelex.oop.parcels;

public class ParcelTest {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(80, 80, 70, 20.0f, false);
        System.out.println("Validating parcel1: " + parcel1.validate());

        System.out.println();

        Parcel parcel2 = new Parcel(200, 120, 70, 35.0f, true);
        System.out.println("Validating parcel2: " + parcel2.validate());
    }

}
