package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2And4And5Then5() {
        int left = 2;
        int right = 4;
        int third = 5;
        int result = Max.max(left, right, third);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5And10And5Then15() {
        int left = 5;
        int right = 10;
        int third = 15;
        int result = Max.max(left, right, third);
        int expected = 15;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5And10And5And5Then15() {
        int left = 5;
        int right = 10;
        int third = 15;
        int fourth = 20;
        int result = Max.max(left, right, third, fourth);
        int expected = 20;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax9And1And4And7Then9() {
        int left = 9;
        int right = 1;
        int third = 4;
        int fourth = 7;
        int result = Max.max(left, right, third, fourth);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }
}