package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class LogicNotTest {

    @Test
    public void isEven() {
        int num = 6;
        boolean result = LogicNot.isEven(num);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void isPositive() {
        int num = 5;
        boolean result = LogicNot.isPositive(num);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void notEven() {
        int num = 5;
        boolean result = LogicNot.notEven(num);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void notPositive() {
        int num = -5;
        boolean result = LogicNot.notPositive(num);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void notEvenAndPositive() {
        int num = 5;
        boolean result = LogicNot.notEvenAndPositive(num);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void evenOrNotPositive() {
        int num = -5;
        boolean result = LogicNot.evenOrNotPositive(num);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }
}