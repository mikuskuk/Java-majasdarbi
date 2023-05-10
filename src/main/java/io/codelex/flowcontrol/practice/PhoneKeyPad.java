package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = input.next().toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == 'a' || c == 'b' || c == 'c') {
                System.out.print(2);
            } else if (c == 'd' || c == 'e' || c == 'f') {
                System.out.print(3);
            } else if (c == 'g' || c == 'h' || c == 'i') {
                System.out.print(4);
            } else if (c == 'j' || c == 'k' || c == 'l') {
                System.out.print(5);
            } else if (c == 'm' || c == 'n' || c == 'o') {
                System.out.print(6);
            } else if (c == 'p' || c == 'q' || c == 'r' || c == 's') {
                System.out.print(7);
            } else if (c == 't' || c == 'u' || c == 'v') {
                System.out.print(8);
            } else if (c == 'w' || c == 'x' || c == 'y' || c == 'z') {
                System.out.print(9);
            } else {
                System.out.print("?");
            }
        }

        System.out.println();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            switch (c) {
                case 'a':
                case 'b':
                case 'c':
                    System.out.print(2);
                    break;
                case 'd':
                case 'e':
                case 'f':
                    System.out.print(3);
                    break;
                case 'g':
                case 'h':
                case 'i':
                    System.out.print(4);
                    break;
                case 'j':
                case 'k':
                case 'l':
                    System.out.print(5);
                    break;
                case 'm':
                case 'n':
                case 'o':
                    System.out.print(6);
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    System.out.print(7);
                    break;
                case 't':
                case 'u':
                case 'v':
                    System.out.print(8);
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    System.out.print(9);
                    break;
                default:
                    System.out.print("?");
            }


        }
    }
}
