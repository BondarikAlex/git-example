package Functinal;

import Formula_HD.BaseHD;
import Formula_HD.Ingridiendts;
import Formula_HD.Toppings;

import java.util.ArrayList;

public class Order {
    private static Integer summa = 0;
    private static ArrayList<String> info;

    private static void createOrder() {
        if (!preOrder.getListOrder().isEmpty()) {
            for (int i = 0; i < preOrder.getListOrder().size(); i++) {
                Object o = preOrder.getListOrder().get(i);
                if (o.getClass().isInstance(BaseHD.HodDog)) {
                    o = (BaseHD.HodDog);
                    summa = ((BaseHD) o).getPrice();
                    info.add(((BaseHD) o).toString());

                } else if (o.getClass().isInstance(Ingridiendts.KETCHUP)) {
                    o = (Ingridiendts.KETCHUP);
                    summa = ((Ingridiendts) o).getPrice();
                    info.add(((Ingridiendts) o).toString());

                } else if (o.getClass().isInstance(Ingridiendts.MAYONNAISE)) {
                    o = (Ingridiendts.MAYONNAISE);
                    summa = ((Ingridiendts) o).getPrice();
                    info.add(((Ingridiendts) o).toString());
                } else if (o.getClass().isInstance(Ingridiendts.MUSTARD)) {
                    o = (Ingridiendts.MUSTARD);
                    summa = ((Ingridiendts) o).getPrice();
                    info.add(((Ingridiendts) o).toString());
                } else if (o.getClass().isInstance(Toppings.CHILE)) {
                    o = (Toppings.CHILE);
                    summa = ((Toppings) o).getPrice();
                    info.add(((Toppings) o).toString());

                } else if (o.getClass().isInstance(Toppings.HALAPENU)) {
                    o = (Toppings.HALAPENU);
                    summa = ((Toppings) o).getPrice();
                    info.add(((Toppings) o).toString());

                } else if (o.getClass().isInstance(Toppings.PICKLED_CUCUMBER)) {
                    o = (Toppings.PICKLED_CUCUMBER);
                    summa = ((Toppings) o).getPrice();
                    info.add(((Toppings) o).toString());

                } else if (o.getClass().isInstance(Toppings.SWEET_ONIONS)) {
                    o = (Toppings.SWEET_ONIONS);
                    summa = ((Toppings) o).getPrice();
                    info.add(((Toppings) o).toString());
                }
            }


        }
    }

    private static void youOrder() {
        System.out.println("""
                ВАШ ЗАКАЗ: Выполнен
                """);
        for (String el:info
             ) {
            System.out.println(el);

        }
        System.out.println("Сумма вашего заказа" + summa);
    }


}



