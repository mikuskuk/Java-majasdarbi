package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Welcome to Piglet!");
        int score = 0;
        boolean rollAgain = true;

        while (rollAgain) {
            int roll = r.nextInt(6) + 1;
            System.out.println("You rolled a " + roll + "!");

            if (roll == 1) {
                System.out.println("You got 0 points.");
                rollAgain = false;
            } else {
                score += roll;
                System.out.println("Roll again? (yes/no)");

                String nextRoll = "";
                while (isInputValid(nextRoll)) {
                    nextRoll = input.nextLine().toLowerCase();
                    if (isInputValid(nextRoll)) {
                        System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                    }
                }

                if (nextRoll.equals("no")) {
                    System.out.println("You got " + score + " points.");
                    rollAgain = false;
                } else {
                    rollAgain = true;
                }
            }
        }
    }

    private static boolean isInputValid(String nextRoll) {
        return !nextRoll.equals("yes") && !nextRoll.equals("no") && !nextRoll.equals("no") && !nextRoll.equals("n");
    }
}
