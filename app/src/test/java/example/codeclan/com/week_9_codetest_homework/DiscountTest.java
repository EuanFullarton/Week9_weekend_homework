package example.codeclan.com.week_9_codetest_homework;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/05/2017.
 */

public class DiscountTest {

    Item item1;
    Item item2;
    ArrayList<Item> items;
    Basket basket;

    @Before
    public void before() {
        item1 = new Item("Chocolate", 1);
        item2 = new Item("Coffee", 2);
        items = new ArrayList<Item>(0);
        basket = new Basket(items, 0);
    }

    @Test
    public void bogofTest(){

        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item1);
        assertEquals(3, basket.getItemCount());
        assertEquals(3, basket.getTotalValue());
    }
}
