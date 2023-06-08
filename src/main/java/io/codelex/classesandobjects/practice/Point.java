package io.codelex.classesandobjects.practice;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void swapPoints(Point p1, Point p2) {
        int tempX = p1.x;
        int tempY = p1.y;

        p1.x = p2.x;
        p1.y = p2.y;

        p2.x = tempX;
        p2.y = tempY;
    }
}
