package lesson08_0312;

public class Arifmetika {
    public static void main(String[] args) {
        //синтаксический сахар
        int a = 5;
        a = a + 1;
        System.out.println(a);
        a++; //Охначает a=a+1 (++ - это увлечить на единицу)
        System.out.println(a);
        a += 1;
        System.out.println(a);
        //выше три идентичных записи
        myDecrementation();
        myMagicJava();
    }

    public static void myDecrementation() {
        int a = 10;
        a = a - 1;
        a -= 1;
        a--;
        System.out.println(a);
    }

    public static void myMagicJava() {
        int a = 10;
        a = a * 2;
        a *= 2;
        System.out.println(a);
    }
}
