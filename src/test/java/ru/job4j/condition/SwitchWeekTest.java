package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void nameOfDay() {
        int day = 4;
        String name = SwitchWeek.nameOfDay(day);
        String expected = "Четверг";
        Assert.assertEquals(expected, name);
    }
}