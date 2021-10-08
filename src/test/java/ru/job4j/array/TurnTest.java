package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {8, 7, 6, 1, 2, 3};
        int[] result = Turn.back(input);
        int[] expected = new int[] {3, 2, 1, 6, 7, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {5, 4, 3, 2, 1};
        int[] result = Turn.back(input);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }
}