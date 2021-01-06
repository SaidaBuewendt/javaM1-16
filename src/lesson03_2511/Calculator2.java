package lesson03_2511;

public class Calculator2 {
    public static void main(String[] args) {
       int result = addition3(5,78);//
        System.out.println(result);//вариант 1
        System.out.println(addition3(5,78)); //вариант2

    }

    public static int addition3(int a, int b) {
        int c = a + b;
        return c;
    }
    public static int addition4(int a, int b) {
        return a + b;
    }
}
