package lesson03_2511;

public class HelloDouble {
    public static void main(String[] args) {
        helloFloat();
        helloInt();
        helloDouble();

    }

    public static void helloFloat() {
        float a = (float) 3.5;
        float b = 5.7F;
        float c = 5.6f;
        float d = a + b + c;
        System.out.println("a+b+c+d = " + d);
        int iiii = 45;
        float f = d + iiii;
        System.out.println("Посмотрим результат: " + f);
    }

    public static void helloInt() {
        int a = 9;
        int b = 5;
        int c = b / a;
        System.out.println("b/a:" + c);
        float f1 = 9;
        float f2 = 5;
        float f3 = f2 / f1;
        System.out.println("f2/f1: " + f3);
    }

    public static void helloDouble() {
        double d1 = 5.0; //если Double, то даже целое число инициализировать с ".0"
        double d2 = 7.4;
        double d3 = d1 / d2;
        System.out.println(d3);
        int var1 = 5;
        int var2 = 2;
        int var3 = var1 / var2;

        double var4 = 5.0;
        double var5 = 2.0;
        double var6 = var4 / var5;
        double var7 = var1 / var2;
        double var24 = var1 / var4;
        //int var25 = var1 / var4; //ошибка тк INT не может быть дробным
        int var25 = (int) (var1 / var4); //правильно
        System.out.println(var3);
        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var24);
        System.out.println(var25);
        System.out.println("Magic" +5.0/var2);//ожидаем 2.5 тк 5.0 (если бы было просто 5, то в результате было бы 2)
    }
}
