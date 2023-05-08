package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Speedometer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter distance in meters: ");

        int distance = input.nextInt();
        System.out.println("Input distance in meters: " + distance);

        System.out.println("Enter hours, minutes and seconds you spent in distance: ");

        int hours = input.nextInt();
        System.out.println("Input hour: " + hours);

        int minutes = input.nextInt();
        System.out.println("Input minutes: " + minutes);

        int seconds = input.nextInt();
        System.out.println("Input seconds: " + seconds);

        double timeInSecond = (hours * 3600) + (minutes * 60) + seconds;
        double speedMetersPerSecond = distance / timeInSecond;

        double speedKilometersPerHour = (distance / 1000.0) / (timeInSecond / 3600.0);

        double milesPerHour = speedKilometersPerHour / 1.609;

        System.out.printf("Your speed in meters/second is %.8f\n", speedMetersPerSecond);
        System.out.printf("Your speed in km/h is %.8f\n",speedKilometersPerHour);
        System.out.printf("Your speed in miles/h is %.8f\n",milesPerHour);
    }
}
