package tests;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before(){
        this.fraction = new Fraction(4, 5);
    }

    @Test
    public void testFraction(){
        this.fraction = new Fraction();
        assertEquals(1, this.fraction.decimal());
    }

    @Test
    public void testFraction2(){
        this.fraction = new Fraction(4, 5);
        assertEquals(0.8, this.fraction.decimal(), 10e-5);
    }

    @Test
    public void testDecimal(){
        this.fraction = new Fraction(6, 5);
        double res = this.fraction.decimal();
        assertEquals(1.2, res, 10e-5);
    }
}
