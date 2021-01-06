package lesson16_1512;

public class CoffeeMachine {
    public static void hotWater(int ml) {
        System.out.printf("Added %d ml of water \n", ml);
    }

    public static void latte() {
        System.out.println("Латте готов");
        milk(100);
        hotWater(20);
        coffee(40);
    }

    public static void cappuccino() {
        System.out.println("Капучино готов");
        milk(30);
        hotWater(20);
        coffee(40);

    }


    public static void americano() {
        System.out.println("Американо готов");
        hotWater(100);
        coffee(20);
        System.out.println("_____");
    }

    private static void coffee(int mg) {
        System.out.printf("Added %d ml of coffee \n", mg);
    }

    private static void milk(int ml) {
        System.out.printf("Added %d ml of coffee \n", ml);
    }
}
