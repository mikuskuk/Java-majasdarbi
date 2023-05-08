package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Random100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 1;
        int max = 100;

        System.out.println("I'm thinking of a number between " + min + "-" + max + ". Try to guess it.");
        int userGuess = input.nextInt();

        int random = (int) Math.floor(Math.random() * (max - min + 1) + min);

        if (userGuess == random) {
            System.out.println("You guessed it!  What are the odds?!?");
        } else if (userGuess > random) {
            System.out.println("Sorry, you are too high.  I was thinking of " + random + ".");
        } else {
            System.out.println("Sorry, you are too low.  I was thinking of " + random + ".");
        }
    }
}
