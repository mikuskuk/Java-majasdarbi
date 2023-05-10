package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = input.nextInt();

        int count = 0;

        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else {
                System.out.print(i + " ");
            }
            count++;
            if (count == 20) {
                System.out.println();
                count = 0;
            }
        }
    }
}
