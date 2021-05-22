package app.vegetables;
import app.AddTo;
import app.ShoppingKart;

public class GreenPepper extends AddTo {
    public static String color="Green";
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