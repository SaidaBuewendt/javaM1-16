package HomeWorkWeichnachten;

public class HomeWork {
    public static void main(String[] args) {
//        Дано два целых положительных числа. Реализовать метод, который для каждого числа от a до b печатает строку вида “23 рубля”.
//        Пример: printSumInRub(1,5) ->
//
//        1 рубль
//        2 рубля
//        3 рубля
//        4 рубля
//        5 рублей
        printSumInRub(1, 40);

    }

    static void printSumInRub(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            if (i % 10 == 1 && i != 11) {
                System.out.println(i + " рубль");
            } else if (i >= 10 && i <= 20) {
                System.out.println(i + " рублей");
            } else if (i % 10 == 2 || i % 10 == 3 || i % 10 == 4) {
                System.out.println(i + " рубля");
            } else {
                System.out.println(i + " рублей");
            }
        }
    }
}


