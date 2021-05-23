package app.vegetables;
import app.AddTo;
import app.Bio;
import app.ShoppingKart;
import app.fruit.Tomato;

public class GreenPepper extends AddTo implements Bio {
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }

    public static void setColor(String color) {
        GreenPepper.color = color;
    }
    public static String color="Green";
    public static String name="Green pepper";
    public GreenPepper(ShoppingKart shoppingkart){
        super(shoppingkart);
        super.setNameproduct("Green pepper ");
    }


    @Override
    protected double cost() {

        return super.cost()+0.90;
    }
    public String getNameproduct(){return super.shoppingkart.getNameproduct() + super.getNameproduct();}
}