package lesson10_0712;

public class HomeWorkExample {
    public static void main(String[] args) {
        //Напишите программу, которая проверяет год на високосность. Кратный четырём
        System.out.println(leapYear(2020)); //true
        System.out.println(leapYear(2021)); //false
        System.out.println(leapYear(1995)); //false

        //Напишите программу, которая находит числа кратные 11 между a и b.
        System.out.println(modulo11(12));
        System.out.println(modulo11(11));
        System.out.println(modulo11(10));
        checkModulo11AandB(10, 100);

     /*   You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the
        sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more
        than either bc or ac sums, the result is 5. Otherwise the result is 0.*/
        blueTicket(9, 1, 0);//→ 10
        blueTicket(9, 2, 0);//→ 0
        blueTicket(6, 1, 4);//→ 10

    }

    private static void checkModulo11AandB(int a, int b) {
        for (int i = a; i < b; i++) {
            if (modulo11(i)) {
                System.out.println(i);

            }
        }
    }

    private static boolean leapYear(int year) {
        return year % 4 == 0;
    }

    private static boolean modulo11(int number) {
        return number % 11 == 0;
    }

    private static int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab == 10 || bc == 10 || ac == 10) {
            return 10;
        } else if (ab == bc + 10 || ab - 10 == ac) {
            return 5;
        } else {
            return 0;
        }
    }
}
