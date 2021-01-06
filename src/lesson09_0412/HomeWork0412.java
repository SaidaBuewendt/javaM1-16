package lesson09_0412;

public class HomeWork0412 {
    public static void main(String[] args) {
        /* Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod*/
        System.out.println(more20(20)); //false
        System.out.println(more20(21)); //true
        System.out.println(more20(22)); //true
        System.out.println(more20(42)); //true
        System.out.println(more20(153)); //false
        System.out.println(more20(-21)); //false

        System.out.println("______________");
        /* ***2
         Given a non-negative number “num”, return true if num is within 2 of a multiple of 10.
         Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.
         See also: Introduction to Mod */
        System.out.println(nearTen(12)); //true
        System.out.println(nearTen(17)); //false
        System.out.println(nearTen(19)); //true
        System.out.println(nearTen(42)); //true
        System.out.println(nearTen(57)); //false
        System.out.println(nearTen(10)); //true

    }


    public static boolean more20(int number) {
        int a = number % 20;
        return a > 0 && a <= 2;
    }

    public static boolean nearTen(int num) {
        int a = num % 10;
        return !(3 <= a && a < 8);
    }
}
