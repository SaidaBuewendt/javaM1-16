package lesson13_1012;

public class HomeWork1012 {
    public static void main(String[] args) {
      /*You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2, the result is 10.
        Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are different from a, the result is 1.
        Otherwise the result is 0.*/
        System.out.println(redTicket(2, 2, 2));// →10
        System.out.println(redTicket(2, 2, 1));// →0
        System.out.println(redTicket(0, 0, 0));// →5
        System.out.println(redTicket(2, 1, 1));// →1

        System.out.println("________________");

      /*Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If
        either string is length 0, use '@' for its missing char.*/
        System.out.println(lastChars("last", "chars")); //→"ls"
        System.out.println(lastChars("yo", "java")); // →"ya"
        System.out.println(lastChars("hi", ""));// →"h@"
        System.out.println(lastChars("", ""));// →"@@"

        System.out.println("________________");

      /*  Конвертер валют. Используя метод из предыдущего пункта реализовать метод который получает пару валют и сумму в первой валюте,
        возвращает сумму во второй валюте.*/
        System.out.println(currencyConverter("EUR", "RUB", 1000));
        System.out.println(currencyConverter("RUB", "EUR", 1000));
        System.out.println(currencyConverter("GBP", "EUR", 100));
        System.out.println("________________");

        /*Окна и двери
        В старых советских хрущёвках города № решили поменять деревянные окна и двери на пластиковые.
        Выяснилось, что все двери в хрущёвках одинакового размера 2м*90см, а окна разные, но в каждой квартире могут быть только одинаковые окна.
        Стоимость переделки окон рассчитывается из стоимости стекла - 100€ за квадратный метр и стоимости косяка - погонный метр 100€.
        Стоимость дверей рассчитывается исходя из стоимости косяка (как и у окна) и стоимости самой двери 120€ за квадратный метр.
        Напишите программу, которая поможет стройтресту №12 правильно выставлять счета.*/

        System.out.println("Стоимость ремонта: " + repairCost(1, 1, 1, 1) + " Евро");//1206
        System.out.println("Стоимость ремонта: " + repairCost(3, 2, 1.7, 1.5) + " Евро");// 3908
        System.out.println("Стоимость ремонта: " + repairCost(4, 5, 1.7, 1.5) + " Евро");// 7299

    }

    private static double repairCost(int doorQuantity, int winQuantity, double winHeight, double winWidth) {
        return doorsCost(doorQuantity) + windowsCost(winHeight, winWidth, winQuantity);
    }

    private static double doorsCost(int doorQuantity) {
        double height = 2;
        double width = 0.9;
        double cost = (height * width * doorQuantity * 120) + ((height * 2) + width) * 100 * doorQuantity;
        return cost;
    }

    private static double windowsCost(double height, double width, int winQuantity) {
        double cost = (height * width * winQuantity * 100) + ((height + width) * 2 * 100 * winQuantity);
        return cost;
    }

    private static double currencyConverter(String currInput, String currOutput, double money) {
        return money * Excercise.justAsk(currInput, currOutput);
    }

    private static String lastChars(String a, String b) {
        if (a.length() == 0 && b.length() == 0) {
            return "@@";
        } else if (a.length() == 0) {
            return "@" + b.substring(b.length() - 1);
        } else if (b.length() == 0) {
            return a.charAt(0) + "@";
        } else {
            return a.charAt(0) + b.substring(b.length() - 1);
        }

    }


    private static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        } else {
            return 0;
        }
    }
}