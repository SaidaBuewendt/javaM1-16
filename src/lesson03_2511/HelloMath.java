package lesson03_2511;

public class HelloMath {
    public static void main(String[] args) {
        expMath();
        findCircleSquare();

    }
    public static void expMath() {

        double d1 = 1.0;
        double d2 = 289347329.0;
        double d3 = d1 / d2;
        System.out.println(d3);
    }
    public static void findCircleSquare(){
        int radius =10;
        final double PI=3.14;
        double javaPi = Math.PI;
        //final int MAX_TEMP = 16; Решено, что все постонные переменные будут писать ЗАГЛАВНЫМИ
        double squareCircle = PI*radius*radius;
        System.out.println("Square of circle =" + squareCircle);
        System.out.println("Число Пи из Math-бибилиотеки Java:" + javaPi);
    }

}