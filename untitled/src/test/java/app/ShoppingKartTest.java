package app;

import app.fruit.*;
import app.vegetables.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ShoppingKartTest {
    @Test
    void createMyShoppingKart(){
        ArrayList<ShoppingKart> sort = new ArrayList<ShoppingKart>();
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


System.out.println(shoppingkart.getNameproduct()+ " $ " + Math.round(shoppingkart.cost()*100.0)/100.0);
System.out.println(shoppingkart);

    }


}
