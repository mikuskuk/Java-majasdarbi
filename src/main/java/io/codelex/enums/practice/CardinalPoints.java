package io.codelex.enums.practice;

import java.util.EnumMap;
import java.util.Map;

public enum CardinalPoints {
    NORTH("North", "up", 0),
    SOUTH("South", "down", 1),
    EAST("East", "right", 2),
    WEST("West", "left", 3);

    private final String name;
    private final String side;
    private final int number;

    CardinalPoints(String name, String side, int number) {
        this.name = name;
        this.side = side;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getSide() {
        return side;
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        printWithIf();
        System.out.println("'''");
        printWithSwitch();
        System.out.println("'''");
        printWithEnumField();
        System.out.println("'''");
        printWithEnumMap();
        System.out.println("'''");
    }

    private static void printWithIf() {
        for (CardinalPoints p : CardinalPoints.values()) {
            String direction = p.getName();
            String side = p.getSide();
            int number = p.getNumber();
            System.out.println(direction + ":" + side + ":" + number);
        }
    }

    private static void printWithSwitch() {
        for (CardinalPoints p : CardinalPoints.values()) {
            String direction = switch (p) {
                case NORTH -> "North";
                case SOUTH -> "South";
                case EAST -> "East";
                case WEST -> "West";
            };
            String side = p.getSide();
            int number = p.getNumber();
            System.out.println(direction + ":" + side + ":" + number);
        }
    }

    private static void printWithEnumField() {
        for (CardinalPoints p : CardinalPoints.values()) {
            System.out.println(p.name + ":" + p.side + ":" + p.number);
        }
    }

    private static void printWithEnumMap() {
        Map<CardinalPoints, String> map = new EnumMap<>(CardinalPoints.class);
        for (CardinalPoints p : CardinalPoints.values()) {
            map.put(p, p.name + ":" + p.side + ":" + p.number);
        }

        for (Map.Entry<CardinalPoints, String> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
