package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = input.nextInt();

        boolean isHappy = happyNumberCheck(number);

        if (isHappy) {
            System.out.println(number + " is a happy number :)");
        } else {
            System.out.println(number + " is not a happy number :(");
        }
    }

    private static boolean happyNumberCheck(int number) {
        Set<Integer> set = new HashSet<>();

        while (number != 1) {
            if (set.contains(number)) {
                return false;
            }

            set.add(number);
            number = sumOfSquaredDigits(number);
        }

        return true;
    }

    private static int sumOfSquaredDigits(int number) {
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }

        return sum;
    }
}
