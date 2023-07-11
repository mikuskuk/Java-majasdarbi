package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList: " + list);

        HashSet<String> set = new HashSet<>(list);
        System.out.println("\nHashSet: " + set);

        HashMap<String, String> map = new HashMap<>();
        map.put("Audi", "Germany");
        map.put("BMW", "Germany");
        map.put("Honda", "Japan");
        map.put("Mercedes", "Germany");
        map.put("VolksWagen", "Germany");
        map.put("Tesla", "USA");
        System.out.println("\nHashMap: " + map);
    }
}
