package lesson13_1012;

import com.sun.java.swing.plaf.windows.WindowsDesktopPaneUI;

import javax.swing.plaf.BorderUIResource;

public class Excercise {
    public static void main(String[] args) {
        /*6. Стоимость электроэнергии
        Стоимость электроэнергии рассчитывается исходя из стоимости одного киловатт-часа в 20 центов.
        Базовая плата - 30€. В базовую плату входят 100 киловатт-часов. Напишите метод расчёта стоимости пользования
        электроэнергией*/
        System.out.println(costOfElectricity(500));
        System.out.println(costOfElectricity(101));
        System.out.println(costOfElectricity(80));
        System.out.println(costOfElectricity(0));

        // System.out.println(costOfElectricity2(500));
        //System.out.println(costOfElectricity2(101));
        //System.out.println(costOfElectricity2(80));
        //System.out.println(costOfElectricity2(0));


        /*. Спортивные мячи почтой
        На складе крупной базы летом продают очень много спортивных мячей. Разного размера. Напиши метод, который в
        зависимости от диаметра мяча подбирает более подходящую упаковку с запасом в минимум 5% от размера мяча.
        Напишите программу, принимающую диаметр мяча и возвращающую тип коробки. Почтовые коробки на базе бывают
        размерами:
        Тип А - 200x200x200 мм
        Тип Б -150x150x150 мм
        Тип В -250x250x250 мм
        Тип Г -350x400x500 мм
        Тип Д -400x400x400 мм*/
        double basketball = 320;
        double volleyball = 250;
        System.out.println(findBox(100));
        System.out.println(findBox(200));
        System.out.println(findBox(330));
        System.out.println(findBox(430));
        System.out.println(findBox(basketball));
        System.out.println(findBox(volleyball));

       /* 8. Конвертер валют
            Реализовать метод, который принимает название валюты (например, “EUR”,”RUR”,”USD”,”GPB”) и выдает курс к
        доллару. Естественно, “USD” возвращает 1.0 .
            Используя метод из предыдущего пункта написать метод, который принимает пару валют (“GPB”,”EUR”) и возвращает
        курс обмена.
            Используя метод из предыдущего пункта реализовать метод который получает пару валют и сумму в первой валюте,
        возвращает сумму во второй валюте.*/

        System.out.println(currencyConverter1(1000, "GBP"));
        System.out.println(currencyConverter1(1000, "RUB"));
        System.out.println(currencyConverter1(1000, "USD"));
        System.out.println(justAsk("GBP", "EUR"));
        System.out.println(justAsk("RUB", "EUR"));
        System.out.println(justAsk("GBP", "EUR"));
    }

    public static double justAsk(String currNameInput, String currNameOutput) {
        double curs = findCourse(currNameInput)/findCourse(currNameOutput);
        return curs;
    }

    public static double currencyConverter1(double money, String currencyName) {
        double resultUSD = 0.0;
        resultUSD = money * findCourse(currencyName);
        return resultUSD;
    }

    public static double findCourse(String currencyName) {
        double currencyCourse = 0.0;
        switch (currencyName) {
            case "USD":
                currencyCourse = 1.0;
                break;
            case "EUR":
                currencyCourse = 1.21;
                break;
            case "GBP":
                currencyCourse = 1.33;
                break;
            case "RUB":
                currencyCourse = 0.014;
                break;
            default:
                currencyCourse = 0;
                break;
        }
        return currencyCourse;
    }

    public static String findBox(double ball) {
        ball = ball * 1.05;
        if (ball <= 150) {
            return "Тип Б";
        } else if (ball <= 200) {
            return "Тип А";
        } else if (ball <= 250) {
            return "Тип В";
        } else if (ball <= 350) {
            return "Тип Г";
        } else if (ball <= 400) {
            return "Тип Д";
        } else {
            return "Не можем подобрать тип";
        }
    }

    private static double costOfElectricity(int kilovatt) {
        //Дано 1кв/ч = 0,2 евро
        //1 Месяц = 30 евро
        //10 кв/ч
        // double monthCost = 0.0;
        if (kilovatt > 100) {
            return (kilovatt - 100) * 0.2 + 30;
        } else {
            return 30.0;
        }
    }

    private static void costOfElectricity2(int kilovatt) {
        //Дано 1кв/ч = 0,2 евро
        //1 Месяц = 30 евро
        //10 кв/ч
        double monthCost = 30.0;
        if (kilovatt > 100) {
            monthCost += (kilovatt - 100) * 2;
        } else
            System.out.println(monthCost);
    }
}


