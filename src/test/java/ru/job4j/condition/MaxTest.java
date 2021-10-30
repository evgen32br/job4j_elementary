package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To3Then3() {
        int left = 1;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To4Then4() {
        int first = 1;
        int second = 2;
        int third = 4;
        int result = Max.max(first, second, third);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To10To6To9Then10() {
        int first = 3;
        int second = 10;
        int third = 6;
        int fourth = 9;
        int result = Max.max(first, second, third, fourth);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }
}