package lesson26_1101;

public class HomeWork1101 {
    public static void main(String[] args) {
        // 2. Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for
        // the 'd', so "cope" and "cooe" count.
        System.out.println(countCode("aaacodebbb"));// →1
        System.out.println(countCode("codexxcode"));// → 2
        System.out.println(countCode("cozexxcope"));// → 2
        System.out.println(countCode("cozecodecope"));// → 3
        System.out.println(countCode("abcdefg"));// → 0
        System.out.println("_____");

        //3. Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
        System.out.println(bobThere("abcbob"));//→ true
        System.out.println(bobThere("b9b"));//→ true
        System.out.println(bobThere("bac"));//→ false
        System.out.println(bobThere("bobbobbob"));//→ true
        System.out.println("_____");

        //Нарисуйте/выведите в консоль" треугольник из звёздочек используя только одну звёздочку и то что только что
        //изучили:
        System.out.println(triangle());
    }


    private static char triangle() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
        }
        return 0;
    }

    private static boolean bobThere(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'b' && input.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    private static int countCode(String input) {
        int count = 0;
        for (int i = 0; i < input.length() - 3; i++) {
            if (input.startsWith("co", i) && input.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }
}
