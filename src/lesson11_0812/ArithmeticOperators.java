package lesson11_0812;

public class ArithmeticOperators {
    public static void main(String[] args) {
        introOne();
        introTwo();
    }

    private static void introTwo() {
        // 0000 1010;  =10
        // 0001 0010;  =18
        int a = 10;
        int b = 18;
        int c = a & b;
        System.out.println(c);
        c = a | b;  //см таблицу истинности
        System.out.println(c);
        c = a ^ b;  //см таблицу истинности
        System.out.println(c);
    }

    private static void introOne() {
        int a = 5;
        a = a + 1; //все три действия идентичны
        a++; //все три действия идентичны
        a += 1; //все три действия идентичны
        System.out.println(a);
        int b = 4;
        a *= b;
        System.out.println(a);
        a %= b;
        System.out.println(a);
    }

}
