package lesson12_0912;

public class MyLovelyString {
    public static void main(String[] args) {
        exampleOne();
        exampleTwo();
        exampleThree();
    }

    static void exampleOne() {
        //charAt
        String hm = "Schwarzneger";
        System.out.println(hm.charAt(3));
        System.out.println(hm.charAt(hm.length() - 3));
        char firstLetter = hm.charAt(0);
        char lastLetter = hm.charAt(hm.length() - 1);
        //  System.out.println(firstLetter+lastLetter); //сложил математически
        System.out.println("" + firstLetter + lastLetter); //сложил математически
        int magicInt = firstLetter + lastLetter;
        String magicString = "" + firstLetter + lastLetter;
        //String magicSting2 = String.valueOf(firstLetter + lastLetter);
        //String magicString3 = "";
        //  magicString3 += firstLetter + lastLetter;

        int test = 5 + 4 * 7 / 10;
        System.out.println(magicString);
    }

   static void exampleTwo() {
        //codePointAt
        String hm = "Schwarzneger";
        int index = 4;
        System.out.println(hm.codePointAt(4)); //97
        String euroSymbol = "€";
        System.out.println(euroSymbol.codePointAt(0));
        char euro = 8364;
        System.out.println(hm.codePointBefore(4));
    }

    static void exampleThree() {
        String hm = "Schwarzneger";
        String newHm = hm.replace( 'e', 'Я');
        System.out.println(newHm);

    }
}
