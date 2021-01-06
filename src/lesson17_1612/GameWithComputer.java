package lesson17_1612;

import java.util.Scanner;

public class GameWithComputer {
    public static void main(String[] args) {

        /*Компьютер загадывает число от 1 до n. У пользователя k попыток отгадать. После каждой неудачной попытки
        компьютер сообщает меньше или больше загаданное число. В конце игры текст с результатом (или “Вы угадали”, или “Попытки закончились”).*/

        //1 Компьютер генерирует число
        //2 Логика игры
        //3 Добавить Scanner

        //System.out.println(generateDigit());
        game(10050);
    }

    private static void game(int maxAttempts) {
        int attempts = 1;
        Scanner input = new Scanner(System.in);
        int digit = generateDigit();
        System.out.println("Введите число от 0 до 100");
        int number = input.nextInt();
        System.out.println(compareNumbers(number, digit));
        while (number != digit && attempts < maxAttempts) {
            number = input.nextInt();
            System.out.println(compareNumbers(number, digit));
            attempts++;
        }
        if (attempts >= maxAttempts) {
            System.out.println("Попытки исчерпаны");
        }
    }


    private static String compareNumbers(int number, int digit) {
        if (number == digit) {
            System.out.println("Угадали!");
        } else if (number > digit) {
            System.out.println("Меньше");
        } else {
            System.out.println("Больше");
        }

        return "";
    }

    public static int generateDigit() {
        return (int) (Math.random() * 101); // упрощенная формула когда нужен рандом просто от 0 до 100

    }

}
