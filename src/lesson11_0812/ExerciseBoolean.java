package lesson11_0812;

public class ExerciseBoolean {
    public static void main(String[] args) {

       /* You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the
        range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with
        0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes). With the exception that if either of
        you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).*/
        System.out.println(dateFashion(5, 10));// → 2
        System.out.println(dateFashion(5, 2));// → 0
        System.out.println(dateFashion(5, 5));// → 1

        /*2. Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden,
        so in that case just return 20*/
        System.out.println(sortaSum(3, 4));//→ 7
        System.out.println(sortaSum(9, 4)); //→ 20
        System.out.println(sortaSum(10, 11)); //→ 21

        /*13. Given a number n, return true if n is in the range 1..10, inclusive.
        Unless outsideMode is true, in which case return true if the
        number is less or equal to 1, or greater or equal to 10.*/
        System.out.println("Задача дает результат " + in1To10(5, false)); //→ true
        System.out.println("Задача дает результат " + in1To10(11, false));// → false
        System.out.println("Задача дает результат " + in1To10(11, true));// → true


   /*     14. Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see
        Introduction to Mod*/
        System.out.println(old35(3)); // →true
        System.out.println(old35(10)); // →true
        System.out.println(old35(15)); // →false

   /*     Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky.
           So if either value is a teen, just return 19.*/
        System.out.println(teenSum(3, 4));  //→ 7
        System.out.println(teenSum(10, 13));// → 19
        System.out.println(teenSum(13, 2)); // → 19

        /*  16. Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz".
        If both the "f" and "b" conditions are true, return "FizzBuzz".
        In all other cases, return the string unchanged. (See also: FizzBuzz Code)
        fizzString("fig") → "Fizz"
        fizzString("dib") → "Buzz"
        fizzString("fib") → "FizzBuzz"*/
    }

 //   private static String fizzString(String str) {}

    private static int teenSum(int a, int b) {
        //int sum = a + b;
        if ((a > 12 && a < 20) || (b > 12 && b < 20)) {
            return 19;
        } else {
            return a + b;
        }
    }

    private static boolean old35(int number) {
        return number % 3 == 0 ^ number % 5 == 0;
/*
        if (number % 3*5 == 0) {
            return false;
        } else if (number % 3 == 0) {
            return true;
        } else if (number % 5 == 0) {
            return true;
        } else {
            return false;
        }
*/

    }

    private static boolean in1To10(int n, boolean outsideMode) {
        /*if (n >= 1 && n <= 10) {
            return true;
        } else if (outsideMode && n <= 1 || n >= 10) {
            return true;
        } else {
            return false;
        }*/
        return (n <= 1 || n >= 10) && outsideMode || n >= 1 && n <= 10 && !outsideMode;


    }

    private static int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19) {
            return 20;
        } else {
            return a + b;
        }
    }

    private static int dateFashion(int you, int date) {
        if (you >= 8 && date > 2 || date >= 8 && you > 2) {
            return 2;
        } else if (you <= 2 || date <= 2) {
            return 0;
        } else {
            return 1;
        }
    }


}