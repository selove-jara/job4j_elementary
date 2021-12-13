package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
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
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 490;
        expected = 8;
        out = Converter.rubleToEuro(in);
        passed = expected == out;
        System.out.println("490 rubles are 8. Test result : " + passed);
        in = 700;
        expected = 10;
        out = Converter.rubleToEuro(in);
        passed = expected == out;
        System.out.println("700 rubles are 10. Test result : " + passed);
        in = 180;
        expected = 4;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("180 rubles are 4. Test result : " + passed);
        in = 360;
        expected = 6;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("360 rubles are 6. Test result : " + passed);
    }
}

