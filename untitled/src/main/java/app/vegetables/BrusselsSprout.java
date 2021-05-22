package app.vegetables;
import app.AddTo;
import app.ShoppingKart;

public class BrusselsSprout extends AddTo {
    public static String color="Green";
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