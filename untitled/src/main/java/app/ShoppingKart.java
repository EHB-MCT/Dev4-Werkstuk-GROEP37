package app;

import java.util.ArrayList;

public abstract class ShoppingKart {
    protected String nameproduct;

    protected void setNameproduct(String nameproduct){
        this.nameproduct = nameproduct;
    }
    public String getNameproduct(){return nameproduct;}
    protected abstract double cost();
    public ArrayList<ShoppingKart> listcolor = new ArrayList<ShoppingKart>();
    public void SearchColor(String color){


    }

}
