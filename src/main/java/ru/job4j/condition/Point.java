package ru.job4j.condition;

public class Point {
    public static double distance(double x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(2, 1, 3, 3);
        System.out.println("result (2, 1) to (3, 3) " + result2);
        double result3 = Point.distance(0, 0, 20, 30);
        System.out.println("result (0, 0) to (20, 30) " + result3);
    }
}
