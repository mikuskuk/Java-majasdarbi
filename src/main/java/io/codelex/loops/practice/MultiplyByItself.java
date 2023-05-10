package io.codelex.loops.practice;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i, n;

        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int result = n;

        for (i = 1; i < n; i++) {
            result *= n;
        }

        System.out.println("Result is: " + result);
    }

}
