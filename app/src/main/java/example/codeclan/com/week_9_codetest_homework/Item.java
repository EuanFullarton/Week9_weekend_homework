package example.codeclan.com.week_9_codetest_homework;

/**
 * Created by user on 05/05/2017.
 */

public class Item {

    private String name;
    private int value;

        public Item(String name, int value) {
            this.name = name;
            this.value = value;
        }

        public String getName(){
            return this.name;
        }

        public int getValue(){
            return this.value;
        }

        public int bogof(){
        int original_price = this.getValue();
        int new_price = (original_price / 2);
        return new_price;
    }


}
