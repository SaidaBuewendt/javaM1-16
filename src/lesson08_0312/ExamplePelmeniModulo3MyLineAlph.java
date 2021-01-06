package lesson08_0312;

public class ExamplePelmeniModulo3MyLineAlph {

        public static void main(String[] args) {
            //  happyPelmeni();
            //modulo3();
            //myLine(100);
            //7 14 21 28 35 42 49 56 63 70 77 84 91 98
            alphabet();

        }

        public static void happyPelmeni() {
            for (int i = 0; i < 10; i++) {
                if (i == 5) {
                    System.out.println("Happy Dumplings " + i);
                }
            }
        }

        public static void modulo3() {
            //Вывести на экран
            // все числа от 1 до 100, которые делятся на 3 без остатка.
            for (int i = 0; i < 100; i++) {
                if (i % 3 == 0) {
                    System.out.println(i + " delitsya na 3 bez ostatka");
                }
            }
        }

        public static void myLine(int number) {
            for (int i = 1; i < number; i++) {
                if (i % 7 == 0) {
                    System.out.print(i + " ");
                }
            }
        }

        public static void alphabet() {
            //  Вывести каждую букву американского алфавита от A-Z по 4 буквы в строке.
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.println("" + c + c + c + c);
            }
        }

    }

