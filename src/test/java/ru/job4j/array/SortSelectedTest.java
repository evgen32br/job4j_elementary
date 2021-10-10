package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SortSelectedTest {

    @Test
    public void whenSort5Numbers() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3Numbers() {
        int[] data = new int[] {3, 1, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort10Numbers() {
        int[] data = new int[] {3, 4, 1, 2, 5, 9, 12, 7, 15, 25};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5, 7, 9, 12, 15, 25};
        Assert.assertArrayEquals(expected, result);
    }
}