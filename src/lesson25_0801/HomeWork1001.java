package lesson25_0801;

import java.util.Scanner;

public class HomeWork1001 {
    public static void main(String[] args) {
        //Напишите BMI-Калькулятор -> google - BMI. Ввод данных с клавиатуры
        scannerBMI();
        System.out.println("____________");

        //Даны два числа, a и b. Верните большее из них. Не используйте никаких методов из библиотеки Math. Покажите работу тернарного оператора.
        System.out.println(getMeMax(15, 5)); //15
        System.out.println(getMeMax(4, 16)); //16
        System.out.println(getMeMax(20, 100)); //100
        System.out.println(getMeMax(100, 100)); //100
        System.out.println("____________");

        //Даны два числа, a и b. Верните меньшее из них. Не используйте никаких методов из библиотеки Math. Покажите работу тернарного оператора.
        System.out.println(getMeMin(15, 45)); //15
        System.out.println(getMeMin(44, 16)); //16
        System.out.println(getMeMin(200, 100)); //100
        System.out.println(getMeMin(100, 100)); //100
        System.out.println("____________");

        //Даны два строковых значения. Верните идущее по алфавиту раньше.
        System.out.println(myFirstCompareTo("Berlin", "Moscow")); //→ "Berlin"
        System.out.println(myFirstCompareTo("Minsk", "Moscow"));//→ "Minsk
        System.out.println(myFirstCompareTo("Kyiv", "Paris")); //→ "Kyiv"
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам"));//→ "Могилёв"
        System.out.println(myFirstCompareTo("", ""));//→ "Могилёв"
        System.out.println(myFirstCompareTo("", "Потсдам"));//→ "Могилёв"
        System.out.println(myFirstCompareTo("Могилёв", ""));
        System.out.println(myFirstCompareTo("Потсдам", "Потсдам"));//→ "Могилёв"
        System.out.println("____________");

        //Решите не используя цикл for: Даны целые числа A и B, где B > 0. Вывести B раз число A.
        printAtimesB(7, 3);
        printAtimesB(100, 5);
        printAtimesB(0, 5);
        printAtimesB(5, 0);
        System.out.println("____________");

        //Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.
        printRange(5, 17);
        printRange(-5, 5);
        printRange(17, 5);
    }

    private static void scannerBMI() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height (m)");
        double height = input.nextDouble();
        System.out.println("Enter your weight (kg)");
        double weight = input.nextDouble();
        System.out.println("Your BMI is: " + weight/(height*height));
    }

    private static void printRange(int a, int b) {
        int i = 0;
        do {
            System.out.print(a++ + " ");
            i++;
        } while (a <= b);
        System.out.println(" ");
    }

    private static int printAtimesB(int digit, int times) {
        int i = 0;
        while (i < times) {
            System.out.print(digit + " ");
            i++;
        }
        System.out.println(" ");
        return i;
    }

    private static String myFirstCompareTo(String city1, String city2) {
        if (city1.length() == 0 || city2.length() == 0) {
            return "Введите название городов";
        }
        int length = city1.length() > city2.length() ? city2.length() : city1.length();
        for (int i = 0; i < length; i++) {
            if (city1.charAt(i) < city2.charAt(i)) {
                return city1;
            } else if (city1.charAt(i) > city2.charAt(i)) {
                return city2;
            }
        }
        if (city1.length() > length) {
            return city2;
        } else if (city2.length() > length) {
            return city1;
        }
        return city1;
    }


    private static int getMeMin(int a, int b) {
        return a < b ? a : b;
    }

    private static int getMeMax(int a, int b) {
        return a > b ? a : b;
    }
}
