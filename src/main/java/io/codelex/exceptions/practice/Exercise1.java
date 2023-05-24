package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the numerator or 'q' to quit");
            String numeratorInput = scanner.nextLine();

            if (numeratorInput.equalsIgnoreCase("q")) {
                break;
            }

            int numerator;

            try {
                numerator = Integer.parseInt(numeratorInput);
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data. Please try again.");
                continue;
            }

            System.out.println("Enter the divisor");
            String divisorInput = scanner.nextLine();

            if (divisorInput.equalsIgnoreCase("q")) {
                break;
            }

            int divisor;

            try {
                divisor = Integer.parseInt(divisorInput);
                if (divisor == 0) {
                    System.out.println("You can't divide " + numerator + " by 0");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data. Please try again.");
                continue;
            }
            System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
        }
    }
}
