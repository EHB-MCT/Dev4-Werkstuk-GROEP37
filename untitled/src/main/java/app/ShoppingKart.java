package app;

import app.fruit.*;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class ShoppingKart {
    protected String nameproduct;

    /*protected ArrayList<String> listcolor;
protected void setListcolor(ArrayList<String> listcolor){
    this.listcolor=listcolor;
}*/
/*public ArrayList<String> getListcolor(){return listcolor;}*/
    protected void setNameproduct(String nameproduct){
        this.nameproduct = nameproduct;
    }
    public String getNameproduct(){return nameproduct;}
    protected abstract double cost();
    public void SearchColor(String color){

/*switch(){
    case "RED" :[]
}*/
        /*Iterator<String> it = listcolor.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
*/

    }

}
