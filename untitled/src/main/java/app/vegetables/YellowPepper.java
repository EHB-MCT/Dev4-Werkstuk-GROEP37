package app.vegetables;
import app.AddTo;
import app.ShoppingKart;

public class YellowPepper extends AddTo {
    public static String color="Yellow";
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