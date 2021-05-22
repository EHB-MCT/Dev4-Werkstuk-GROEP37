package app;


public abstract class AddTo extends ShoppingKart{
    protected ShoppingKart shoppingkart;
    protected AddTo(ShoppingKart shoppingkart){
        this.shoppingkart = shoppingkart;
    }
    protected double cost(){
        return shoppingkart.cost();
    }
}
