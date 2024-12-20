package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {

        double result = (Math.pow(p, 2) * k) / Math.pow(2 * k + 2, 2);
        return result;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(12, 2);
        System.out.println(result);
    }
}