package lesson19_1812;

public class HWanalys_MinCat {
    public static void main(String[] args) {
//        Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are
//        different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield
//        "loHi". The strings may be any length.*/

        System.out.println(minCat("Hello", "Hi")); // "loHi"
        System.out.println(minCat("Hello", "java")); //→ "ellojava"
        System.out.println(minCat("java", "Hello")); //→ "javaello"
        intReview();


//        Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is
//        'b'. The string may be any length. Harder than it looks.
        System.out.println(deFront("Hello"));//→ "llo"
        System.out.println(deFront("java"));// → "va"
        System.out.println(deFront("away"));// → "bay"
        System.out.println(deFront("fbay"));// → "abay"


//        Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the
//        string unchanged. This is a little harder than it looks.
        System.out.println(withoutX2("xHi"));// → "Hi"
        System.out.println(withoutX2("Hxi"));// → "Hi"
        System.out.println(withoutX2("Hi"));//→ "Hi"

    }

    private static String withoutX2(String input) {
        if (input.substring(0, 2).equals("xx")) {
            return input.substring(2);
        } else if (input.charAt(0) == 'x') {
            return input.substring(1);

        } else if (input.charAt(1) == 'x') {
            return input.substring(0, 1) + input.substring(2);
        } else {
            return input;
        }
    }

    private static String deFront(String input) {
        String output = input.substring(2);
        if (input.substring(1, 2).equals("b")) {
            output = "b" + output;
        }

        if (input.charAt(0) == 'a') {
            output = 'a' + output;
        }
        return output;
    }

    private static void intReview() {
        int a1 = 5;
        int b1 = 10;
        int minLengthString = Math.min(a1, b1);
//        if (a1 > b1) {
//            minLengthString = b1;
//        } else {
//            minLengthString = a1;
//        }
    }

    private static String minCat(String a, String b) {

        int minLengthString = Math.min(a.length(), b.length());
        String first = a.substring(a.length() - minLengthString);
        String second = b.substring(b.length() - minLengthString);
        return first + second;
    }
}

