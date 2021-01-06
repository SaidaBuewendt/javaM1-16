package lesson18_1712;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GameStarter {
    public static void main(String[] args) {
        game();
    }

    public static void game() {
        int attempts = customerAttempts();
        int range = customerRange();

        int secretCumputerNumber = generateDigit(range);
        int countAttempts = 0;
        System.out.println("Давай начнем!");
        int customerNumber;
        Scanner scr = new Scanner(System.in);
        customerNumber = scr.nextInt();
        while (customerNumber != secretCumputerNumber) {
            System.out.println();
            System.out.println(compare(customerNumber, secretCumputerNumber));
            System.out.println("Введите число снова");
            customerNumber = scr.nextInt();
            countAttempts++;
            if (attempts == countAttempts) {
                attemptsDone(countAttempts);
            }

        }
        System.out.println("Игра закончена, спасибо!");
    }

    private static String compare(int customerNumber, int secretCumputerNumber) {
        if (customerNumber == secretCumputerNumber) {
            return "Вы угадали";
        } else if (customerNumber > secretCumputerNumber) {
            return "Ваше число больше загаданного";
        } else {
            return "Ваше число меньше загаданного";
        }
    }

    private static void attemptsDone(int countAttempts) {
        System.out.println("Игра закончена, использовано " + countAttempts + "попыток");
    }

    private static int customerAttempts() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Я рекомендую для диапазона от 0 до 100 не менее 5ти попыток");
        System.out.println("За сколько попыток ты хочешь отгадать мое число?");
        return scr.nextInt();
    }

    private static int generateDigit(int diapason) {
        return (int) (Math.random() * diapason);
        //(max-min)+1+min
    }

    private static int customerRange() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Назовите диапазон");
        return scr.nextInt();
    }


}
