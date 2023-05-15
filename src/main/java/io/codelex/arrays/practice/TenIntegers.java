package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class TenIntegers {
    public static void main(String[] args) {
        int[] numbersArray1 = new int[10];
        int[] numbersArray2 = new int[10];

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            numbersArray1[i] = rand.nextInt(100);
        }

        for (int i = 0; i < numbersArray1.length; i++) {
            numbersArray2[i] = numbersArray1[i];
        }

        numbersArray1[9] = -7;

        System.out.println("Array 1: " + Arrays.toString(numbersArray1));
        System.out.println("Array 2: " + Arrays.toString(numbersArray2));
    }
}
