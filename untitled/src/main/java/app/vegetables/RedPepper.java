package app.vegetables;
import app.AddTo;
import app.Bio;
import app.ShoppingKart;

public class RedPepper extends AddTo implements Bio {
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }

    public static void setColor(String color) {
        RedPepper.color = color;
    }
    public static String color="Red";
    public static String name="Red pepper";
    public RedPepper(ShoppingKart shoppingkart){
        super(shoppingkart);
        super.setNameproduct("Red pepper ");
    }


    @Override
    protected double cost() {
        return super.cost()+0.90;
    }
    public String getNameproduct(){return super.shoppingkart.getNameproduct() + super.getNameproduct();}
}