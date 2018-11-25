package HW15.Tests;

import HW15.ChooChoo.FirstClassPassenger;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FirstClassPassengerTest {

    private final FirstClassPassenger firstClassPassengerTest = new FirstClassPassenger();

    @Test
    public void firstClassPassengerTest() {
        assertTrue(firstClassPassengerTest.getLoad() >=0 && firstClassPassengerTest.getLoad() <=100);
    }
}
