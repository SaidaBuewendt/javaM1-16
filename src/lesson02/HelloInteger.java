package lesson02;

public class HelloInteger {

    public static void main(String[] args) {
        helloInt();
        helloLong();
    }


    public static void helloLong() {
        System.out.println("А здесь мы рассмотрим -  Long");
        long al = 1234567;
        long bl = 123456789011L;
        long c = 123_456_789L; //java игнорирует нижнее подчеркивание в цифрах
        long sum = al + bl + c;
        System.out.println(sum);
    }

    public static void helloInt() {
        int a = 5;
        int b = 3;
        //int LeftButtonUserLogin;
        int c = a + b;
        //definition
        //!!!declaration!!!
        //initialisation
        int x; //задекларировали и продефинировали X
        x = 7; //инициализировали Х
        //int d, f, g, h, j, k, l; //задекларировали все
        //d = x; //Инициировали D
        System.out.println(a);
        System.out.println(c);
        System.out.println("Это мое A" + a);
        System.out.println("А это мое C" + c);
    }

}