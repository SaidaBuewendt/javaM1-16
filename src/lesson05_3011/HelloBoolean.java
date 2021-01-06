package lesson05_3011;

public class HelloBoolean {
    public static void main(String[] args) {
        booleanIntro();
        magicGame();
            }

    public static void booleanIntro() {
        boolean a = true;
        boolean b = false;
        //boolean c = 1; - не может быть, только True or False
        boolean c = a && b; //AND
        System.out.println(c);
        System.out.println(a || b); //OR
        System.out.println(!a); //NOT отрицание НЕ
        boolean d = !a;
        boolean f = a ^ b; //XOR
        System.out.println(d);
        System.out.println(f);
    }

    public static void magicGame() {
        int a = 5;
        int b = 10;
        boolean c = a > b;
        System.out.println(c);
        System.out.println(a <= b);
        System.out.println(a >= b); //знака "=>" не сущесвтует
    }

    public static void exercise() {
    }
}
