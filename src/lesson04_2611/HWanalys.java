package lesson04_2611;

public class HWanalys {
    public static void main(String[] args) {
        //1. Написать программу для вычисления площади круга
        circleArea();
        System.out.println(circleArea2(15));
        //2. Найти длину окружности
        System.out.println(giveMeCircleLength(45.5));
        System.out.println(giveMeCircleLength(15));
        System.out.println(giveMeCircleLength(7.8));
        //3. Написать формулу вычисления стоимости Евро, если курс Евро к Доллару 1,1.
        System.out.println("При переданных " + 1000 + " долларов" + " клиент получит " + currencyConverter(1000));
        //5. Найти, во сколько раз площадь Москвы больше площади Берлина.
        //Можно было запустить метод из Упр.4

        //6. Если клиент положил в банк 1000€ под 3,5%, какая сумма будет его ждать через семь лет?
        System.out.println("Клиент через 7 лет получит " + countMoneyBankApp(1000, 7) + "   Евро");;


    }

    public static void circleArea() {
        double pi = 3.14;
        double radius = 15.5;
        double area = pi * radius * radius;
        System.out.println(area);
    }

    public static double circleArea2(int radius) { //тип данных на вход и выход может быть разный
        double pi = 3.14;
        return pi * radius * radius; //можно  сразу в return писать формулу, рехультат которой нужно получить на выходе
    }

    public static double giveMeCircleLength(double radius) {
        double pi = 3.14;
        double length = 2 * pi * radius;
        return length;
    }

    public static double currencyConverter(double usd) {
        double rate = 1.1;
        double eur = usd / rate;
        return eur;
    }

    public static double countMoneyBankApp(double money, int years) {
        double interest = 3.5;
        double output;
        output = money + (money / 100) * interest * years;
        return output;
    }
}