package lesson21_0401;

public class HWanalys {
    public static void main(String[] args) {
        printSuminRub(75, 95);
        printSuminRub(1, 5);
        printSuminRub(15, 23);

        System.out.println("_____________");

        myLovelyCharAt(4, "Василий");

        String hausmaster = "Василий";
        char[] magicArray = hausmaster.toCharArray();

    }

    private static void myCharPrint(char[] input) {
        System.out.println("[");
        for (char symbol : input) {
            System.out.println(symbol + " ");
        }
        System.out.println("]");
    }


    private static String myLovelyCharAt(int index, String word) {
        //найти букву под индексом
        return word.substring(index, index + 1);

    }

    private static void printSuminRub(int a, int b) {
        for (int i = a; i < b; i++) {
            System.out.println("Всего получено " + i + " " + formatRub(i));

        }
    }

    private static String formatRub(int rub) {
        String output = "";
        int reminder = rub % 10;
        if (rub > 10 && rub < 15) {
            output = "рублей";
        } else if (rub % 10 == 1) {
            output = "рубль";
        } else if (rub % 10 == 2 || rub % 10 == 3 || rub % 10 == 4) {
            output = "рубля";
        }
        return output;
    }
}
