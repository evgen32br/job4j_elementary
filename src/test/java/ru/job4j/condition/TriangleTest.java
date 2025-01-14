package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class TriangleTest {

    @Test
    public void whenExistWhenTrue() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenExistWhenFalse() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 5.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}