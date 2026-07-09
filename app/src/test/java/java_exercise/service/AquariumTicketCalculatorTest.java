package java_exercise.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AquariumTicketCalculatorTest {
    private AquariumTicketCalculator aquariumTicketCalculator;

    @BeforeEach
    public void setUp() {
        this.aquariumTicketCalculator = new AquariumTicketCalculator();
    }

    @Test
    public void testCalcFee_invalidAge() {
        assertThrows(IllegalArgumentException.class, () -> aquariumTicketCalculator.calcFee(-1));
    }

    @Test
    public void testCalcFee_case2() {
        int actual = aquariumTicketCalculator.calcFee(3);
        assertEquals(0, actual);
    }

    @Test
    public void testCalcFee_case3() {
        int actual = aquariumTicketCalculator.calcFee(6);
        assertEquals(400, actual);
    }

    @Test
    public void testCalcFee_case4() {
        int actual = aquariumTicketCalculator.calcFee(15);
        assertEquals(900, actual);
    }

    @Test
    public void testCalcFee_case5() {
        int actual = aquariumTicketCalculator.calcFee(120);
        assertEquals(2000, actual);
    }

    @Test
    public void testCalcFee_invalidAge2() {
        assertThrows(IllegalArgumentException.class, () -> aquariumTicketCalculator.calcFee(121));
    }
}
