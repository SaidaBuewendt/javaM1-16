package lesson17_1612;

public class HWanalys {
    public static void main(String[] args) {
        printDivisors(32);
        multiplicationTable(5);
        verySmartGiveMeChar();

        System.out.println(doubleChar("The")); // → "TThhee"
        System.out.println(doubleChar("AAbb")); //→ "AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));// → "HHii--TThheerree"
    }

    private static String doubleChar(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            output = output + str.charAt(i);
        }
        return output;
    }

    private static void multiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + i * number);
        }
    }

    private static void printDivisors(int number) {
        int divisors = 0;
        for (int i = number; i > 0; i--) {
            if (number % i == 0) {
                divisors++;
                System.out.println(i);
            }

        }
        System.out.println("Total devisors " + divisors);
    }

    private static String verySmartGiveMeChar() {
        String input = "abcdefghijklmnopqarstuxzy0123456789!§$%&§0123456789";
        String output = "";
        int random = (int) (Math.random() * input.length());
        output = output + input.substring(random, random + 1);
        return output;
    }


}
