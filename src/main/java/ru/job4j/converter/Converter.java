package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }
    public static float rubleToDollar(float value) {
        float rsl = value / 60 ; /* формула перевода рублей в доллары. */
        return rsl;
    }
    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        euro = Converter.rubleToEuro(490);
        System.out.println("490 rubles are " + euro + " euro.");
        euro = Converter.rubleToEuro(700);
        System.out.println("700 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar.");
        dollar = Converter.rubleToDollar(360);
        System.out.println("360 rubles are " + dollar + " dollar.");
        dollar = Converter.rubleToDollar(600);
        System.out.println("600 rubles are " + dollar + " dollar.");
    }
}

