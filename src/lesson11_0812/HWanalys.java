package lesson11_0812;

public class HWanalys {
    public static void main(String[] args) {
        ////6. Дано число меньше 3000. При делении числа на 32 получается остаток 30, при делении на 58 - остаток 44. Найдите число или числа.
        findMagicNumbers();
        System.out.println(leapYear(2000)); //true
        System.out.println(leapYear(2020)); //true
        System.out.println(leapYear(1800)); //false
        System.out.println(leapYear(2021)); //false

        System.out.println(leapYear2(1600));
        System.out.println(leapYear2(2020));
        System.out.println(leapYear2(2021));

        System.out.println(leapYear3(1600));
        System.out.println(leapYear3(2020));
        System.out.println(leapYear3(2021));

        System.out.println(findEvenNumbers(100));
        System.out.println(findEvenNumbers(99));

        System.out.println(findUnevenNumbers(100));
        System.out.println(findUnevenNumbers(99));
    }

    private static boolean leapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    private static boolean leapYear2(int year) {
        return year % 400 == 0 || year % 4 == 0 ^ year % 100 == 0;
    }

    private static boolean leapYear3(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

    private static void findMagicNumbers() {
        for (int i = 0; i < 3000; i++) {
            if (i % 32 == 30 && i % 58 == 44) {
                System.out.println(i);
            }
        }
    }

    public static boolean findEvenNumbers(int number) {
        return number % 2 == 0;
    }

    public static boolean findUnevenNumbers(int number) {
        return !findEvenNumbers(number);
    }

}
