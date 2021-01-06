package lesson18_1712;

public class MyMagicRound {
    public static void main(String[] args) {
        roundIntro();
        System.out.println("___________");
        roundIntro2();
        System.out.println("___________");
        roundIntro3();
        System.out.println("___________");
        roundIntro4();
    }

    private static void roundIntro4() {
    }

    public static void roundIntro3() {
        double inputNumber = 3.141;
        int temp = (int) inputNumber;
        double temp2 = temp;
        //System.out.println(temp2);
        if (temp2 > inputNumber) {
            inputNumber = temp2 + 1;
        }
        System.out.println(inputNumber);
    }

    public static void roundIntro2() {
        double number = 3.141;
        System.out.println(Math.round(number));
        System.out.println(Math.floor(number));
        System.out.println(Math.ceil(number));
    }

    public static void roundIntro() {
        double pi = Math.PI;
        //3 цифры после запятой
        double temPi = pi * 1000;
        System.out.println(temPi);
        int magicInt = (int) temPi;
        System.out.println(magicInt);
        pi = magicInt / 1000;
    }

}

