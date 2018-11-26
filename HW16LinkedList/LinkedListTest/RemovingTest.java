package HW16LinkedList.LinkedListTest;

import HW16LinkedList.LinkedList.LinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemovingTest {

    private LinkedList testList;

    @Before
    public void createTestList() {
        this.testList = new LinkedList();
    }

    @Test
    public void removingTest() {
        testList.add(13);
        assertEquals(13, testList.get(0));
        assertEquals(1, testList.getSize());
        testList.remove(0);
        assertEquals(0, testList.getSize());
    }
}
