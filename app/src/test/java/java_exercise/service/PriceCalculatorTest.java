package java_exercise.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PriceCalculatorTest {

    PriceCalculator priceCalculator = new PriceCalculator();

    @Test
    public void testCalcPrice_case1() {
        long actual = priceCalculator.calcPrice(1000, 1, 1, 1);
        int expected = 950;
        assertEquals(expected, actual);
    }

    @Test
    public void testCalcPrice_case2() {
        long actual = priceCalculator.calcPrice(1000, 1, 2, 1);
        int expected = 950;
        assertEquals(expected, actual);
    }

    @Test
    public void testCalcPrice_case3() {
        long actual = priceCalculator.calcPrice(1000, 1, 1, 3);
        int expected = 800;
        assertEquals(expected, actual);
    }

    @Test
    public void testCalcPrice_case4() {
        long actual = priceCalculator.calcPrice(1000, 1, 3, 2);
        int expected = 900;
        assertEquals(expected, actual);
    }

    @Test
    public void testCalcPrice_case5() {
        long actual = priceCalculator.calcPrice(1000, 1, 3, 1);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void testCalcPrice_case6() {
        long actual = priceCalculator.calcPrice(1000, 1, 1, 2);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void testCalcPrice_case7() {
        long actual = priceCalculator.calcPrice(1000, 2, 1, 3);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void testCalcPrice_case8() {
        long actual = priceCalculator.calcPrice(1000, 1, 1, 4);
        int expected = 1000;
        assertEquals(expected, actual);
    }
}
