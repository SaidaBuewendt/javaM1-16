package lesson27_1201;

public class HomeWork1201 {
    public static void main(String[] args) {
        //Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
        System.out.println(blackjack(19, 21));// → 21
        System.out.println(blackjack(21, 19));// → 21
        System.out.println(blackjack(19, 22));// → 19
        System.out.println(blackjack(22, 22));// → 0
        System.out.println(blackjack(20, 20));// → 20
        System.out.println("________________");

        //Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not
        //count towards the sum.
        System.out.println(loneSum(1, 2, 3));// → 6
        System.out.println(loneSum(3, 2, 3));// → 2
        System.out.println(loneSum(3, 3, 3));// → 0
        System.out.println("________________");

        //Return a version of the given string, where for every star () in the string the star and the chars immediately to its left and right
        //are gone. So "abcd" yields "ad" and "ab**cd" also yields "ad".
        System.out.println(starOut("ab*cd"));// →"ad"
        System.out.println(starOut("ab**cd"));// →"ad"
        System.out.println(starOut("sm*eilly"));// →"silly"
        System.out.println(starOut("sm***eilly"));// →"silly"
        System.out.println("________________");

        //Return the number of times that the string "hi" appears anywhere in the given string.
        System.out.println(countHi("abc hi ho")); //→ 1
        System.out.println(countHi("ABChi hi"));// → 2
        System.out.println(countHi("hihi"));//→ 2
        System.out.println("________________");
    }

    private static int countHi(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'h' && input.charAt(i + 1) == 'i') {
                count++;
            }
        }
        return count;
    }

    private static String starOut(String input) {
        return input.substring(0, input.indexOf("*") - 1) + input.substring(input.lastIndexOf("*") + 2);
    }

    private static int loneSum(int a, int b, int c) {
        int result = 0;
        if (a != b && a != c) {
            result = a;
        }
        if (b != a && b != c) {
            result += b;
        }
        if (c != a && c != b) {
            result += c;
        }
        return result;
    }

    private static int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        } else if (a > 21) {
            return b;
        } else if (b > 21) {
            return a;
        } else if (a > b) {
            return a;
        }
        return b;
    }
}
