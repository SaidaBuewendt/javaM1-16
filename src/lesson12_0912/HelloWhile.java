package lesson12_0912;

public class HelloWhile {
    public static void main(String[] args) {
        //в то время как - пока
        //while
        int a = 10;
        int b = 50;
        evenAB(a, b);
        helloDoWhile(10, 50);
    }

    private static void helloDoWhile(int x, int y) {
        x=55;
        do {
            System.out.println(x);
            x++;
        } while (x < y);
    }

    private static void evenAB(int a, int b) {
        while (a < b) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++; //Огранчение тк А каждый раз увеичивается на 1. Если убрать, то цикл бесконечный
        }
    }
}
