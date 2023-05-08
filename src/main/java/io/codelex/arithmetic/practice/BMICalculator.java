package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your body weight in kilos: ");
        double weight = input.nextDouble();

        System.out.println("Please enter your height in meters: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("Your BMI is " + bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("You have optimal weight.");
        } else {
            System.out.println("You are overweight.");
        }
    }
}
