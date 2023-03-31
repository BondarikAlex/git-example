package InterFaceProgram;

import Formula_HD.Ingridiendts;
import Formula_HD.Toppings;
import Functinal.preOrder;
import Functinal.preOrder.*;
import Formula_HD.BaseHD;

import java.util.Scanner;

public class First {
    private static void menu() {
        System.out.println("""
                Здравствуйте сделайте ваш заказ:
                """);
        inOurMenu();
    }

    private static void inOurMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                В нашем меню доступно:  3 типа хотдога, а также можете составить свой собственный тип хотдога и заказать его!
                Делайте ваш заказ: И помните если вы делаете заказ от 3 хотдогов , вы получаете скидку 10%!
                1 -  Классический хотдог - тип представляет собой хотдог с майонезом и кетчупом!
                2 -  Бэгель-дог - это тип представляет булочку , сосиску и горчицу!
                3 -  Чешский - это тип представляет собо сосиску свернутую в булочку с горчицей и кетчупом!
                4 -  Собственный хотдог - тип хотдога который вы создаете сами выбирая ингридеенты!
                5 -  Завершить заказ!     
                """);
        int tempNum = scanner.nextInt();
        switch (tempNum) {
            case 1 -> {
                preOrder.addInListHD(BaseHD.HodDog);
                preOrder.addInListHD(Ingridiendts.MAYONNAISE);
                preOrder.addInListHD(Ingridiendts.KETCHUP);
            }
            case 2 -> {
                preOrder.addInListHD(BaseHD.HodDog);
                preOrder.addInListHD(Ingridiendts.MUSTARD);
            }
            case 3 -> {
                preOrder.addInListHD(BaseHD.HodDog);
                preOrder.addInListHD(Ingridiendts.MUSTARD);
                preOrder.addInListHD(Ingridiendts.KETCHUP);
            }
            case 4 -> {
                Scanner scanner1 = new Scanner(System.in);
                int num = scanner1.nextInt();
                createHD();
                switch (num) {
                    case 1 -> {
                        preOrder.addInListHD(BaseHD.HodDog);
                    }
                    case 2 -> {
                        preOrder.addInListHD(Ingridiendts.MAYONNAISE);
                    }
                    case 3 -> {
                        preOrder.addInListHD(Ingridiendts.KETCHUP);
                    }
                    case 4 -> {
                        preOrder.addInListHD(Ingridiendts.MUSTARD);
                    }
                    case 5 -> {
                        preOrder.addInListHD(Toppings.CHILE);
                    }
                    case 6 -> {
                        preOrder.addInListHD(Toppings.HALAPENU);
                    }
                    case 7 -> {
                        preOrder.addInListHD(Toppings.PICKLED_CUCUMBER);
                    }
                    case 8 -> {
                        preOrder.addInListHD(Toppings.SWEET_ONIONS);
                    }case 9 -> {
                        inOurMenu();
                    }
                    case 10 ->{

                    }
                }

            }case 5 ->{

            }


        }


    }

    public static void createHD() {
        System.out.println("""
                Выберете ингридиенты которые желаете добавить в заказ!
                1 - ХотДог (сосиска в булочке )!
                2 - Порция майонеза!
                3 - Порция кетчупа!
                4 - Порция горчицы!
                5 - Порция чили!
                6 - Порция халапенью!
                7 - Порция соленных огурчиков!
                8 - Порция сладкого лука! 
                9 - Вернуться в предыдущее меню!
                10 - Завершить заказ!
                """);
    }
}
