package lesson16_1512;

public class HomeWork1512 {
    public static void main(String[] args) {

/*        We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5
                inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it
        looks and can be done without any loops. See also: Introduction to MakeBricks*/

        System.out.println(makeBricks(3, 1, 8));// → true
        System.out.println(makeBricks(3, 1, 9));// → false
        System.out.println(makeBricks(3, 2, 10));// → true
        System.out.println(makeBricks(0, 0, 10));// → false

        System.out.println("____________");

        //Given a string, return a string where for every char in the original, there are two chars.
        System.out.println(doubleChar("The")); // → "TThhee"
        System.out.println(doubleChar("AAbb")); //→ "AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));// → "HHii--TThheerree"

        System.out.println("____________");

    /*  Реализовать метод печатающий таблицу умножения для заданного числа Пример: multiplicationTable(3)->
        3x1=3
        3x2=6
        3x10=30*/
        multiplicationTable(3);
        System.out.println("____________");

     /*   Реализовать метод, который принимает целое положительное число. Метод должен выводить на экран все
        положительные числа, на которые заданное число делится без остатка и отображает количество найденных
        делителей. */

        printDivisors(32);
        System.out.println("____________");


    /*    Генератор паролей
        Давайте напишем генератор паролей. Методу передаётся длина пароля. И метод генерирует пароль используя латиницу, цифры и некоторые спецсимволы(на ваш выбор).
        Подсказка - использовать только те знания, которые были уже изучены.*/
        System.out.println(passGenerator(5));
        System.out.println(passGenerator(10));
        System.out.println(passGenerator(20));


    }

    private static String passGenerator(int length) {
        String pass = "";
        for (int i = 1; i <= length; i++) {
            int randMethod = (int) (Math.random() * 3);
            if (randMethod == 0) {
                pass += passDigits();
            } else if (randMethod == 1) {
                pass += passLetters();
            } else {
                pass += passSymbols();
            }
        }
        return pass;
    }

    private static String passLetters() {
        int min = 97;
        int max = 122;
        char letter = (char) (Math.random() * (max - min) + 1 + min);
        char result = letter;
        //System.out.print(result);
        return String.valueOf(result);

    }

    private static String passDigits() {
        int max = 9;
        int min = 0;
        int digit = (int) (Math.random() * (max - min) + 1 + min);
        //System.out.print(digit);
        return String.valueOf(digit);
    }

    private static String passSymbols() {
        String range = "(){}[]^|&%_-+*~;:,.<>=!";
        int min = 0;
        int max = range.length();
        char symbol = (char) (Math.random() * (max - min) + 1 + min);
        char result = (char) range.codePointAt(symbol);
        // System.out.print(result);
        return String.valueOf(result);

    }


    private static int printDivisors(int number) {
        int result = 0;
        int divisors = 0;
        for (int i = 1; i <= number; i++) {
            result = number / i;
            if (number % i == 0) {
                System.out.println(result);
                divisors++;
            }
        }
        System.out.println("Total divisors:" + divisors);
        return 0;
    }

    private static int multiplicationTable(int number) {
        int result = 1;
        for (int i = 1; i <= 10; i++) {
            result = number * i;
            System.out.println(number + "x" + i + "=" + result);
        }
        return result;

    }

    private static boolean makeBricks(int small, int big, int goal) {
        int s = 1;
        int b = 5;
        return s * small + b * big == goal;
    }

    private static String doubleChar(String word) {
        String result = "";
        for (int i = 0; i <= word.length() - 1; i++) {
            result += Character.toString(word.charAt(i)) + Character.toString(word.charAt(i));
        }
        return result;
    }
}
