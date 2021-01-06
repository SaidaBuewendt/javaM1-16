package lesson18_1712;

public class ExerciseString {
    public static void main(String[] args) {
//        2. Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for
//        the 'd', so "cope" and "cooe" count.
        System.out.println(countCode("aaacodebbb"));// 1
        System.out.println(countCode("codexxcode"));// → 2
        System.out.println(countCode("cozexxcope"));//  → 2

 /*       10. Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If
        there are fewer than 2 chars, use whatever is there.*/
        System.out.println(extraFront("Hello"));// → "HeHeHe"
        System.out.println(extraFront("ab")); //"ababab"
        System.out.println(extraFront("H"));  //"HHH"

        /*11. Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string,
        except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty
        string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.*/
        System.out.println(startWord("hippo", "hi")); //→"hi"
        System.out.println(startWord("hippo", "xip"));// →"hip"
        System.out.println(startWord("hippo", "i")); //→"h"
        System.out.println(startWord("hippo", "love"));// →"h"


    }

    private static String startWord(String str, String word) {
        if (str.startsWith(word)) {
            return str.substring(0, word.length());
        } else if (str.substring(1).startsWith(word.substring(1))) {
            return str.substring(0, word.length());
        } else {
            return "";
        }

    }

    private static String extraFront(String word) {
        if (word.length() >= 2) {
            return word.substring(0, 2) + word.substring(0, 2) + word.substring(0, 2);
        } else if (word.length() == 1) {
            return word.substring(0, 1) + word.substring(0, 1) + word.substring(0, 1);
        } else {
            return "";
        }
    }

    private static int countCode(String input) {
        //charAt
        //Если code равен буквам с индексом 0,1,2,3 то тогда возвращаем 1
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'c'
                    && input.charAt(i + 1) == 'o'
                    //    && input.charAt(2) == 'd'){
                    && input.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return 0;
    }
}