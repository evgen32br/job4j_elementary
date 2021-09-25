package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when33to21then223() {
        double expected = 2.23;
        int x1 = 3;
        int y1 = 3;
        int x2 = 2;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when21to12then141() {
        double expected = 1.41;
        int x1 = 2;
        int y1 = 1;
        int x2 = 1;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when44to44then0() {
        double expected = 0;
        int x1 = 4;
        int y1 = 4;
        int x2 = 4;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to62then4() {
        double expected = 4;
        int x1 = 2;
        int y1 = 2;
        int x2 = 6;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when52to01then509() {
        double expected = 5.09;
        int x1 = 5;
        int y1 = 2;
        int x2 = 0;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}