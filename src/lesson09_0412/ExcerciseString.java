package lesson09_0412;

public class ExcerciseString {
    public static void main(String[] args) {
        //4. Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
        System.out.println(nonStart("Hello", "There")); // → "ellohere"
        System.out.println(nonStart("java", "code")); // → "avaode"
        System.out.println(nonStart("shotl", "java")); // →"hotlava"
        // System.out.println(nonStart("Telran", "")); //error, тк пытаемся взять символ, а его нет

        System.out.println(theEnd("Hello", true)); //H
        System.out.println(theEnd("Hello", false));//o
        System.out.println(theEnd("oh", true));//o

    }

    private static String theEnd(String word, boolean b) {
        //Если Б = тру, то вернуть первую букву, иначе вернуть последнюю букву
        //if (b == true){
        String output = "";
        if (b) {
           // return word.substring(0,1);
            output = word.substring(0,1);
        } else {
            //return word.substring(word.length() - 1);
            output = word.substring(word.length()-1);
        }
        return output;
    }

    public static String nonStart(String str1, String str2) {
        return str1.substring(1) + str2.substring(1);
    }
}