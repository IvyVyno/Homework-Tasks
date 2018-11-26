package HW16LinkedList.LinkedListTest;

import HW16LinkedList.LinkedList.LinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddingTest {

    private LinkedList testList;

    @Before
    public void createTestList(){
        this.testList = new LinkedList();
    }

    @Test
    public void addingTest(){
        testList.add(13);
        assertEquals(13,testList.get(0));
        assertEquals(testList.getFirst(), testList.getLast());
        assertFalse(testList.isEmpty());
    }
}
