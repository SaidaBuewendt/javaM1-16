package lesson19_1812;

public class HWanalys {
    public static void main(String[] args) {
/*        Посчитайте стоимость дома из бруса, если:

        дом размерами 11*12 метров, и высотой 3 метра,
                размеры используемого бруса 20*20 см,
                цена елового бруса(200х200х6000 мм) за кубометр 250$ с доставкой.
                Дом делается примерно 2 недели тремя работниками и одним краном.
        Кран стоит 100€ в день.
                Бригадир у работников стоит 35$ в час. Плотники 25$ в час.
                Стоимость лака, которым надо потом покрасить внешние стены дома стоит 20 € за литр и одного литра хватает на 3
        квадратных метра.*/
        double cost = finalResult();
    }

    private static double finalResult() {
        double result = materialCost() + hardwareCost() + workerCost();
        return 0;
    }

    private static double workerCost() {
        return 0;
    }

    private static double hardwareCost() {
        return 0;
    }


    private static double materialCost() {
        double result = woodCost() + colorCost();
        return 0;
    }

    private static double colorCost() {
        return 0;
    }

    private static double woodCost() {
        return 0;
    }
}
