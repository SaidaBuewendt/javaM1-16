package lesson06_0112;


import com.sun.org.apache.xerces.internal.impl.xs.util.XSObjectListImpl;

public class HomeWork0112 {
    public static void main(String[] args) {
  /*      1. Напишите программу действий кассира магазина, если у него пытаются купить алкоголь следующие 5 покупателей:
        10 лет, 17 лет, 18 лет, 20 лет и 30 лет.*/
        System.out.println(sellAlcoOrNot(17));
        System.out.println(sellAlcoOrNot2(15 ));
        split();
        // 2. Напишите программу, которая определяет сезон года. Месяца указаны int переменными.
        System.out.println(defineSeason(15));
    }

    public static void split() {
        System.out.println("_________________");
    }

    public static String sellAlcoOrNot(int age) {
        String permission = "";
        switch (age) {
            case 10:
                permission = "Not allowed";
                break;
            case 17:
                permission = "Not allowed";
                break;
            case 18:
                permission = "Allowed";
                break;
            case 20:
                permission = "Allowed";
                break;
            case 30:
                permission = "Allowed";
                break;
            default:
                permission = "Enter correct age";
        }
        return permission;
    }

    public static boolean sellAlcoOrNot2(int age) {
        return age >= 18;
    }

    public static String defineSeason(int month) {
        String season = "";
        switch (month) {
            case 1:
                season = "Winter";
                break;
            case 2:
                season = "Winter";
                break;
            case 3:
                season = "Spring";
                break;
            case 4:
                season = "Spring";
                break;
            case 5:
                season = "Spring";
                break;
            case 6:
                season = "Summer";
                break;
            case 7:
                season = "Summer";
                break;
            case 8:
                season = "Summer";
                break;
            case 9:
                season = "Autumn";
                break;
            case 10:
                season = "Autumn";
                break;
            case 11:
                season = "Autumn";
                break;
            case 12:
                season = "Winter";
                break;
            default:
                season = "Enter correct month";

        }
        return season;
    }


}
