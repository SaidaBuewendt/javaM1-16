package lesson16_1512;

public class CoffeVendingStarter {
    public static void main(String[] args) {
        myChoice(1);
    }

    private static void myChoice(int customerChoice) {
        switch (customerChoice) {
            case 3:
                CoffeeMachine.latte();
                break;
            case 1:
                CoffeeMachine.americano();
                break;
            case 2:
                CoffeeMachine.cappuccino();
                break;
            default:
                break;
            case 4:
                CoffeeMachine.hotWater(100); //не очень верно что тут передаем мл, нужно было сдлетаь отдельный метод для Чая/Кипятка
                break;
        }
    }
}
