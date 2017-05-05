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
        item = new Item("Chocolate", 1);
    }

    @Test
    public void hasName(){
        assertEquals("Chocolate", item.getName());
    }
}
