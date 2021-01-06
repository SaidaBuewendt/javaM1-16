package lesson04_2611;

public class HomeWork2611 {

    public static void main(String[] args) {
        /*1. Найти в интернете таблицы для типа данных char. Проверить, что они действительно соответствуют тому,
        что выводит Java на экран. Найти "смешные" символы,
        символ стандартного смайлика, найти символ телефона, параграфа, копирайта(C), торговой марки(тм), рубля, евро, доллара, знаков зодиака, шахмат, червы.*/
        exercise1();
        //2. Вывести на экран сообщение в кавычках. Например собственное имя + "профессия".
        exercise2();
        //3. Вывести на экран построчно анкетные данные: Имя, Фамилия, Адрес, Улица и тд и тп.
        System.out.println(exercise3("Saida", "Büwendt", "Berlin", "Schliemannstrasse"));
        /*Given an “out” string length 4, such as “«»”, and a word, return a new string where the word is in the middle of the out string,
        e.g. “«word»”. Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
        makeOutWord("<<>>", "Yay") → "<<Yay>>"
        makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
        makeOutWord("[[]]", "word") → "[[word]]*/
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));
    }

    public static void exercise1() {
        char a = 'D';
        char b = 181;
        char c = '\u1d6b';
        char d = '\u263a';
        char e = '\u00A7';
        char f = '\u00A9';
        char g = '\u2122';
        char h = '\u20bd';
        char i = '\u20ac';
        char j = '\u0024';
        char k = '\u264c';
        char l = '\u2658';
        char m = '\u2665';


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);


    }

    public static void exercise2() {
        String firstname = "Saida Büwendt";
        String occupation = "Hausfrau";
        System.out.println(firstname + ", " + occupation);
    }

    public static String exercise3(String firstnameValue, String secondNameValue, String cityValue, String streetValue) {
        String firstname = "Имя: ";
        String secondName = "Фамилия: ";
        String city = "Город: ";
        String street = "Улица: ";
        return firstname + firstnameValue + "\n" + secondName + secondNameValue + "\n" + city + cityValue + "\n" + street + streetValue;

    }

    public static String makeOutWord(String symbols, String word) {
        return symbols.substring(0, 2) + word + symbols.substring(2);

    }
}

