package lesson09_0412;

public class MyFibonacci {
    public static void main(String[] args) {
       /* Выведите на экран первые 11 членов последовательности Фибоначчи.
                первый и второй члены последовательности равны единицам
        а каждый следующий — сумме двух предыдущих
        То есть числа Фибоначчи - это 1 1 2 3 5 8 13 21 34 55 89 и т.д.*/
                lineFibonacci(11);
    }

    public static void lineFibonacci(int number) {
        int n0 = 0;
        int n1 = 1;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 0; i < number - 2; i++) { //-2 тк два ряда распечатали уже выше
            int nNext = n0 + n1;
            System.out.println(nNext + " ");
            n0 = n1;
            n1 = nNext;
        }

    }
}
