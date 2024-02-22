package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = y2 - y1;
        double third = Math.pow(first, 2);
        double fourth = Math.pow(second, 2);
        double fifth = third + fourth;
        double sixth = Math.sqrt(fifth);
        return sixth;
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
