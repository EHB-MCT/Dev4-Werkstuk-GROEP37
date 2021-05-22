package app.vegetables;
import app.AddTo;
import app.ShoppingKart;

public class RedPepper extends AddTo {
    public static String color="Red";
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