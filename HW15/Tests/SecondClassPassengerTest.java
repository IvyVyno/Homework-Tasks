package HW15.Tests;

import HW15.ChooChoo.SecondClassPassenger;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SecondClassPassengerTest {

    private final SecondClassPassenger secondClassPassengerTest = new SecondClassPassenger();

    @Test
    public void secondClassPassengerTest() {
        assertTrue(secondClassPassengerTest.getLoad() >= 0 && secondClassPassengerTest.getLoad() <= 200);
    }
}
