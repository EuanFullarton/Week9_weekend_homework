package example.codeclan.com.week_9_codetest_homework;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 07/05/2017.
 */

public class CheckoutTest {

    ArrayList<Item> items;
    Basket basket;
    Item item1;
    Item item2;
    Checkout checkout;

    @Before
    public void before() {
        items = new ArrayList<Item>(0);
        item1 = new Item("Chocolate", 1, 1);
        item2 = new Item("Coffee", 2, 1);
        basket = new Basket(items, 0);
        checkout = new Checkout(basket);
    }

    @Test
    public void canGetTotalBasketValue() {
        basket.addItem(item1);
        basket.addItem(item2);
        assertEquals(3.0, checkout.calculateTotalBasketValue(basket));
    }

    @Test
    public void canGetTotalValueofSpecificItems() {
        assertEquals(1.0, checkout.getTotalValueOfSpecificItems(item1));
    }

    @Test
    public void canSetItemValue(){
        checkout.setItemValue(item1, 3);
        assertEquals(3.0, checkout.getTotalItemValue(item1));
    }

    @Test
    public void testTenPercentDiscount() {
        item1.setValue(25);
        basket.addItem(item1);
        assertEquals(25.0, checkout.calculateTotalBasketValue(basket));
        checkout.tenPercentOverTwentySpent(basket);
        assertEquals(22.5, checkout.getTotalBasketValue());
        //test if discount doesn't apply if total value is under 20:
        basket.emptyBasket();
        basket.addItem(item2);
        assertEquals(2.0, checkout.calculateTotalBasketValue(basket));
        checkout.tenPercentOverTwentySpent(basket);
        assertEquals(2.0, checkout.getTotalBasketValue());
    }

    @Test
    public void testLoyaltyDiscount() {
        basket.addItem(item1);
        basket.addItem(item2);
        assertEquals(3.0, checkout.calculateTotalBasketValue(basket));
        checkout.loyaltyDiscount(basket);
        assertEquals(2.94, checkout.getTotalBasketValue());
    }

    @Test
    public void testBogof(){
        item1.setQuantity(4);
        checkout.bogof(item1);
        assertEquals(2.0, checkout.getTotalItemValue(item1));
        //tests whether discount works if number is odd:
        checkout.setItemValue(item1, 2);
        item1.setQuantity(3);
        checkout.bogof(item1);
        assertEquals(4.0, checkout.getNewItemValue(item1));
    }

    @Test
    public void tripleDiscountTest() {

        //buy one get one free discount
        checkout.setItemValue(item1, 10);
        item1.setQuantity(2);
        checkout.bogof(item1);
        basket.addItem(item1);
        checkout.calculateTotalBasketValue(basket);
        assertEquals(10.0, checkout.getTotalBasketValue());

        //adding items for total to go above 20
        checkout.setItemValue(item2, 6);
        item2.setQuantity(2);
        basket.addItem(item2);
        checkout.calculateTotalBasketValue(basket);
        assertEquals(22.0, checkout.getTotalBasketValue());

        //applying 10% discount
        checkout.tenPercentOverTwentySpent(basket);
        assertEquals(19.8, checkout.getTotalBasketValue());

        //applying loyalty discount
        checkout.loyaltyDiscount(basket);
        assertEquals(19.40, checkout.getTotalBasketValue());
    }

}
