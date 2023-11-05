package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(180);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollar.");
        dollar = Converter.rubleToDollar(240);
        System.out.println("240 rubles are " + dollar + " dollar.");
        euro = Converter.rubleToEuro(210);
        System.out.println("210 rubles are " + euro + " euro.");
    }
}
