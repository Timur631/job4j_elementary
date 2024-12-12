package ru.job4j;

public class Calculator {

    public static void tim(String name, String date) {
        System.out.println("привет дорогой и уважаемый ползователь " + name + ", как твои дела?");
        System.out.println("ты родился " + date);
        System.out.println();
    }

    public static void main(String[] args) {

        Calculator.tim("Timur", "28.09.2010");
        Calculator.tim("Timofei", "06.09.2008");
        Calculator.tim("Konstantin", "10.01.1983");
    }

}
