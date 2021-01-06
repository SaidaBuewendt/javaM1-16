package lesson03_2511;

public class HomeWork2511 {
    public static void main(String[] args) {
        //1. Написать программу для вычисления площади круга
        System.out.println("Площадь круга: " + findCircleArea(5));
        //2. Найти длину окружности
        System.out.println("Окружность круга: " + findСircumference(7));
        //3. Написать формулу вычисления стоимости Евро, если курс Евро к Доллару 1,1.
        System.out.println("Стомость Евро: " + findCurrency(100));
        //4. Найти соотношение площади Беларуси к площади Украины
        System.out.println("Отношение площади Беларуси к площади Украины: " + findRelation(207600, 603628));
        //5. Найти, во сколько раз площадь Москвы больше площади Берлина.
        //Можно было запустить метод из Упр.4
        System.out.println("Площадь Москвы в " + findRelationMB(2561, 891) + " раз больше площади Берлина");
        //6. Если клиент положил в банк 1000€ под 3,5%, какая сумма будет его ждать через семь лет?;
        System.out.println("Выплата по депозиту через 7 лет: " + findDepositSum(1000, 3.5));

    }

    public static double findCircleArea(double radius) {
        final double PI = 3.14;
        double circleArea = PI * (radius * radius);
        return circleArea;
    }

    public static double findСircumference(double radius) {
        double PI = Math.PI;
        double circumference = 2 * PI * radius;
        return circumference;
    }

    public static double findCurrency(double usd) {
        double exRateEURToUSD = 1.1; //usd/eur
        double eur = usd / exRateEURToUSD;
        return eur;
    }

    public static double findRelation(double area1, double area2) {
        double relation = area1 / area2;
        return relation;
    }

    public static double findRelationMB(double Moscow, double Berlin) {
        double relation = Moscow / Berlin;
        return relation;
    }

    public static double findDepositSum(double deposit, double procent) {
        double depositSum1year = (deposit + deposit * procent / 100);
        double depositSum2year = depositSum1year + depositSum1year * procent / 100;
        double depositSum3year = depositSum2year + depositSum2year * procent / 100;
        double depositSum4year = depositSum3year + depositSum3year * procent / 100;
        double depositSum5year = depositSum4year + depositSum4year * procent / 100;
        double depositSum6year = depositSum5year + depositSum5year * procent / 100;
        double depositSum7year = depositSum6year + depositSum6year * procent / 100;
        return depositSum7year;
    }

}

