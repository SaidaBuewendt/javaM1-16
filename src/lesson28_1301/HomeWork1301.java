package lesson28_1301;

import _UsefulMethods.PrintArrays;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.print.attribute.standard.PresentationDirection;
import java.beans.PropertyEditorSupport;

public class HomeWork1301 {
    public static void main(String[] args) {
        /*For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to
        20.
        Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10.
        Given 3 ints, a b c, return the sum of their rounded values.
        To avoid code repetition, write a separate helper "public int
        round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().*/

        System.out.println(roundSum(16, 17, 18));// → 60
        System.out.println(roundSum(12, 13, 14));// → 30
        System.out.println(roundSum(6, 4, 4));//→ 10
        System.out.println(roundSum(77, 14, 99));//→ 190
        System.out.println(roundSum(777, 333, 111));//→ 780+330+110=1220
        System.out.println("_______________");

/*        Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case 
            differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase
        version of a string.*/

        System.out.println(endOther("Hiabc", "abc"));// →true
        System.out.println(endOther("AbC", "HiaBc"));// →true
        System.out.println(endOther("abc", "abXabc"));// →true
        System.out.println(endOther("abc", "defg"));// →false
        System.out.println("_______________");

        //Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
        /// makePi() → [3, 1, 4]
        double digit = Math.PI;
        PrintArrays.printIntArrayForEach(makePi(digit));
    }

    private static int[] makePi(double digit) {
        int[] output = new int[3];
        int tempPi = (int) (digit * 100);
        String temp = String.valueOf(tempPi);
        int a = Integer.parseInt(temp.substring(0, 1));
        int b = Integer.parseInt(temp.substring(1, 2));
        int c = Integer.parseInt(temp.substring(2));
        output[0] = a;
        output[1] = b;
        output[2] = c;
        return output;
    }

    private static boolean endOther(String a, String b) {
        String resultA = a.toLowerCase();
        String resultB = b.toLowerCase();
        if (resultA.endsWith(resultB)) {
            return true;
        } else return resultB.endsWith(resultA);
    }

    private static int roundSum(int a, int b, int c) {
        int resultA = round10(a);
        int resultB = round10(b);
        int resultC = round10(c);
        return resultA + resultB + resultC;
    }

    public static int round10(int num) {
        double temp = (double) num / 10;
        int round = (int) Math.round(temp);
        return round * 10;
    }
}
