package lesson10_0712;

public class HWanalysModulo {
    public static void main(String[] args) {
        // Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod
        // Верни true, если данное неотрицательное число на 1 или 2 больше кратного 20.

        System.out.println(more20(20)); //false
        System.out.println(more20(21)); //true
        System.out.println(more20(22)); //true

        //Given a non-negative number “num”, return true if num is within 2 of a multiple of 10.
        // Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod

        System.out.println(nearTen(12));
        System.out.println(nearTen(17));
        System.out.println(nearTen(19));
    }

    public static boolean more20(int number) {
        //1. Дано
        //2. Найти
        //3. Решение
        int temp = number % 20;
        if (temp - 1 == 0 || temp - 2 == 0) {
            return true;
        } else
            return false;

        //int temp = number % 20;
        //retur temp ==1 || number % 20 == 2;
    }

    public static boolean nearTen(int num) {
        int temp = num % 10;
        return temp <=2 || temp >=8;
    }
}
