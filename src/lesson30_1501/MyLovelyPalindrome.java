package lesson30_1501;

public class MyLovelyPalindrome {
    public static void main(String[] args) {
         /*
    Написать свой метод проверки строки на палиндром.
    Учесть, что палиндром может быть предложением с пробелами.
    При решении задачи используйте цикл.
    Нельзя использовать методы replace(), reverse() и конструкции, которые вы не учили.
*/
        System.out.println(checkPalindrome("А роза упала на лапу Азора")); //-> true
        System.out.println(checkPalindrome("поп")); //-> true
        System.out.println(checkPalindrome("школа"));//-> false


    }

    private static boolean checkPalindrome(String word) {
        String input = word;
        input = word.toLowerCase();
        input = deleteSpace(input);
        String output = wordReverse(input);
        return input.equals(output);
    }

    private static String deleteSpace(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                output = output + input.charAt(i);
            }
        }
        return output;
    }

    private static String wordReverse(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            result = input.charAt(i) + result;
        }
        return result;
    }
}
