package lesson04_2611;

public class HomeWork2611extra {
    public static void main(String[] args) {
        //7. Вырезать из выражения "Вход разрешён" последние 8 символов и добавить "воспрещён".
        exchangeWords();
        //8. Вывести на экран "Осторожно, вход воспрещён" заглавными буквами.
        System.out.println(printInCapitalletters("Осторожно, вход воспрещён!"));
        //Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
        System.out.println(returnHalf("WooHoo"));
        System.out.println(returnHalf("HelloThere"));
        System.out.println(returnHalf("abcdef"));
    }

    public static void exchangeWords() {
        String phrase = "Вход разрешен";
        String forbidden = "запрещен";
        String eightSymbols = phrase.substring(0, 5);
        String phrase2 = eightSymbols + forbidden;
        System.out.println(phrase2);
    }

    public static String printInCapitalletters(String phrase) {
        String phrase2 = phrase.toUpperCase();
        return phrase2;
    }

    public static String returnHalf(String textEven) {
        int length = textEven.length();
        int half = length/2;
        String firstHalf = textEven.substring(0,half);
        return firstHalf;
    }
}
