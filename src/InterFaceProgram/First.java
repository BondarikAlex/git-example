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
                ������������ �������� ��� �����:
                """);
        inOurMenu();
    }

    private static void inOurMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                � ����� ���� ��������:  3 ���� �������, � ����� ������ ��������� ���� ����������� ��� ������� � �������� ���!
                ������� ��� �����: � ������� ���� �� ������� ����� �� 3 �������� , �� ��������� ������ 10%!
                1 -  ������������ ������ - ��� ������������ ����� ������ � ��������� � ��������!
                2 -  ������-��� - ��� ��� ������������ ������� , ������� � �������!
                3 -  ������� - ��� ��� ������������ ���� ������� ��������� � ������� � �������� � ��������!
                4 -  ����������� ������ - ��� ������� ������� �� �������� ���� ������� �����������!
                5 -  ��������� �����!     
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
                �������� ����������� ������� ������� �������� � �����!
                1 - ������ (������� � ������� )!
                2 - ������ ��������!
                3 - ������ �������!
                4 - ������ �������!
                5 - ������ ����!
                6 - ������ ���������!
                7 - ������ �������� ���������!
                8 - ������ �������� ����! 
                9 - ��������� � ���������� ����!
                10 - ��������� �����!
                """);
    }
}
