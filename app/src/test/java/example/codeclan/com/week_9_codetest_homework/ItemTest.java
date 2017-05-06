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
        assertEquals(2, item.getValue());
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
        assertEquals(5, item.getValue());
    }

    @Test
    public void canSetQuantity(){
        item.setQuantity(6);
        assertEquals(6, item.getQuantity());
    }


}
