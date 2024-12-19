package ru.job4j.condition;

public class  Point {
    public static double distance(double x1, double y1, double x2, double y2) {
        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return result;
    }

    public static void main(String[] args) {
     System.out.println(distance(5, 2, 8, 6));
    }
}