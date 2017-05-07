package example.codeclan.com.week_9_codetest_homework;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/05/2017.
 */

public class ItemTest {

    Item item;

    @Before
    public void before() {
        item = new Item("Coffee", 2, 1);
    }

    @Test
    public void hasName(){
        assertEquals("Coffee", item.getName());
    }

    @Test
    public void hasValue(){
        assertEquals(2.0, item.getValue());
    }

    @Test
    public void hasQuantity(){
        assertEquals(1, item.getQuantity());
    }

    @Test
    public void canSetName(){
        item.setName("Tea");
        assertEquals("Tea", item.getName());
    }

    @Test
    public void canSetValue(){
        item.setValue(5);
        assertEquals(5.0, item.getValue());
    }

    @Test
    public void canSetQuantity(){
        item.setQuantity(2);
        assertEquals(2, item.getQuantity());
    }

    @Test
    public void testBogof(){
        item.setQuantity(2);
        item.bogof();
        assertEquals(1.0, item.getValue());
        //test whether discount applies if number is odd:
        item.setValue(2);
        item.setQuantity(3);
        item.bogof();
        assertEquals(3.0, item.getValue());
    }


}
