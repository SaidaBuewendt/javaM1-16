package lesson12_0912;

import UsefulMethods.Color;

public class HomeWork0912 {
    public static void main(String[] args) {
        // System.out.println(Color.ANSI_BLUE + "TEXT" + Color.ANSI_RESET);

       /* 1. Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is
        true, b does not need to be greater than a.*/
        inOrder(1, 1, 4, false); // →true
        inOrder(1, 2, 1, false); // →false
        inOrder(1, 1, 2, true);  // →true
        inOrder(5, 1, 2, true);  // →true
        inOrder(5, 5, 5, false);  // →false
        inOrder(5, 3, 5, true);  // →true

        System.out.println("__________");

        /* 2. Given three ints, a b c, return true if one of them is 10 or more less than one of the others.*/
        lessBy10(1, 7, 11);// →true
        lessBy10(1, 7, 10);// →false
        lessBy10(11, 1, 7);// →true
        lessBy10(11, 11, 221);// →true

        System.out.println("__________");

       /* 3. Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back.
          The string will be non-empty.*/
        theEnd("Hello", true);// →"H"
        theEnd("Hello", false);// →"o"
        theEnd("oh", true);// →"o"

        System.out.println("__________");

        // 4. Given a string, return true if it ends in "ly".
        System.out.println(endsLy("oddly")); //→ true
        System.out.println(endsLy("y")); //→ false
        System.out.println(endsLy("oddy")); //→ false
        System.out.println(endsLy("ly")); //→ false

        System.out.println("__________");

 /*     5.  Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
          The string length will be at least 3.*/
        System.out.println(middleThree("Candy"));// →"and"
        System.out.println(middleThree("and"));// →"and"
        System.out.println(middleThree("solving"));// →"lvi"
        System.out.println(middleThree("000111000"));// →"111"
        System.out.println(middleThree("k"));// →"сообщение"
        System.out.println(middleThree("ok"));// →"сообщение"

    }

    private static String middleThree(String word) {
        int middle = word.length() / 2;
        String result = "";
        if (word.length() < 3) {
            System.out.print("Введите слово длинной больше 3 символов");
        } else {
            result = word.substring(middle - 1, middle + 2);
        }return result;
    }

    private static boolean endsLy(String str) {
        if (str.length() < 2 || str.length() % 2 == 0) {
            return false;
        } else if (str.substring((str.length() - 2)).equals("ly")) {
            return true;
        } else {
            return false;
        }
    }


    private static void theEnd(String string, boolean front) {
        if (front == true) {
            System.out.println(Color.ANSI_BLUE + string.charAt(0) + Color.ANSI_RESET);
        } else {
            System.out.println(Color.ANSI_YELLOW + string.charAt(string.length() - 1) + Color.ANSI_RESET);
        }

    }

    public static void inOrder(int a, int b, int c, boolean bOk) {
        if (b > a && c > b) {
            System.out.println(Color.ANSI_GREEN + "TRUE" + Color.ANSI_RESET);
        } else if (c > b && bOk == true) {   //можно не писать bOK==true, то bOk уже сам по себе true
            System.out.println(Color.ANSI_GREEN + "TRUE" + Color.ANSI_RESET);
        } else {
            System.out.println(Color.ANSI_RED + "FALSE" + Color.ANSI_RED);
        }
    }

    public static void lessBy10(int a, int b, int c) {
        int output = a - b;
        int output2 = b - c;
        int output3 = c - a;
        if (output >= 10 || output2 >= 10 || output3 >= 10) {
            System.out.println(Color.ANSI_CYAN + "TRUE" + Color.ANSI_RESET);
        } else {
            System.out.println(Color.ANSI_PURPLE + "FALSE" + Color.ANSI_RESET);
        }
    }
}




