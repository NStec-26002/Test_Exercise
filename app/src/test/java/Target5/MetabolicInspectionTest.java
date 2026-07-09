package Target5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MetabolicInspectionTest {

    private MetabolicInspection metabolicInspection;
    private Subject subject;

    @BeforeEach
    public void setUp() {
        this.metabolicInspection = new MetabolicInspection();
    }

    @Test
    public void testMetabolicInspection_case01() {
        this.subject = new Subject(null, 1, 90, 130, 84, 150, 40, 100);
        Metabolic metabolic = metabolicInspection.inspection(subject);
        assertEquals(Metabolic.METABOLIC, metabolic);
    }

    @Test
    public void testMetabolicInspection_case02() {
        this.subject = new Subject(null, 1, 90, 130, 84, 150, 39, 99);
        Metabolic metabolic = metabolicInspection.inspection(subject);
        assertEquals(Metabolic.METABOLIC, metabolic);
    }

    @Test
    public void testMetabolicInspection_case03() {
        this.subject = new Subject(null, 1, 90, 130, 84, 149, 39, 100);
        Metabolic metabolic = metabolicInspection.inspection(subject);
        assertEquals(Metabolic.METABOLIC, metabolic);
    }

    @Test
    public void testMetabolicInspection_case04() {
        this.subject = new Subject(null, 1, 90, 130, 84, 150, 39, 100);
        Metabolic metabolic = metabolicInspection.inspection(subject);
        assertEquals(Metabolic.METABOLIC, metabolic);
    }

    @Test
    public void testMetabolicInspection_case05() {
        this.subject = new Subject(null, 1, 90, 130, 84, 150, 40, 99);
        Metabolic metabolic = metabolicInspection.inspection(subject);
        assertEquals(Metabolic.METABOLIC_INITIAL, metabolic);
    }

    @Test
    public void testMetabolicInspection_case06() {
        this.subject = new Subject(null, 1, 90, 130, 84, 149, 39, 99);
        Metabolic metabolic = metabolicInspection.inspection(subject);
        assertEquals(Metabolic.METABOLIC_INITIAL, metabolic);
    }

    @Test
    public void testMetabolicInspection_case07() {
        this.subject = new Subject(null, 1, 90, 130, 84, 149, 40, 100);
        Metabolic metabolic = metabolicInspection.inspection(subject);
        assertEquals(Metabolic.METABOLIC_INITIAL, metabolic);
    }

    @Test
    public void testMetabolicInspection_case08() {
        this.subject = new Subject(null, 1, 90, 130, 84, 149, 40, 99);
        Metabolic metabolic = metabolicInspection.inspection(subject);
        assertEquals(Metabolic.METABOLIC_NON, metabolic);
    }

    @Test
    public void testMetabolicInspection_case09() {
        this.subject = new Subject(null, 1, 90, 130, 85, 150, 40, 99);
        Metabolic metabolic = metabolicInspection.inspection(subject);
        assertEquals(Metabolic.METABOLIC, metabolic);
    }

    @Test
    public void testMetabolicInspection_case10() {
        this.subject = new Subject(null, 1, 90, 130, 85, 149, 39, 99);
        Metabolic metabolic = metabolicInspection.inspection(subject);
        assertEquals(Metabolic.METABOLIC, metabolic);
    }

    @Test
    public void testMetabolicInspection_case11() {
        this.subject = new Subject(null, 1, 90, 130, 85, 149, 40, 100);
        Metabolic metabolic = metabolicInspection.inspection(subject);
        assertEquals(Metabolic.METABOLIC, metabolic);
    }

    @Test
    public void testMetabolicInspection_case12() {
        this.subject = new Subject(null, 1, 90, 130, 85, 149, 40, 99);
        Metabolic metabolic = metabolicInspection.inspection(subject);
        assertEquals(Metabolic.METABOLIC_INITIAL, metabolic);
    }

    @Test
    public void testMetabolicInspection_case13() {
        this.subject = new Subject(null, 1, 90, 129, 84, 150, 40, 99);
        Metabolic metabolic = metabolicInspection.inspection(subject);
        assertEquals(Metabolic.METABOLIC_INITIAL, metabolic);
    }

    @Test
    public void testMetabolicInspection_case14() {
        this.subject = new Subject(null, 1, 90, 129, 84, 149, 39, 99);
        Metabolic metabolic = metabolicInspection.inspection(subject);
        assertEquals(Metabolic.METABOLIC_INITIAL, metabolic);
    }

    @Test
    public void testMetabolicInspection_case15() {
        this.subject = new Subject(null, 1, 90, 129, 84, 149, 40, 100);
        Metabolic metabolic = metabolicInspection.inspection(subject);
        assertEquals(Metabolic.METABOLIC_INITIAL, metabolic);
    }

    @Test
    public void testMetabolicInspection_case16() {
        this.subject = new Subject(null, 1, 90, 129, 84, 149, 40, 99);
        Metabolic metabolic = metabolicInspection.inspection(subject);
        assertEquals(Metabolic.METABOLIC_NON, metabolic);
    }

}
