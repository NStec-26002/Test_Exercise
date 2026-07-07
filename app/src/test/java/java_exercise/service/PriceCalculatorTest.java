package java_exercise.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PriceCalculatorTest {

    @Test
    public void testCalcPrice_case1() {
        PriceCalculator priceCalculator = new PriceCalculator();
        long actual = priceCalculator.calcPrice(1000, 1, 1, 1);
        int expected = 950;
        assertEquals(expected, actual);
    }

    @Test
    public void testCalcPrice_case2() {
        PriceCalculator priceCalculator = new PriceCalculator();
        long actual = priceCalculator.calcPrice(1000, 1, 2, 1);
        int expected = 950;
        assertEquals(expected, actual);
    }

    @Test
    public void testCalcPrice_case3() {
        PriceCalculator priceCalculator = new PriceCalculator();
        long actual = priceCalculator.calcPrice(1000, 1, 1, 3);
        int expected = 800;
        assertEquals(expected, actual);
    }

    @Test
    public void testCalcPrice_case4() {
        PriceCalculator priceCalculator = new PriceCalculator();
        long actual = priceCalculator.calcPrice(1000, 1, 3, 2);
        int expected = 900;
        assertEquals(expected, actual);
    }

    @Test
    public void testCalcPrice_case5() {
        PriceCalculator priceCalculator = new PriceCalculator();
        long actual = priceCalculator.calcPrice(1000, 1, 3, 1);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void testCalcPrice_case6() {
        PriceCalculator priceCalculator = new PriceCalculator();
        long actual = priceCalculator.calcPrice(1000, 1, 1, 2);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void testCalcPrice_case7() {
        PriceCalculator priceCalculator = new PriceCalculator();
        long actual = priceCalculator.calcPrice(1000, 2, 1, 3);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void testCalcPrice_case8() {
        PriceCalculator priceCalculator = new PriceCalculator();
        long actual = priceCalculator.calcPrice(1000, 1, 1, 4);
        int expected = 1000;
        assertEquals(expected, actual);
    }
}
