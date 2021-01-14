package lesson29_1401;

public class HomeWork_1401 {
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

    private static boolean checkPalindrome(String input) {
        String withoutSpace = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                withoutSpace = withoutSpace + input.charAt(i);
            }
        }
        String tempInput = withoutSpace.toLowerCase();
        String output = "";
        for (int i = tempInput.length() - 1; i >= 0; i--) {
            output = output + tempInput.charAt(i);
        }
        return tempInput.equals(output);
    }
}
