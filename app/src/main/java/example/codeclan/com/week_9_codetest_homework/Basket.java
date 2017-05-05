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

    public String getItems() {
        String item_string = "";
        Item item_in_loop;

        for (int i = 0; i < items.size(); i++) {
            item_in_loop = items.get(i);
            item_string = item_in_loop.getName().toString();
        }
        return item_string;
    }

    public int getItemCount(){
        return this.items.size();
    }

//    public int calculateTotalValue(){
////        return the value of each item in arrayList
//    }

    public int getTotalValue(){
        return this.total_value;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

}
