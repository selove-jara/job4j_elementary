package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SwitchWeekTest {

    @Test
    void day1() {
        int day = 1;
        String expected = "Понедельник";
        String rsl = SwitchWeek.nameOfDay(day);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void day2() {
        int day = 2;
        String expected = "Вторник";
        String rsl = SwitchWeek.nameOfDay(day);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void day3() {
        int day = 3;
        String expected = "Среда";
        String rsl = SwitchWeek.nameOfDay(day);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void day4() {
        int day = 4;
        String expected = "Четверг";
        String rsl = SwitchWeek.nameOfDay(day);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void day5() {
        int day = 5;
        String expected = "Пятница";
        String rsl = SwitchWeek.nameOfDay(day);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void day6() {
        int day = 6;
        String expected = "Суббота";
        String rsl = SwitchWeek.nameOfDay(day);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void day7() {
        int day = 7;
        String expected = "Воскресенье";
        String rsl = SwitchWeek.nameOfDay(day);
        assertThat(rsl).isEqualTo(expected);
    }
}