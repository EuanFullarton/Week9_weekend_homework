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
        assertEquals(0.0, basket.getTotalValue());
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
    public void canGetAllItemsAsStrings(){
        basket.addItem(item1);
        basket.addItem(item2);
        assertEquals("Chocolate, Coffee", basket.getAllItemsAsStrings());
    }

//    @Test
//    public void canGetTotalValue(){
//        basket.addItem(item1);
//        basket.addItem(item2);
//        assertEquals(3.0, basket.calculateTotalValue());
//    }

    @Test
    public void canGetItemQuantity(){
        item1.setQuantity(5);
        basket.addItem(item1);
        assertEquals(5, basket.getNumberofSpecificItem(item1));
    }

    @Test
    public void canEmptyBasket(){
        basket.emptyBasket();
        assertEquals(0, basket.getItemCount());
    }

//    @Test
//    public void testTenPercentDiscount(){
//        item1.setValue(25);
//        basket.addItem(item1);
//        assertEquals(25.0, basket.calculateTotalValue());
//        basket.tenPercentOverTwentySpent();
//        assertEquals(22.5, basket.getTotalValue());
//        //test if discount doesn't apply if total value is under 20:
//        basket.emptyBasket();
//        basket.addItem(item2);
//        assertEquals(2.0, basket.calculateTotalValue());
//        basket.tenPercentOverTwentySpent();
//        assertEquals(2.0, basket.getTotalValue());
//    }

//    @Test
//    public void testLoyaltyDiscount(){
//        basket.addItem(item1);
//        basket.addItem(item2);
//        assertEquals(3.0, basket.calculateTotalValue());
//        basket.loyaltyDiscount();
//        assertEquals(2.94, basket.getTotalValue());
//    }

//    @Test
//    public void tripleDiscountTest(){
//
//        //buy one get one free discount
//        item1.setValue(10);
//        item1.setQuantity(2);
//        item1.bogof();
//        basket.addItem(item1);
//        basket.calculateTotalValue();
//        assertEquals(10.0, basket.getTotalValue());
//
//        //adding items for total to go above 20
//        item2.setValue(6);
//        item2.setQuantity(2);
//        basket.addItem(item2);
//        basket.calculateTotalValue();
//        assertEquals(22.0, basket.getTotalValue());
//
//        //applying 10% discount
//        basket.tenPercentOverTwentySpent();
//        assertEquals(19.8, basket.getTotalValue());
//
//        //applying loyalty discount
//        basket.loyaltyDiscount();
//        assertEquals(19.40, basket.getTotalValue());
//    }

}
