package lesson29_1401;

public class ExerciseReverse {
    public static void main(String[] args) {
        //Дано число, переверните его. Например, 546 -> 645
        System.out.println(simpleNumberReverse(546));
        System.out.println(simpleNumberReverse(5798));
        System.out.println(simpleNumberReverse(123));
        System.out.println(reverse("А роза упала на лапу Азора"));
    }

    private static int simpleNumberReverse(int number) {
        //1 Перевести в стринг
        //2. Записать задом на перед, используя отдельный метод
        //3. Перевести в инт и отдать
        String temp = String.valueOf(number);//546
        String tempReverse = reverse(temp);//645
        int result = Integer.parseInt(tempReverse);//645
        return result;
    }

    private static String reverse(String input) {
        //1 Ввести новую переменную String output
        //2 Поменять местами
        //3 Вернуть
        String output = "";
        for (int i = input.length()-1; i >= 0; i--) {
            //1 Последняя буква инпута в первую букву аутпута
            output = output+input.charAt(i);
        }
        return output;
    }
}
