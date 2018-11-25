package HW15Fraction.FractionTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import HW15Fraction.Fraction.Fraction;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedMultTest {

    private int valueX;
    private int valueY;
    private double multiplier;
    private String expectedValue;

    public ParameterizedMultTest(int valueX, int valueY, double multiplier, String expectedValue) {
        this.valueX = valueX;
        this.valueY = valueY;
        this.multiplier = multiplier;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> dataForMultTest() {
        return Arrays.asList(new Object[][]{
                {3, 4, 0.1, "3/40"},
                {4, 7, 0.3, "12/70"},
                {2, 8, 0.7, "14/80"},
                {1, 14, 0.4, "4/140"}
        });
    }

    @Test
    public void fractionMultTest() {
        assertEquals(expectedValue, (new Fraction(valueX, valueY).mult(multiplier)).toString());
    }
}
