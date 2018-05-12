package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }
    @Test
    public void whenEuroToRubleThen70() {
        Converter converter = new Converter();
        double result = converter.euroToRuble(2);
        assertThat(result, closeTo(140.0, 0.1));
    }
    @Test
    public void whenDollarToRubleThen60() {
        Converter converter = new Converter();
        double result = converter.dollarToRuble(7);
        assertThat(result, closeTo(420.0, 0.1));
    }
}