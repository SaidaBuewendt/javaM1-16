package lesson04_2611;

public class HelloChar {
    //Символы
    public static void main(String[] args) {
        char digit = 100;
        System.out.println(digit);
        char octal = '\u039A';
        char euroSymbol = '€';
        System.out.println(euroSymbol);
        char tabulator = '\t';
        System.out.print(tabulator);
        System.out.println("Ожидаем 4 пробела");
        System.out.println("" + 'a'+'b'+'c');
    }
}
