package HomeWorkWeichnachten;

import javax.print.attribute.standard.PresentationDirection;
import java.sql.PreparedStatement;

public class ExerciseString {
    public static void main(String[] args) {
//        15. Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 
//        The string length will be at least 2.
        System.out.println(left2("Hello"));// → "lloHe"
        System.out.println(left2("java"));//→ "vaja"
        System.out.println(left2("Hi"));//→ "Hi"
        System.out.println("___________________");

//        16. Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
        withoutEnd2("Hello"); //→ "ell"
        withoutEnd2("abc");// → "b"
        withoutEnd2("ab");// → ""
        withoutEnd2("");// → ""
        System.out.println("___________________");

//        17. Given a string and an int n, return a string made of the first and last n chars from the string. 
//        The string length will be at least n.
        System.out.println(nTwice("Hello", 2)); //→ "Helo"
        System.out.println(nTwice("Chocolate", 3));//→ "Choate"
        System.out.println(nTwice("Chocolate", 1));//→ "Ce"
        System.out.println("___________________");

//        18. Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not
//        "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
        System.out.println(hasBad("badxx")); //→true
        System.out.println(hasBad("xbadxx")); //→true
        System.out.println(hasBad("xxbadxx")); //→false
        System.out.println(hasBad("xxxxbadxx")); //→false
        System.out.println("___________________");

//        19. Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation
//        creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
        conCat("abc", "cat");// → "abcat"
        conCat("dog", "cat");// → "dogcat"
        conCat("abc", "");// → "abc"
        conCat("abcde", "efghig");// → "abcdefghig "


    }

    private static void conCat(String a, String b) {
        if (a.length() == 0) {
            System.out.println(b);
        } else if (b.length() == 0) {
            System.out.println(a);
        } else if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
            System.out.println(a + b.substring(1));
        } else {
            System.out.println(a + b);
        }
    }

    private static boolean hasBad(String word) {
        String result = word.substring(1);
        if (word.startsWith("bad") || result.startsWith("bad")) {
            return true;
        } else {
            return false;
        }

    }

    private static String nTwice(String word, int n) {
        return word.substring(0, n) + word.substring(word.length() - n);
    }

    private static void withoutEnd2(String word) {
        if (word.length() <= 2) {
            System.out.println(" ");
        } else {
            System.out.println(word.substring(1, word.length() - 1));
        }
    }

    private static String left2(String word) {
        return word.substring(2) + word.substring(0, 2);
    }
}
