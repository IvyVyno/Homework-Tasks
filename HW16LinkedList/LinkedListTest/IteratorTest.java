package HW16LinkedList.LinkedListTest;

import HW16LinkedList.LinkedList.LinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IteratorTest {

    private LinkedList testList;
    private int counter;

    @Before
    public void createTestList(){
        this.testList = new LinkedList();
        this.counter = 0;
    }

    @Test
    public void iteratorTest(){

        testList.add(0);
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        for(Object element : testList) {
            counter++;
        }
        assertEquals(6, counter);
    }

}
