package lesson08_0312;

import javax.swing.*;
import javax.swing.plaf.nimbus.AbstractRegionPainter;

public class HWanalyse {
    public static void main(String[] args) {
        trueWayOne("налево");
        trueWayTwo(1);
        trueWayThree(2);
    }

    private static void trueWayOne(String way) {
        // if (way == "налево")
        if (way.equals("налево")) {
            System.out.println("Колу найдешь");
        } else if (way.equals("направо")) {
            System.out.println("Пиво найдешь");
        } else if (way.equals("прямо")) {
            System.out.println("Водку найдешь");
        } else {
            System.out.println("Работу найдешь");
        }
    }

    private static void trueWayTwo(int way) {
        if (way == 1) {
            System.out.println("направо");
        } else if (way == 2) {
            System.out.println("прямо");
        } else if (way == 3) {
            System.out.println("куда-то");
        }else {
            System.out.println("Choose direction");
        }
    }



    private static void trueWayThree(int way) {
        switch (way) {
            case 1:
                System.out.println("Variant 1");
                break;
            case 2:
                System.out.println("Variant 2");
                break;
            case 3:
                System.out.println("Variant 3");
                break;
            default:
                System.out.println("Choose something");
                break;
        }

    }
}
