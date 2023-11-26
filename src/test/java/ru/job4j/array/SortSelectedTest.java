package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SortSelectedTest {

    @Test
    public void whenSortFrom1To5() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortFrom6To10() {
        int[] data = new int[]{8, 7, 6, 9, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{6, 7, 8, 9, 10};
        assertThat(result).containsExactly(expected);
    }
}