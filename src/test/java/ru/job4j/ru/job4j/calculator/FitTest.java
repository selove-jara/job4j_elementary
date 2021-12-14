package ru.job4j.ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight175() {
        short in = 175;
        double expected = 86.25;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight158() {
        short in = 158;
        double expected = 55.19;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void manWeight198() {
        short in = 198;
        double expected = 112.69;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight184() {
        short in = 184;
        double expected = 85.1;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}