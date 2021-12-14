package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        double p = 6;
        double k = 2;
        double out = SqArea.squarea(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K4Square2() {
        double expected = 4;
        double p = 10;
        double k = 4;
        double out = SqArea.squarea(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP14K6Square2() {
        double expected = 5.35;
        double p = 14;
        double k = 7;
        double out = SqArea.squarea(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP19K11Square2() {
        double out = SqArea.squarea(19, 11);
        Assert.assertEquals(6.89, out, 0.01);
    }
}