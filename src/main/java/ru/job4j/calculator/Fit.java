package ru.job4j.calculator;

import java.sql.SQLOutput;

public class Fit {

    public static double manWeight(double height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(double height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(manWeight(170));
        System.out.println(womanWeight(158));
    }

}