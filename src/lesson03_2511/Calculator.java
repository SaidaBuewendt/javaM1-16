package lesson03_2511;

public class Calculator {
    public static void main(String[] args) {
        additionOne();
        additionTwo(5,8);
        additionTwo(130,150);
        additionTwo(25,10);
        int x=100;
        int y=200;
        additionTwo(x,y);//не подтягивает значение переменных, т.к. они уже указаны в Main
        int test1=45;
        test (test1, 56);

    }

    public static void additionOne() {
        int a = 3;
        int b = 5;
        int mySum = a + b;
        System.out.println(mySum);
    }

    public static void additionTwo(int weigth, int height) {
        int c = height + weigth;
        System.out.println(c);
    }

    public static void test(double a, double b){}
}
