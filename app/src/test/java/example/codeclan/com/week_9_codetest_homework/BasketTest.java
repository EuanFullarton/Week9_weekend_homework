package example.codeclan.com.week_9_codetest_homework;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/05/2017.
 */

public class BasketTest {

    Item item1;
    Item item2;
    ArrayList<Item> items;
    Basket basket;

    @Before
    public void before() {
        item1 = new Item("Chocolate", 1, 1);
        item2 = new Item("Coffee", 2, 1);
        items = new ArrayList<Item>(0);
        basket = new Basket(items, 0);
    }

    @Test
    public void hasTotalValue(){
        assertEquals(0, basket.getTotalValue());
    }

    @Test
    public void basketStartsEmpty(){
        assertEquals(0, basket.getItemCount());
    }

    @Test
    public void canAddItem(){
        basket.addItem(item1);
        assertEquals(1, basket.getItemCount());
    }

    @Test
    public void canRemoveItem(){
        basket.addItem(item1);
        basket.addItem(item2);
        basket.removeItem(item1);
        assertEquals(1, basket.getItemCount());
    }

    @Test
    public void canGetAllItems(){
        basket.addItem(item1);
        basket.addItem(item2);
        assertEquals("Chocolate, Coffee", basket.getAllItems());
    }

    @Test
    public void canGetTotalValue(){
        basket.addItem(item1);
        basket.addItem(item2);
        assertEquals(3, basket.calculateTotalValue());
    }

    @Test
    public void countNumberOfItem(){
        basket.addItem(item1);
        basket.addItem(item1);
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item2);
        assertEquals(3, basket.getNumberofSpecificItem(item1));
        assertEquals(2, basket.getNumberofSpecificItem(item2));
    }

    @Test
    public void canEmptyBasket(){
        basket.emptyBasket();
        assertEquals(0, basket.getItemCount());
    }

}
