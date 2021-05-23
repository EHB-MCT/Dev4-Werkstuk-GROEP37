package app.vegetables;
import app.AddTo;
import app.Bio;
import app.ShoppingKart;
import app.fruit.Tomato;

public class YellowPepper extends AddTo implements Bio {
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }

    public static void setColor(String color) {
        YellowPepper.color = color;
    }
    public static String color="Yellow";
    public static String name="Yellow pepper";
    public YellowPepper(ShoppingKart shoppingkart){
        super(shoppingkart);
        super.setNameproduct("Yellow pepper ");
    }


    @Override
    protected double cost() {
        return super.cost()+0.90;
    }
    public String getNameproduct(){return super.shoppingkart.getNameproduct() + super.getNameproduct();}
}