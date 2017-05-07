package example.codeclan.com.week_9_codetest_homework;

import java.util.ArrayList;

/**
 * Created by user on 07/05/2017.
 */

public class Checkout {
    private ArrayList<Item> items;
    private Basket basket;
    private Item item;


    public Checkout(Basket basket) {
        this.basket = basket;
    }

    public double getTotalBasketValue() {
        return basket.getTotalValue();
    }

    public double calculateTotalBasketValue(Basket basket) {
        double new_total_value = 0;
        Item item_in_loop;
        items = basket.getBasketItems();

        for (int i = 0; i < items.size(); i++) {
            item_in_loop = items.get(i);
            new_total_value += (item_in_loop.getValue()) * (item_in_loop.getQuantity());
        }
        new_total_value = Math.round(new_total_value * 100.0) / 100.0;
        basket.setTotalValue(new_total_value);
        return new_total_value;
    }

    public double getTotalValueOfSpecificItems(Item item){
        double total_item_value = (item.getValue() * item.getQuantity());
        return total_item_value;
    }

    public void setTotalBasketValue(double new_total_value) {
        basket.setTotalValue(new_total_value);
    }


    public void tenPercentOverTwentySpent(Basket basket) {
        double new_total_value = 0;
        double discount_amount;

        if (calculateTotalBasketValue(basket) >= 20) {
            discount_amount = basket.getTotalValue() * 0.1;
            new_total_value = basket.getTotalValue() - discount_amount;
            new_total_value = Math.round(new_total_value * 100.0) / 100.0;
            this.setTotalBasketValue(new_total_value);
        }
    }

}