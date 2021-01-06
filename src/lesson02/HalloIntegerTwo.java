package lesson02;

public class HalloIntegerTwo {
    public static void main(String[] args) {
        helloInt();
        helloByte();
        helloShort();
    }

    public static void magicNumber() {
        int hexValue = 0x100;
        int binary = 0B10011001;
        int octal = 0757;
    }

    public static void helloByte() {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);//байт можно записать только таким образом, поэтому не используется
        byte d = 120;
        byte f = 10;
        byte e = (byte) (d + f);//будет неверно тк в данном типе данных макисмум 127
        System.out.println(e); //выводит -126 (сдвигается)

    }

    public static void helloShort() {
        short a = 12_345; //возможно прописывать числа с нижним подчеркивнием
        short b = 1234;
        short c = (short) (a + b);
    }

    public static void helloInt() {
        int a = 9;
        System.out.println("Ожидаю шесть" + a);
        int b = 5;
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a - b);


    }
}
