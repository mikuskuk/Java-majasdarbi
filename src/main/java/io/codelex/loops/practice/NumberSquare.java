package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Min? ");
        int min = input.nextInt();

        System.out.print("Max? ");
        int max = input.nextInt();

        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for (int k = min; k < i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
