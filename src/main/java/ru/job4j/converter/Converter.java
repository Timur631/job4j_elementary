package ru.job4j.converter;

public class Converter {

    public static double rubleToEuro(double value) {
        double result = value / 109;
        return result;
    }

    public static double rubleToDollar(double value) {
        double result = value / 103; /* формула перевода рублей в доллары. */
        return result;
    }

    public static void main(String[] args) {
        double euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        double dollar = rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + "dollar");
    }
}