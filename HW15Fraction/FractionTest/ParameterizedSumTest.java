package HW15Fraction.FractionTest;

import HW15Fraction.Fraction.Fraction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedSumTest {

    private int valueX;
    private int valueY;
    private double addendum;
    private String expectedValue;

    public ParameterizedSumTest(int valueX, int valueY, double addendum, String expectedValue) {
        this.valueX = valueX;
        this.valueY = valueY;
        this.addendum = addendum;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> dataForSumTest() {
        return Arrays.asList(new Object[][]{
                {3, 5, 0.2, "40/50"},
                {7, 19, 0.3, "127/190"},
                {25, 100, 0.25, "50/100"},
                {4, 10, 0.4, "8/10"}
        });
    }

    @Test
    public void fractionSumTest(){
        assertEquals(expectedValue, (new Fraction(valueX, valueY).sum(Fraction.convert(addendum))).toString());
    }
}
