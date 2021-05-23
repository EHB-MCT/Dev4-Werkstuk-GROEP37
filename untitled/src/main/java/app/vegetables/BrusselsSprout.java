package app.vegetables;
import app.AddTo;
import app.Bio;
import app.ShoppingKart;

public class BrusselsSprout extends AddTo implements Bio {
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }

    public static void setColor(String color) {
        BrusselsSprout.color = color;
    }
    public static String color="Green";
    public static String name="Brussels sprout";
    public BrusselsSprout(ShoppingKart shoppingkart){
        super(shoppingkart);
        super.setNameproduct("Brussels sprout ");
    }


    @Override
    protected double cost() {
        return super.cost()+0.10;
    }
    public String getNameproduct(){return super.shoppingkart.getNameproduct() + super.getNameproduct();}
}