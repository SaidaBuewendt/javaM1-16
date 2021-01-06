package lesson14_1112;

public class HWanalys {
    public static void main(String[] args) {
         /*You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2, the result is 10.
        Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are different from a, the result is 1.
        Otherwise the result is 0.*/
        System.out.println(redTicket(2, 2, 2));// →10
        System.out.println(redTicket(2, 2, 1));// →0
        System.out.println(redTicket(0, 0, 0));// →5
        System.out.println(redTicket(2, 1, 1));// →1

        /*Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If
        either string is length 0, use '@' for its missing char.*/
        System.out.println(lastChars("last", "chars")); //→"ls"
        System.out.println(lastChars("yo", "java")); // →"ya"
        System.out.println(lastChars("hi", ""));// →"h@"
        System.out.println(lastChars("", ""));// →"@@"

        /*Окна и двери
        В старых советских хрущёвках города № решили поменять деревянные окна и двери на пластиковые.
        Выяснилось, что все двери в хрущёвках одинакового размера 2м*90см, а окна разные, но в каждой квартире могут быть только одинаковые окна.
        Стоимость переделки окон рассчитывается из стоимости стекла - 100€ за квадратный метр и стоимости косяка - погонный метр 100€.
        Стоимость дверей рассчитывается исходя из стоимости косяка (как и у окна) и стоимости самой двери 120€ за квадратный метр.
        Напишите программу, которая поможет стройтресту №12 правильно выставлять счета.*/
        double finalPrise = countCost(8, 4, 180, 175);
        System.out.println("Итого: " + finalPrise);
    }

    private static double countCost(int doors, int windows, double height, double width) {
        return doorsPrise(doors) + windowsPrise(windows, height, width);
    }

    private static double windowsPrise(int windows, double height, double width) {
        double meterHeight = height / 100;
        double meterWidth = width / 100;
        double framePrise = 100;
        double glassPrise = 100;
        double perimeter = (meterHeight+meterWidth)*2;
        double area = meterHeight*meterWidth;
        return (perimeter*framePrise+area*glassPrise)*windows ;
    }

    private static double doorsPrise(int doors) {
        double doorsMeterPrise = 120.0;
        double framePrice = 100.0;
        double a = 2.0;
        double b = 0.9;
        double perimeter = (a + b) * 2;
        double area = a * b;
        return (perimeter * framePrice + area * doorsMeterPrise) * doors;
    }


    private static String lastChars(String a, String b) {
        if (a.length() == 0) {
            a = "@";
        }
        if (b.length() == 0) {
            b = "@";
        }
        String firstLetterfirstWord = a.substring(0, 1);
        String lastLetterlastWord = b.substring(b.length() - 1);
        return firstLetterfirstWord + lastLetterlastWord;
    }


    private static int redTicket(int a, int b, int c) {
        if (a == b && b == c && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        } else {
            return 0;
        }
    }
}