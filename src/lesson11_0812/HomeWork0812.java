package lesson11_0812;

public class HomeWork0812 {
    public static void main(String[] args) {
        /*  16. Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz".
        If both the "f" and "b" conditions are true, return "FizzBuzz".
        In all other cases, return the string unchanged. (See also: FizzBuzz Code)*/
        System.out.println(fizzString("fig"));// → "Fizz"
        System.out.println(fizzString("dib"));// → "Buzz"
        System.out.println(fizzString("fib"));// → "FizzBuzz"

       /* 1. Прямоугольник
        При вызове метода rectangle(5, 7); на экране появился прямоугольник. Что написано в методе rectangle?*/
        rectangle(5, 7);
    }

    private static void rectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            System.out.println("");
            for (int j = 0; j < b; j++)
                System.out.print ('*');
        }
    }

    private static String fizzString(String str) {
        String firstLetter = str.substring(0, 1);
        //System.out.println(firstLetter);
        String lastLetter = str.substring(2);
        // System.out.println(lastLetter);
        if (firstLetter.equals("f") && lastLetter.equals("b")) {
            return "FizzBuzz";
        } else if (firstLetter.equals("f")) {
            return "Fizz";
        } else if (lastLetter.equals("b")) {
            return "Buzz";
        } else {
            return str;
        }

    }
}

