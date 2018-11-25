package HW15Fraction.FractionTest;

import HW15Fraction.Fraction.Fraction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedDivTest {

    private int valueX;
    private int valueY;
    private double divider;
    private String expectedValue;

    public ParameterizedDivTest(int valueX, int valueY, double divider, String expectedValue) {
        this.valueX = valueX;
        this.valueY = valueY;
        this.divider = divider;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> dataForDivTest() {
        return Arrays.asList(new Object[][]{
                {1, 4, 0.5, "10/20"},
                {4, 16, 0.3, "40/48"},
                {2, 8, 0.7, "20/56"},
                {1, 14, 0.4, "10/56"}
        });
    }

    @Test
    public void fractionDivTest(){
        assertEquals(expectedValue, (new Fraction(valueX, valueY).divide(divider)).toString());
    }
}
