package lesson13_1012;

public class HWanalys {
    public static void main(String[] args) {
         /* 1. Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is
        true, b does not need to be greater than a.*/
        System.out.println(inOrder(1, 1, 4, false)); //true
        System.out.println(inOrder(1, 2, 1, false));//false
        System.out.println(inOrder(1, 1, 2, true)); //true
        System.out.println(inOrder(5, 1, 2, true)); //true
        System.out.println(inOrder(5, 5, 5, false));//false
        System.out.println(inOrder(5, 3, 5, true));//true

        System.out.println("______");

        /* 2. Given three ints, a b c, return true if one of them is 10 or more less than one of the others.*/
        System.out.println(lessBy10(1, 7, 11)); //→true
        System.out.println(lessBy10(1, 7, 10)); //→false
        System.out.println(lessBy10(11, 1, 7)); //→true
        System.out.println(lessBy10(11, 11, 221));// →true

        System.out.println(lessBy10Two(1, 7, 11)); //→true
        System.out.println(lessBy10Two(1, 7, 10)); //→false
        System.out.println(lessBy10Two(11, 1, 7)); //→true
        System.out.println(lessBy10Two(11, 11, 221));// →true


        System.out.println("______");

        /* 3. Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back.
          The string will be non-empty.*/
        System.out.println(theEnd("Hello", true)); //→"H"
        System.out.println(theEnd("Hello", false)); //→"o"
        System.out.println(theEnd("oh", true));// →"o"


        // 4. Given a string, return true if it ends in "ly".
        System.out.println(endsLy("oddly")); //→ true
        System.out.println(endsLy("y")); //→ false
        System.out.println(endsLy("oddy")); //→ false
        System.out.println(endsLy("ly")); //→ false

        /* 5. Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
        The string length will be at least 3.*/

        System.out.println(middleThree("Candy"));// →"and"
        System.out.println(middleThree("and"));// →"and"
        System.out.println(middleThree("solving"));// →"lvi"
        System.out.println(middleThree("000111000"));// →"111"
        //System.out.println(middleThree("k"));// →"сообщение"
        // System.out.println(middleThree("ok"));// →"сообщение"
        System.out.println(middleThree("Василий"));// →"сообщение"


    }

    private static String middleThree(String input) {
     int middle = input.length()/2;
     String output = input.substring(middle-1, middle+2);
        return output;
    }

    private static boolean endsLy(String input) {
        return input.endsWith("ly");
    }

    private static String theEnd(String str, boolean front) {
        String result = str.substring(0, 1);
        if (!front) {
            result = str.substring((str.length() - 1));
        }
        return result;

    }

    private static boolean lessBy10(int a, int b, int c) {
        if (a <= b - 10 || a <= c - 10) {
            return true;
        } else if (b <= a - 10 || b <= c - 10) {
            return true;
        } else if (c <= a - 10 || c <= b - 10) {
            return true;
        }
        return false;
    }

    private static boolean lessBy10Two(int a, int b, int c) {
        return Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(c - a) >= 10; //Более правильно, считает модуль
    }

    private static boolean inOrder(int a, int b, int c, boolean bOk) {
        return (b > a && c > b && !bOk || c > b && bOk);
    }
}
