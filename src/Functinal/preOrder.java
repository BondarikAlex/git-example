package Functinal;

import java.util.ArrayList;

public class preOrder {

  private static ArrayList<Object> listOrder=new ArrayList<>();

    public static ArrayList<Object> getListOrder() {
        return listOrder;
    }

    public  void setListOrder(ArrayList<Object> listOrder) {
        this.listOrder = listOrder;
    }
    public static void addInListHD(Object o){
        listOrder.add(o);
    }
    public  static void clearListHd(){
        listOrder.clear();
    }
}
