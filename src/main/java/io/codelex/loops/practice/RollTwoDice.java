package io.codelex.loops.practice;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Entire desired sum: ");
        int desiredSum = input.nextInt();
        System.out.println("Desired sum: " + desiredSum);

        int dice1, dice2, sum;

        do {
            dice1 = r.nextInt(6) + 1;
            dice2 = r.nextInt(6) + 1;
            sum = dice1 + dice2;
            System.out.println(dice1 + " and " + dice2 + " = " + sum);
        } while (sum != desiredSum);
    }
}
