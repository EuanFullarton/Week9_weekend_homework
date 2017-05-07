package example.codeclan.com.week_9_codetest_homework;

/**
 * Created by user on 05/05/2017.
 */

public class Item {

    private String name;
    private double value;
    private int quantity;

    public Item(String name, double value, int quantity) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public double getValue() {
        return this.value;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setName(String new_name) {
        this.name = new_name;
    }

    public void setValue(double new_value) {
        this.value = new_value;
    }

    public void setQuantity(int new_quantity) {
        this.quantity = new_quantity;
    }

}
