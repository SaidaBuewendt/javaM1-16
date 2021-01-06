package lesson04_2611;

public class HelloString {
    public static void main(String[] args) {
        magicString();
        london();
        //intToString();
    }

    public static void jamesBond() {
        String userFirstNAme = "James";
        String copyright = "©";
        char copyright2 = '©';
        String userSecondName = "Bond";
        int age = 35;
        System.out.println(userFirstNAme + " " + userSecondName + " " + age);
        String student = userFirstNAme + " " + userSecondName + " " + age;
        System.out.println(student);
    }

    public static void magicString() {
        String firstname = "Saida";
        String secondname = "Büwendt";
        String user = firstname + secondname;
        int dlina = user.length();
        System.out.println(dlina);
        String first10chars = user.substring(0, 10); //включая 1ый символ, но исключая последний
        System.out.println(first10chars);
        System.out.println(first10chars.toUpperCase());
    }

    public static void london() {
        String myLife = "London is the capital of Great Britain";
        System.out.println(myLife);
        System.out.println(myLife.toUpperCase());
        System.out.println(myLife.toLowerCase());
        System.out.println(myLife.substring(0, 1).toUpperCase() + myLife.substring(1).toLowerCase());
        String game = myLife.substring(0, 2).toUpperCase() + myLife.substring(2, 4).toLowerCase() + myLife.substring(4, 6).toUpperCase();
        System.out.println(game);
    }

    /*public static void intToString() {
        int digit = 10;
        String text = String.valueOf(digit);
        System.out.println(text);
        int tryAndTry = Integer.parseInt(text);// вытягивает из текста цифры
        System.out.println(tryAndTry);
        String онатебе="№10"; //ошибка, тк споткнулся об первый символ
        int myTry = Integer.parseInt(онатебе);
        System.out.println(myTry);*/

    }

