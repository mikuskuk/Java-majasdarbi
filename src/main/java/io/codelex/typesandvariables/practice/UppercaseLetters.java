package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class UppercaseLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter text you want to be scanned for uppercase letter count: ");
        String text = input.nextLine();

        int uppercaseLetterCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                uppercaseLetterCount++;
            }
        }

        System.out.println("In the text you entered are " + uppercaseLetterCount + " uppercase letters");
    }
}
