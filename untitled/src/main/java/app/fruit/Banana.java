package app.fruit;
import app.AddTo;
import app.Bio;
import app.ShoppingKart;

import java.util.ArrayList;
import java.util.Arrays;

public class Banana extends AddTo implements Bio {
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }

    public static void setColor(String color) {
        Banana.color = color;
    }
    public static String color="Yellow";
    public static String name="Banana";
    public Banana(ShoppingKart shoppingkart){
        super(shoppingkart);
        super.setNameproduct("Banana ");
  /*      if(super.getListcolor()!= null){
            super.getListcolor().add(color);
            super.setListcolor(super.getListcolor());
        }else{
            super.setListcolor(new ArrayList<String>(Arrays.asList(color)));
        }
        System.out.println(super.getListcolor()+ "ICI1");
        System.out.println(super.shoppingkart.getListcolor() + "LA1");
*/
    }


    @Override
    protected double cost() {
        return super.cost()+0.80;
    }
    public String getNameproduct(){return super.shoppingkart.getNameproduct() + super.getNameproduct();}
  /*  public ArrayList<String> getListcolor(){
        super.shoppingkart.getListcolor().addAll(super.getListcolor());
        System.out.println(super.getListcolor()+ "ICI3");
        return super.getListcolor();
    };*/
}