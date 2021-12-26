package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMondayNumberOfDayThen1() {
        String name = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTuesdayNumberOfDayThen2() {
        String name = "Вторник";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenWednesdayNumberOfDayThen3() {
        String name = "Среда";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenThursdayNumberOfDayThen4() {
        String name = "Чертверг";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFridayNumberOfDayThen5() {
        String name = "Friday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSaturdayNumberOfDayThen6() {
        String name = "Saturday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSundayNumberOfDayThen7() {
        String name = "Воскресение";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }
}