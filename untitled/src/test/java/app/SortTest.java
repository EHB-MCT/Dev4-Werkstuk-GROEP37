package app;

import app.fruit.*;
import app.vegetables.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class SortTest {
    @Test
    void sortMyShoppingKart() {
        ShoppingKart shoppingkart = new Price();
        ArrayList<Bio> sort = new ArrayList<Bio>();
        sort.add(new Pear(shoppingkart));
        sort.add(new Pineapple(shoppingkart));
        sort.add(new Tomato(shoppingkart));
        sort.add(new BrusselsSprout(shoppingkart));
        sort.add(new GreenPepper(shoppingkart));
        Iterator<Bio> sortIterator = sort.iterator();
        String colorsort = "Green";
        System.out.println("Fruits that are : " + colorsort);
        while (sortIterator.hasNext()) {
            Bio item = sortIterator.next();
            if (item.getColor().equals(colorsort)) {
                System.out.println(item.getName());
            }

        }
    }
}
