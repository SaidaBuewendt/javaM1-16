package lesson05_3011;

public class HWanalys {
    public static void main(String[] args) {
        char tradeMark = '\u0099'; //данный символ не считывается
        System.out.println(tradeMark);
        char heart = '\u2665';
        System.out.println(heart);
        String name = "James Bond, ";
        String profession = "\"spy\""; //заэкранировали кавычки
        System.out.println(name + profession);
        /*makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"*/
        System.out.println(makeOutWord("<<>>","Yay"));

    }

    public static String makeOutWord(String out, String word) {
        String result = "";
        result = out.substring(0,2) + word + out.substring(2);
        return result;
    }

}
