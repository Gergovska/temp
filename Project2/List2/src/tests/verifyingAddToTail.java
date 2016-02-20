package tests;

import linkedlist.LinkedList;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author Oleksandra Gergovska
 */
public class verifyingAddToTail {

    @Test
    public void testAddElementList(){
       LinkedList<Integer> testList = new LinkedList<>();
        testList.add(12);
        testList.add(14500);
        int expectedSize =2;
        int actualSize = testList.size();
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testRevertList(){
        LinkedList<Integer> actualList = new LinkedList<>();
        LinkedList<Integer> expectedList = new LinkedList<>();
       actualList.add(1);
       actualList.add(2);
       actualList.add(3);
       actualList.revertList();
       expectedList.add(3);
       expectedList.add(2);
       expectedList.add(1);
       System.out.println(actualList.ifListEquals(expectedList));
        assertEquals(expectedList, actualList);


   }
}
