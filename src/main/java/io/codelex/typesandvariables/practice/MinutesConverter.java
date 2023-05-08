package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class MinutesConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter minutes: ");

        long minutes = input.nextLong();
        long minutesInYear = 60 * 24 * 365;

        long years = minutes / minutesInYear;
        long days = (minutes % minutesInYear) / (60 * 24);

        System.out.println(minutes + " minutes is " + years + " years and " + days + " days");
    }
}
