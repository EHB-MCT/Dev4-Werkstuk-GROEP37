package app;

import app.fruit.*;
import app.vegetables.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingKartTest {
    @Test
    void createMyShoppingKart() {
        ShoppingKart shoppingkart = new Price();
        shoppingkart = new Apple(shoppingkart);
        shoppingkart = new Banana(shoppingkart);
        shoppingkart = new Pear(shoppingkart);
        shoppingkart = new Pineapple(shoppingkart);
        shoppingkart = new Tomato(shoppingkart);
        shoppingkart = new BrusselsSprout(shoppingkart);
        shoppingkart = new GreenPepper(shoppingkart);
        shoppingkart = new Radish(shoppingkart);
        shoppingkart = new RedPepper(shoppingkart);
        shoppingkart = new YellowPepper(shoppingkart);

        ArrayList<Bio> sort = new ArrayList<Bio>();
        sort.add(new Apple(shoppingkart));
       sort.add(new Banana(shoppingkart));
        sort.add(new Pear(shoppingkart));
        sort.add(new Pineapple(shoppingkart));
        sort.add(new Tomato(shoppingkart));
        sort.add(new BrusselsSprout(shoppingkart));
        sort.add(new GreenPepper(shoppingkart));
        sort.add(new Radish(shoppingkart));
        sort.add(new RedPepper(shoppingkart));
        sort.add(new YellowPepper(shoppingkart));
        System.out.println(sort.get(2).getColor());
        System.out.println(shoppingkart.getNameproduct() + " $ " + Math.round(shoppingkart.cost() * 100.0) / 100.0);

        Iterator<Bio> sortIterator = sort.iterator();

        while (sortIterator.hasNext()) {
            Bio item = sortIterator.next();
            if(item.getColor().equals("Yellow")){
    System.out.println(item.getName());
}


        }


    }
}
