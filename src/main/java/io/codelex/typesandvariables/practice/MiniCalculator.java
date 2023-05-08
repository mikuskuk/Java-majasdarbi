package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.println("Enter a single digit number (or 0 to exit): ");
            number = input.nextInt();

            if (number >= 0 && number <= 9) {
                sum += number;
                System.out.println("Current sum is: " + sum);
            } else {
                System.out.println("Invalid input, only single digit numbers are allowed!");
            }
        } while (number != 0);

        System.out.println("Final sum is: " + sum);
    }
}
