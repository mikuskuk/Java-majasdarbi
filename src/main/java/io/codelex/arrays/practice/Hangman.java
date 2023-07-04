package io.codelex.arrays.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    private static final String[] WORDS = {"codelex", "hangman", "helicopter", "parachute", "coding"};
    private static final int MAX_TRIES = 5;
    private static String selectedWord;
    private static char[] activeWord;
    private static List<Character> guessedLetters;
    private static int triesLeft;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Let's play Hangman!");

        String text;
        do {
            selectedWord = WORDS[r.nextInt(WORDS.length)];
            activeWord = new char[selectedWord.length()];
            guessedLetters = new ArrayList<>();
            triesLeft = MAX_TRIES;

            wordProgress();

            while (triesLeft > 0 && !wordGuessed()) {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("Word:\t" + String.valueOf(activeWord));
                System.out.println("Misses:\t" + guessedLetters.toString());
                System.out.println("Guess:\t");
                char guess = input.nextLine().charAt(0);

                if (guessedLetters.contains(guess)) {
                    System.out.println("You already guessed that letter. Try again.");
                } else {
                    guessedLetters.add(guess);
                    if (newWordProgress(guess)) {
                        System.out.println("Correct guess!");
                    } else {
                        triesLeft--;
                        System.out.println("Wrong guess! Remaining tries: " + triesLeft);
                    }
                }
            }

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Word:\t" + String.valueOf(activeWord));
            System.out.println("Misses:\t" + guessedLetters.toString());

            if (wordGuessed()) {
                System.out.println("YOU GOT IT!");
            } else {
                System.out.println("Out of tries. The word was: " + selectedWord);
            }

            System.out.println("Play \"again\" or \"quit\"? ");
            text = input.nextLine();
        } while (text.equalsIgnoreCase("again"));

        System.out.println("Thank for the game!");
    }

    private static void wordProgress() {
        for (int i = 0; i < selectedWord.length(); i++) {
            activeWord[i] = '_';
        }
    }

    private static boolean newWordProgress(char guess) {
        boolean correctGuess = false;

        for (int i = 0; i < selectedWord.length(); i++) {
            if (selectedWord.charAt(i) == guess) {
                activeWord[i] = guess;
                correctGuess = true;
            }
        }
        return correctGuess;
    }

    private static boolean wordGuessed() {
        for (char c : activeWord) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }
}
