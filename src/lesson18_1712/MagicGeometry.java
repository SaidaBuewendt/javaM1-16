package lesson18_1712;

public class MagicGeometry {

/*    Школа приняла на работу молодую учительницу геометрии. И первым делом она решила привести кабинет точных наук в
    порядок. В подвале школы были найдены:
    точная копия спутника земли ПС-1. Диаметр сферы 58см.
    жестяной куб со стороной 40см.
    правильная четырёхугольная пирамида "Хеопса" со стороной основания 20см и боковыми рёбрами 30см
    и чёрный ящик с размерами 80см * 30см * 20см.
    Всё было в достаточно запущенном состоянии и новая учительница решила всё покрасить в красный цвет.
    Сколько денег на покраску нужно потратить если на один квадратный метр надо 560мл краски, а балончик с аэрозольной
    краской 400мл стоит 17€?*/

    public static void main(String[] args) {
        double money = amountOfSprayCan()*17;
        System.out.println(money + "Euro");
    }

    private static double amountOfSprayCan() {
        double result = colorAmount()/400;
        //result = Math.floor(result); Округление вниз
        result = Math.ceil(result); //Округление вверх
        System.out.println("Quantity of bottles " + result);
        return result;
    }

    public static double colorAmount() {
        double result = giveMeArea()*560/10000;
        return result;
    }

    private static double giveMeArea() {
        return sphereArea() + cubeArea() + pyramidArea() + boxArea();
    }

    private static double boxArea() {
        int a = 80;
        int b = 30;
        int c = 20;
        return 2 * a * b + 2 * b * c + 2 * a * c;
    }

    private static double pyramidArea() {
        int a = 20;
        int b = 30;
        return a * a + 2 * a * Math.sqrt(b * b - (a * a) / 4);
    }

    private static double cubeArea() {
        int a = 40;
        return a * a * 6;
    }

    private static double sphereArea() {
        double radius = 58 / 2;
        double result = Math.PI * radius * radius;
        return result;
    }
}
