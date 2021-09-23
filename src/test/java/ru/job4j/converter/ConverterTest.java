package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RbThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float esp = 0.0001f;
        Assert.assertEquals(expected, out, esp);
    }

    @Test
    public void whenConvert180RbThen3Dlr() {
        float in = 140;
        float expected = 2.3333f;
        float out = Converter.rubleToDollar(in);
        float esp = 0.0001f;
        Assert.assertEquals(expected, out, esp);
    }
}