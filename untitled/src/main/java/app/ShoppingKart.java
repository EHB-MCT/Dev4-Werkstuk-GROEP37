package app;

import app.fruit.*;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class ShoppingKart {
    protected String nameproduct;

    protected void setNameproduct(String nameproduct){
        this.nameproduct = nameproduct;
    }
    public String getNameproduct(){return nameproduct;}
    protected abstract double cost();
    public void SearchColor(String color){

    }

}
