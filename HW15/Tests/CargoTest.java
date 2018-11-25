package HW15.Tests;

import HW15.ChooChoo.Cargo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class CargoTest {

    private final Cargo testCargo = new Cargo();

    @Test
    public void cargoTest() {
        assertTrue(testCargo.getLoad() >= 0 && testCargo.getLoad() <=100);
    }
}
