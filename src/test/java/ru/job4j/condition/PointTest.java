package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when20to20then1() {
        double expected = 1;
        int x1 = 2;
        int y1 = 0;
        int x2 = 2;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when03to460then5() {
        double expected = 5;
        int x1 = 0;
        int y1 = 3;
        int x2 = 4;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when03to460thenFalse() {
        double expected = 7;
        int x1 = 0;
        int y1 = 3;
        int x2 = 4;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        assertNotEquals(expected, out, 0.0);
    }
}