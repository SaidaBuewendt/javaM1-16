package lesson27_1201;

public class StringExcercises {
    public static void main(String[] args) {
        //4. Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that
        //n is between 0 and the length of the string, inclusive.
        System.out.println(repeatEnd("Hello", 3)); //→ "llollollo"
        System.out.println(repeatEnd("Hello", 2));// → "lolo"
        System.out.println(repeatEnd("Hello", 1));// → "o"
        System.out.println("________________");

        //5. Given a string, consider the prefix string made of the first N chars of the string.
        // Does that prefix string appear somewhere
        //else in the string? Assume that the string is not empty and that N is in the range 1..str.length().
        System.out.println(prefixAgain("abXYabc", 1));//→ true
        System.out.println(prefixAgain("abXYabc", 2));//→ true
        System.out.println(prefixAgain("abXYabc", 3));// → false
        System.out.println("________________");

        //6. Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the
        //same.
        System.out.println(sameStarChar("xy*yzz"));// → true
        System.out.println(sameStarChar("xy*zzz"));// → false
        System.out.println(sameStarChar("*xa*az"));// → true

    }

    private static boolean sameStarChar(String input) {
        char star = '*';
        for (int i = 1; i < input.length() - 1; i++) {
            if (star == input.charAt(i) && input.charAt(i - 1) == input.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    private static boolean prefixAgain(String word, int n) {
        String prefix = word.substring(0, n);
        //return word.indexOf(prefix, n)!=1;
        return word.substring(n).contains(prefix);
/*        for (int j = n; j < word.length() - n; j++) {
            if (word.substring(0, n).equals(word.substring(j, j + n))) {
                return true;
            }
        } return false;*/
    }

    private static String repeatEnd(String word, int n) {
        String newWord = "";
        for (int i = 0; i < n; i++) {
            newWord += word.substring(word.length() - n);
        }
        return newWord;
/*        for (int i = word.length()-1; i >word.length()-n ; i++) {
            newWord+=word.substring()
        }*/
    }
}
