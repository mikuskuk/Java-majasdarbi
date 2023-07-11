package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        try {
            double d;
            if (args.length > 0) {
                d = Double.parseDouble(args[0]);
            } else {
                d = getInput();
            }

            double root = Math.sqrt(d);
            System.out.println(
                    "The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter number as first parameter.");
        } catch (NonPositiveNumberException e) {
            System.out.println("Result will be imaginary number.");
        }
    }

    static double getInput() throws NonPositiveNumberException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double d = input.nextDouble();
        input.close();

        if (d < 0) {
            throw new NonPositiveNumberException("Input must be positive");
        }
        return d;
    }
}
