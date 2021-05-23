package app.fruit;
import app.AddTo;
import app.Bio;
import app.ShoppingKart;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple extends AddTo implements Bio {
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }

    public static void setColor(String color) {
        Apple.color = color;
    }

    public static String color="Red";
    public static String name="Apple";
    public Apple(ShoppingKart shoppingkart){
        super(shoppingkart);
        super.setNameproduct("Apple ");
        /*if(super.getListcolor()!= null){
        super.getListcolor().add(color);
        super.setListcolor(super.getListcolor());
        }else{
            super.setListcolor(new ArrayList<String>(Arrays.asList(color)));
        }
        System.out.println(super.getListcolor()+ "ICI1");
        System.out.println(super.shoppingkart.getListcolor() + "LA1");*/

    }

    @Override
    protected double cost() {
        return super.cost()+0.50;
    }

    public String getNameproduct(){return super.shoppingkart.getNameproduct() + super.getNameproduct();}
    /*public ArrayList<String> getListcolor(){
        if(super.getListcolor()!=null && super.shoppingkart.getListcolor()!=null){
            super.getListcolor().addAll(super.shoppingkart.getListcolor());
            return super.getListcolor();
        }else{
            return super.getListcolor();
        }
    };*/
}
