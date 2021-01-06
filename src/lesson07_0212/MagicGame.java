package lesson07_0212;

public class MagicGame {

    public static void main(String[] args) {
        variant1();
        variant2();
        variant3();
    }

    public static void variant1() {
        //swap
        int a = 5;
        int b = 8;
        //поменять a и b местами:
        int temp = a; //ввели временную переменную чтобы сохранить значение B
        a = b;
        b = temp;
    }

    public static void variant2() {
        int a = 5;
        int b = 8;
        a = a + b;//13
        b = a - b;//13-8
        a = a - b;//
        System.out.println(a);
        System.out.println(b);
    }

    public static void variant3() {
        int a = 5;
        int b = 8;
        a = a + b - (b - a);
        System.out.println(a);
        System.out.println(a);

    }


}
