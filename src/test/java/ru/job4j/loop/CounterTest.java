package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFrom1To10Then30() {
        int start = 0;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom0To15ThenThirty() {
        int start = 0;
        int finish = 15;
        int result = Counter.sumByEven(start, finish);
        int expected = 56;
        Assert.assertEquals(expected, result);
    }
}