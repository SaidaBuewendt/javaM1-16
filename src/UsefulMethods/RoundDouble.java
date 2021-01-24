package UsefulMethods;

public class RoundDouble {
    public static void main(String[] args) {
        System.out.println(cutDecimalPlaces(17.875808404576144)); //НЕ ОКРУГЛЕНИЕ, просто обрезает

    }


    public static void roundIntro2() {
        double number = 3.141;
        System.out.println(Math.round(number));
        System.out.println(Math.floor(number));
        System.out.println(Math.ceil(number));
    }

    public static double cutDecimalPlaces(double number) {
        //double input = number ;
        //3 цифры после запятой
        double tempNumber = number * 100; //количество знаков после запятой
        //System.out.println(tempNumber);
        int magicInt = (int) tempNumber;
        //System.out.println(magicInt);
        double output = (double) magicInt / 100;//количество знаков после запятой
        return output;
    }

    private static double round(double input) {
        double output = 0.0;
        int coefficient = 100;
        double temp1 = input * coefficient;
        int temp2 = (int) temp1;
        output = temp2;
        output /=100;
        return output;
    }

}
