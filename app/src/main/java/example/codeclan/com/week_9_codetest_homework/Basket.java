package example.codeclan.com.week_9_codetest_homework;

import java.util.ArrayList;

/**
 * Created by user on 05/05/2017.
 */

public class Basket {

    private ArrayList<Item> items;
    private double total_value;

    public Basket(ArrayList<Item> items, int total_value) {
        this.items = items;
        this.total_value = total_value;
    }

    public double getTotalValue() {
        return this.total_value;
    }

    public String getAllItems() {
        String item_string = "";
        Item item_in_loop;

        for (int i = 0; i < items.size(); i++) {
            item_in_loop = items.get(i);
            if (i == items.size() - 1) {
                item_string += item_in_loop.getName().toString();
            } else {
                item_string += item_in_loop.getName().toString() + ", ";
            }
        }
        return item_string;
    }

    public int getItemCount() {
        return this.items.size();
    }

    public int calculateTotalValue() {
        int new_total_value = 0;
        Item item_in_loop;

        for (int i = 0; i < items.size(); i++) {
            item_in_loop = items.get(i);
            new_total_value += (item_in_loop.getValue()) * (item_in_loop.getQuantity());
        }
        setTotalValue(new_total_value);
        return new_total_value;
    }

    public int getNumberofSpecificItem(Item item) {
        return item.getQuantity();
    }

    public void setTotalValue(double new_total_value) {
        this.total_value = new_total_value;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void emptyBasket() {
        items.clear();
    }

    public void tenPercentOverTwentySpent() {
        double new_total_value = 0;
        double discount_amount;

        if (calculateTotalValue() >= 20) {
            discount_amount = total_value * 0.1;
            new_total_value = total_value - discount_amount;
            this.setTotalValue(new_total_value);
        }
    }

    public void loyaltyDiscount(){
        double new_total_value = 0;
        double discount_amount;
        discount_amount = total_value * 0.02;
        new_total_value = total_value - discount_amount;
        new_total_value = Math.round(new_total_value * 100.0)/ 100.0;
        this.setTotalValue(new_total_value);
    }


}
