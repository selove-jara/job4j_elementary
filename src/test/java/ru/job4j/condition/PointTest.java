package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
        public void when00to20then2() {
            double expected = 2;
            Point a = new Point(0, 0);
            Point b = new Point(0, 2);
            double out = a.distance(b);
            Assert.assertEquals(expected, out, 0.01);
        }

    @Test
    public void when41to21then2() {
        double expected = 2;
        Point a = new Point(4, 1);
        Point b = new Point(2, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to21then1() {
        double expected = 1;
        Point a = new Point(1, 1);
        Point b = new Point(2, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when012to333then3don75() {
        double expected = 3.75;
        Point a = new Point(0, 1, 2);
        Point b = new Point(3, 3, 3);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when213to232then3don6() {
        double expected = 2.23;
        Point a = new Point(2, 1, 3);
        Point b = new Point(2, 3, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}