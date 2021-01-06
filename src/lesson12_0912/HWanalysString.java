package lesson12_0912;

public class HWanalysString {
    public static void main(String[] args) {
          /*  16. Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz".
        If both the "f" and "b" conditions are true, return "FizzBuzz".
        In all other cases, return the string unchanged. (See also: FizzBuzz Code)*/
        System.out.println(fizzString("fig"));// → "Fizz"
        System.out.println(fizzString("dib"));// → "Buzz"
        System.out.println(fizzString("fib"));// → "FizzBuzz"
        System.out.println(fizzString("aaa"));// → "FizzBuzz"

        System.out.println(fizzString3("fig"));// → "Fizz"
        System.out.println(fizzString3("dib"));// → "Buzz"
        System.out.println(fizzString3("fib"));// → "FizzBuzz"
        System.out.println(fizzString3("aaa"));// → "FizzBuzz"
    }

    private static String fizzString(String str) {
        //1. Отсеять тех, кто начинается с F и заканчивается на B
        //2. Отсеять тех, кто начинается ПРОСТО с F
        //3. Отсеять тех, кто заканчивается ПРОСТО на B
        //4. Все остальные
        if (str.substring(0, 1).equals("f") && str.equals("b")) {
            return "FizzBuzz";
        } else if (str.substring(0, 1).equals("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else {
            return str;
        }
    }

    private static String fizzString2(String str) {
        if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') { //charAt - указать конкретный номер символа
            return "FizzBuzz";
        } else if (str.charAt(0) == 'f') {
            return "Fizz";
        } else if (str.charAt(str.length() - 1) == 'b') {
            return "Buzz";
        } else {
            return str;
        }
    }

    public static String fizzString3(String str) {
        boolean magicString3 =str.startsWith("f") && str.endsWith("b");
        if (magicString3) {
            return "FizzBuzz";
        } else if (str.charAt(0) == 'f') {
            return "Fizz";
        } else if (str.charAt(str.length() - 1) == 'b') {
            return "Buzz";
        } else {
            return str;
        }
    }
}
