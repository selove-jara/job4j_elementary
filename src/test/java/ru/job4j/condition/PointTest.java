package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertThat(dist).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when20to20then1() {
        double expected = 1;
        Point a = new Point(2, 0);
        Point b = new Point(2, 1);
        double dist = a.distance(b);
        assertThat(dist).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when03to460then5() {
        double expected = 5;
        Point a = new Point(0, 3);
        Point b = new Point(4, 6);
        double dist = a.distance(b);
        assertThat(dist).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when03to460thenFalse() {
        double expected = 7;
        Point a = new Point(0, 3);
        Point b = new Point(4, 6);
        double dist = a.distance(b);
        assertNotEquals(expected, dist, 0.0);
    }
}