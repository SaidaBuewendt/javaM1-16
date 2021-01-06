package lesson17_1612;

import java.util.Scanner;

public class HomeWork1612 {
    public static void main(String[] args) {
//        Напишите программу, которой надо представиться. Данные, которые спрашивает машина: имя, фамилия, пол,
//        возраст, e-mail. Для считывания данных типа String используйте метод next(): input.next()
        introduceYourself();

        System.out.println("________________");
//        Напишите программу, которая принимает из "сканера" возраст человека в строке и отдаёт его в вашу переменную
//        int. В четвёртой главе(char, String) мы коротко рассматривали один из способов передачи такой информации.
        ageToInt();
        System.out.println("________________");

        methods();
    }


    private static void methods() {
        String word = "Василий";
        //charAt(int index) - находит символ с определенным индексом
        System.out.println(word.charAt(0));
        //codePointAt(int index) - находит номер Unicode c указанным индексом
        System.out.println(word.codePointAt(0));
        //codePointBefore(int index) - находит номер Unicode символа, стоящего перед указанным в индексе
        System.out.println(word.codePointBefore(1));
        //codePointCount(int beginIndex, int endIndex)- считает количество символов Unicode
        System.out.println(word.codePointCount(0,word.length()));
        //compareToIgnoreCase(String str) - сравнивает строки, игнорируя регистр (0 - сроки равны, положительное число - заданная строка больше нужной, отриц. число - заданная строка меньше
        String compare1 ="Hello ";
        String compare2 ="Word";
        System.out.println(compare1.compareToIgnoreCase(compare2));
        //concat(String str) - сцепляет стринги
        System.out.println(compare1.concat(compare2));
        //contains(CharSequence s) - проверяет содержит ли Стринг заданную последовательность символов
        System.out.println(word.contains("Вас"));
        //endsWith(String suffix) - проверяет соответствие окончания Стринга заданному значению
        System.out.println(word.endsWith("ий"));
        System.out.println(word.endsWith("Вас"));


    }


    private static void ageToInt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        String age;
        age = input.next();
        int ageInt = Integer.parseInt(age);
        System.out.println("Age in INT: " + ageInt);

    }

    public static void introduceYourself() {
        Scanner input = new Scanner(System.in);
        String firstName;
        System.out.println("Enter your first name:");
        firstName = input.next();
        System.out.println("Enter your second name:");
        String secondName;
        secondName = input.next();
        System.out.println("Enter your gender:");
        String gender;
        gender = input.next();
        System.out.println("Enter your age:");
        int age;
        age = input.nextInt();
        System.out.println("Enter your e-mail:");
        String email;
        email = input.next();
    }
}


