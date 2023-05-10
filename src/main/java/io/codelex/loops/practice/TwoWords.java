package io.codelex.loops.practice;

import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String firstWord = input.nextLine();
        System.out.println(firstWord);

        System.out.println("Enter second word: ");
        String secondWord = input.nextLine();
        System.out.println(secondWord);

        int dots = 30 - (firstWord.length() + secondWord.length());

        System.out.print(firstWord);
        for (int i = 0; i < dots; i++) {
            System.out.print(".");
        }
        System.out.print(secondWord);
    }
}
