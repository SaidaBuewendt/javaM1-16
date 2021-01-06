package lesson17_1612;

import java.util.Scanner;

public class myScanner {
    public static void main(String[] args) {
        Scanner magicInput = new Scanner(System.in);
        int age;
        System.out.println("Сколько тебе лет?");
        age= magicInput.nextInt();
        System.out.println("Как тебя зовут?");
        String customerName;
        customerName = magicInput.next();
        System.out.println("А ты уверен " + customerName + " что тебе " + age + " лет?");
    }
}
