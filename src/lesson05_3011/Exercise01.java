package lesson05_3011;

public class Exercise01 {
    public static void main(String[] args) {
        System.out.println(smartDepositBox(true, false)); // true
        System.out.println(smartDepositBox(false, true)); //true
        System.out.println(smartDepositBox(false, false)); //false
        split();
        System.out.println(smartDepositBoxVersionTwo(true, false));
        System.out.println(smartDepositBoxVersionTwo(false, true));
        System.out.println(smartDepositBoxVersionTwo(false, false));
        System.out.println(smartDepositBoxVersionTwo(true, true));
        split();
        System.out.println(verySmartDepositBoxVersionThree(true, false, true));
        System.out.println(verySmartDepositBoxVersionThree(false, true, true));
        System.out.println(verySmartDepositBoxVersionThree(false, false, true));
        System.out.println(verySmartDepositBoxVersionThree(true, true, true));
        System.out.println(verySmartDepositBoxVersionThree(true, false, false));
        System.out.println(verySmartDepositBoxVersionThree(false, true, false));
        System.out.println(verySmartDepositBoxVersionThree(false, false, false));
        System.out.println(verySmartDepositBoxVersionThree(true, true, false));
        split();
        System.out.println  (verySmartDepositBoxVersionThreeSecond(true, false, true));
    }

    public static boolean smartDepositBox(boolean mama, boolean papa) {
        return mama || papa;
    }

    public static void split() {
        System.out.println("______________________________");
    }

    public static boolean smartDepositBoxVersionTwo(boolean mama, boolean papa) {
        return mama && papa;
    }

    public static boolean verySmartDepositBoxVersionThree(boolean mama, boolean papa, boolean oma) {
        //boolean parents = mama&&papa;
        //return oma||parents;
        return mama && papa || oma;
    }

    public static boolean verySmartDepositBoxVersionThreeSecond(boolean mama, boolean papa, boolean oma) {
        return smartDepositBox(mama, papa) || oma;
    }
}
