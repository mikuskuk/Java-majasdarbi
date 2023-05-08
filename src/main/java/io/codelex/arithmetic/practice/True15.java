package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class True15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.println("Enter second integer: ");
        int number2 = input.nextInt();

        boolean result = isTrue(number1, number2);
        System.out.println(result);
    }

    public static boolean isTrue(int number1, int number2) {
        if (number1 == 15 || number2 == 15 || number1 + number2 == 15 || number1 - number2 == 15) {
            return true;
        }
        return false;
    }

}

