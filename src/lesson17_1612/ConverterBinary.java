package lesson17_1612;

public class ConverterBinary {
    public static void main(String[] args) {
        System.out.println(convertDecimalToBinary(78));
        System.out.println(convertDecimalToBinaryForI(78));

    }

    public static String convertDecimalToBinary(int decimal) {
        String output = "";
        while (decimal > 0) {
            int remain = decimal % 2;  //находим цифру из двоичного числа в результате
            output = remain + output; //записываем цифру в результат. Тут очень важен порядок слагаемых, тк это Стринг, а не математика
            decimal = decimal / 2; //делим ИНПУТ на два и переиспользуем его
        }


        return output;
    }

    public static String convertDecimalToBinaryForI(int decimal) {
        String output = "";
        for (int i = decimal; i > 0; i =i/ 2) {
            int remain = i % 2;  //находим цифру из двоичного числа в результате
            output = remain + output; //записываем цифру в результат. Тут очень важен порядок слагаемых, тк это Стринг, а не математика
            System.out.println(i);
        }

        return output;
    }

}
