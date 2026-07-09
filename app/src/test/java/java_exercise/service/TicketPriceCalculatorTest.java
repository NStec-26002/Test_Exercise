package java_exercise.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketPriceCalculatorTest {

    private TicketPriceCalculator ticketPriceCalculator;

    @BeforeEach
    public void setUp() {
        this.ticketPriceCalculator = new TicketPriceCalculator();
    }

    @Test
    public void testCalcPrice_case1() {
        assertThrows(IllegalArgumentException.class, () -> ticketPriceCalculator.calcPrice(true, true, 18));

    }

    @Test
    public void testCalcPrice_case2() {
        int actual = ticketPriceCalculator.calcPrice(true, true, 19);
        assertEquals(1000, actual);
    }

    @Test
    public void testCalcPrice_case3() {
        int actual = ticketPriceCalculator.calcPrice(true, false, 18);
        assertEquals(1000, actual);
    }

    @Test
    public void testCalcPrice_case4() {
        int actual = ticketPriceCalculator.calcPrice(true, false, 19);
        assertEquals(1000, actual);
    }

    @Test
    public void testCalcPrice_case5() {
        assertThrows(IllegalArgumentException.class, () -> ticketPriceCalculator.calcPrice(false, true, 18));
    }

    @Test
    public void testCalcPrice_case6() {
        int actual = ticketPriceCalculator.calcPrice(false, false, 18);
        assertEquals(1500, actual);
    }

    @Test
    public void testCalcPrice_case7() {
        int actual = ticketPriceCalculator.calcPrice(false, true, 19);
        assertEquals(1200, actual);
    }

    @Test
    public void testCalcPrice_case8() {
        int actual = ticketPriceCalculator.calcPrice(false, false, 19);
        assertEquals(1800, actual);
    }
}
