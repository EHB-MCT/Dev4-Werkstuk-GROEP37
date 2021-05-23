package app.vegetables;
import app.AddTo;
import app.Bio;
import app.ShoppingKart;

public class Radish extends AddTo implements Bio {
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }

    public static void setColor(String color) {
        Radish.color = color;
    }
    public static String color="Red";
    public static String name="Radish";
    public Radish(ShoppingKart shoppingkart){
        super(shoppingkart);
        super.setNameproduct("Radish ");
    }


    @Override
    protected double cost() {
        return super.cost()+0.45;
    }
    public String getNameproduct(){return super.shoppingkart.getNameproduct() + super.getNameproduct();}
}