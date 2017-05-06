package example.codeclan.com.week_9_codetest_homework;

import java.util.ArrayList;

/**
 * Created by user on 05/05/2017.
 */

public class Basket {

    private ArrayList<Item> items;
    private int total_value;

    public Basket(ArrayList<Item> items, int total_value){
        this.items = items;
        this.total_value = total_value;
    }

    public int getTotalValue(){
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

    public int getItemCount(){
        return this.items.size();
    }

    public int calculateTotalValue(){
        int total_value = 0;
        Item item_in_loop;

        for (int i = 0; i < items.size(); i++) {
            item_in_loop = items.get(i);
            total_value += item_in_loop.getValue();
        }
        return total_value;
    }

    public int getNumberofSpecificItem(Item item_checking_for) {
        int number_of_same_item = 0;
        Item item_in_loop;

        for (int i = 0; i < items.size(); i++) {
            item_in_loop = items.get(i);
            if (item_in_loop.getName() == item_checking_for.getName())
                number_of_same_item ++;
        }
        return number_of_same_item;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public void emptyBasket(){
        items.clear();
    }


}
