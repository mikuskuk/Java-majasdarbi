package io.codelex.loops.practice;

import java.util.Scanner;

public class AsciiFigure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter size of the figure: ");
        int size = input.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= 4 * (size - i); j++) {
                System.out.print("/");
            }

            for (int j = 1; j <= 8 * (i - 1); j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 4 * (size - i); j++) {
                System.out.print("\\");
            }

            System.out.println();
        }
    }
}
