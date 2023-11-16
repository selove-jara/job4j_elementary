package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CounterTest {
    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom4To10ThenThirty() {
        int start = 4;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 28;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom10To20ThenThirty() {
        int start = 10;
        int finish = 20;
        int result = Counter.sumByEven(start, finish);
        int expected = 90;
        assertThat(result).isEqualTo(expected);
    }
}