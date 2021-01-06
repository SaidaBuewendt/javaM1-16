package lesson02;

public class HomeWork2411 {
    public static void main(String[] args) {
        //Дан куб со стороной 10
        //Найдите площадь и периметр
        //int=10;
        findCubePerimeter();
        findCubeSquare();
        square();
        rectangle();
        exercise01();//разбор ДЗ в классе

    }

    public static void findCubePerimeter() {
        int a = 10; //Переменная задается в каждом методе, область ее видимости в рамках скобок {}
        int perimeter = 12 * a;
        System.out.println("Периметр куба:" + perimeter);
    }

    public static void findCubeSquare() {
        int a = 10; //Переменная задается в каждом методе, область ее видимости в рамках скобок {}
        int quadratSquare = a * a;
        int cubeSquare = 6 * quadratSquare;
        System.out.println("Площадь куба:" + cubeSquare);
    }

    public static void square() {
        int b = 3;
        int squarePerimeter = b * 4;
        int squareArea = b * b;
        System.out.println("Периметр квадрата:" + squarePerimeter);
        System.out.println("Площадь квадрата:" + squareArea);
    }

    public static void rectangle() {
        int a = 5;
        int b = 10;
        int rectanglePerimeter = (a + b) * 2;
        int rectangleSquare = a * b;
        System.out.println("Периметр прямоугольника:" + rectanglePerimeter);
        System.out.println("Площадь прямоугольника:" + rectangleSquare);
    }

    public static void exercise01() {
        int a, b, square, perimeter; //Разбор ДЗ в классе: Можно задать переменные одной строкой
        a = 5;
        b = 10;
        perimeter = (a + b) * 2;
        square = a * b;
        System.out.println("Периметр:" + perimeter); //CTRL+D - дублирование строки
        System.out.println("Площадь:" + square);
    }
}

