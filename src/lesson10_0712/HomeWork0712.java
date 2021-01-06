package lesson10_0712;

public class HomeWork0712 {
    public static void main(String[] args) {
        //1. Напишите программу, которая находит чётные числа*.
        System.out.println(findEvenNumbers(50)); //true
        System.out.println(findEvenNumbers(75)); //false
        separator();
        //2. Напишите программу, которая находит нечётные числа.
        System.out.println(findUnevenNumbers(1000)); //false
        System.out.println(findUnevenNumbers(999)); //true
        separator();
        //3. Напишите программу, которая находит числа кратные 11 между a и b.
        findModulo11(0, 500);
        separator();
        //4. Напишите программу, которая проверяет год на високосность. Кратный четырём.
        System.out.println(leapYear(1996)); //true
        System.out.println(leapYear(2020)); //true
        System.out.println(leapYear(2021)); //false
        separator();
        //5. Прочитайте в Википедии, какие года являются високосными и дополните предыдущую задачу.
        System.out.println(leapYear2(1700)); //false
        System.out.println(leapYear2(1800)); //false
        System.out.println(leapYear2(1600)); //true
        System.out.println(leapYear2(2000)); //true
        System.out.println(leapYear2(2016)); //true
        System.out.println(leapYear2(2020)); //true
        System.out.println(leapYear2(2021)); //false
        separator();
        //6. Дано число меньше 3000. При делении числа на 32 получается остаток 30, при делении на 58 - остаток 44. Найдите число или числа.
        findNumbers(0, 3000);
    }

    public static void separator() {
        System.out.println("\n_______________");
    }

    public static boolean findEvenNumbers(int number) {
        return number % 2 == 0;
    }

    public static boolean findUnevenNumbers(int number) {
        return number % 2 != 0;
    }

    public static void findModulo11(int a, int b) {
        for (int i = a; i < b; i++) {
            if (i % 11 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean leapYear(int year) {
        return year % 4 == 0;
    }

    private static boolean leapYear2(int year) {
        if ((year % 100 == 0) && !(year % 400 == 0)) {
            return false;
        } else if ((year % 4 == 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void findNumbers(int a, int b) {
        for (int i = a; i < b; i++) {
            if ((i % 32 == 30) && (i % 58 == 44)) {
                System.out.println(i);

            }

        }

    }
}








