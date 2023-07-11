package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NameLister {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter names one per line. Press enter to finish.");

        String name = input.nextLine().trim();
        while (!name.isEmpty()) {
            names.add(name);
            name = input.nextLine().trim();
        }

        System.out.println("Unique name list: ");
        for (String element : names) {
            System.out.println(element);
        }
    }
}
