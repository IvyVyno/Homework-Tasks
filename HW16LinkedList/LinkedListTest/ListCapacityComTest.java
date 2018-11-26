package HW16LinkedList.LinkedListTest;

import HW16LinkedList.LinkedList.LinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ListCapacityComTest {

    private LinkedList testList;

    @Before
    public void createTestList(){
        this.testList = new LinkedList();
    }

    @Test
    public void testIsEmpty() {
        assertTrue(testList.isEmpty());
        assertEquals(0, testList.getSize());
    }

    @Test
    public void sizeTest() {
        assertEquals(0, testList.getSize());
        testList.add(13);
        assertEquals(1, testList.getSize());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void checkEmptyListInteraction(){
        testList.get(0);
    }
}
