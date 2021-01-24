package lesson21_0401;

import UsefulMethods.Color;

public class HomeWork0401 {
    public static void main(String[] args) {
//         Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
        int[] a1 = new int[]{1, 2, 3, 4, 5};
        int[] a2 = new int[]{8, 6, 7, 5, 3, 0, 9};
        int[] a3 = new int[]{1, 2, 3};

        printArrayForEachColorful(midThree(a1));// → [2, 3, 4]
        printArrayForEachColorful(midThree(a2));// → [7, 5, 3]
        printArrayForEachColorful(midThree(a3));// → [1, 2, 3]

        System.out.println("_________________");

//        Разработайте шифровальную машину для нового клиента фирмы - Гая Юлия Цезаря.
//        Клиент придумал шифровальный алгоритм и хочет, что бы мы реализовали его в методе.
//        Пример выполнения метода:
//
//        enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.")
//        "Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб."

        System.out.println(enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю. "));
        System.out.println(decryptionCaesar("Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб."));
    }

    private static String decryptionCaesar(String input) {
        input = input.toLowerCase();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = output + decode(input.charAt(i));
        }
        return output;
    }

    private static char decode(char symbol) {
        char result = 0;
        switch (symbol) {
            case 'г':
                result = 'а';
                break;
            case 'д':
                result = 'б';
                break;
            case 'е':
                result = 'в';
                break;
            case 'ё':
                result = 'г';
                break;
            case 'ж':
                result = 'д';
                break;
            case 'з':
                result = 'е';
                break;
            case 'и':
                result = 'ё';
                break;
            case 'й':
                result = 'ж';
                break;
            case 'к':
                result = 'з';
                break;
            case 'л':
                result = 'и';
                break;
            case 'м':
                result = 'й';
                break;
            case 'н':
                result = 'к';
                break;
            case 'о':
                result = 'л';
                break;
            case 'п':
                result = 'м';
                break;
            case 'р':
                result = 'н';
                break;
            case 'с':
                result = 'о';
                break;
            case 'т':
                result = 'п';
                break;
            case 'у':
                result = 'р';
                break;
            case 'ф':
                result = 'с';
                break;
            case 'х':
                result = 'т';
                break;
            case 'ц':
                result = 'у';
                break;
            case 'ч':
                result = 'ф';
                break;
            case 'ш':
                result = 'х';
                break;
            case 'щ':
                result = 'ц';
                break;
            case 'ъ':
                result = 'ч';
                break;
            case 'ы':
                result = 'ш';
                break;
            case 'ь':
                result = 'щ';
                break;
            case 'э':
                result = 'ъ';
                break;
            case 'ю':
                result = 'ы';
                break;
            case 'я':
                result = 'ь';
                break;
            case 'а':
                result = 'э';
                break;
            case 'б':
                result = 'ю';
                break;
            case 'в':
                result = 'я';
                break;
            case ',':
                result = ',';
                break;
            case '.':
                result = '.';
                break;
            case ' ':
                result = ' ';
                break;
            default:
                result = '?';
                break;
        }
        return result;
    }

    private static String enigmaCaesar(String input) {
        input = input.toLowerCase();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = output + symbolCode(input.charAt(i));
        }
        return output;
    }


    private static char symbolCode(char symbol) {
        char result = 0;
        String input = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя,. ";
        String output = "гдеёжзийклмнопрстуфхцчшщъыьэюяабв,. ";
        int index = input.indexOf(symbol);
        result = output.charAt(index);
        return result;
    }

    private static int[] midThree(int[] input) {
        int[] output = new int[3];
        output[0] = input[input.length / 2 - 1];
        output[1] = input[input.length / 2];
        output[2] = input[input.length / 2 + 1];
        return output;
    }


    public static void printArrayForEachColorful(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 1) {
                System.out.print(Color.ANSI_RED + array[i] + "," + Color.ANSI_RESET);
            } else if (array[i] % 10 == 2) {
                System.out.print(Color.ANSI_WHITE + array[i] + "," + Color.ANSI_RESET);
            } else if (array[i] % 10 == 3) {
                System.out.print(Color.ANSI_BLUE + array[i] + "," + Color.ANSI_RESET);
            } else if (array[i] % 10 == 4) {
                System.out.print(Color.ANSI_YELLOW + array[i] + "," + Color.ANSI_RESET);
            } else if (array[i] % 10 == 5) {
                System.out.print(Color.ANSI_PURPLE + array[i] + "," + Color.ANSI_RESET);
            } else if (array[i] % 10 == 6) {
                System.out.print(Color.ANSI_CYAN + array[i] + "," + Color.ANSI_RESET);
            } else if (array[i] % 10 == 7) {
                System.out.print(Color.ANSI_BLACK + array[i] + "," + Color.ANSI_RESET);
            } else if (array[i] % 10 == 8) {
                System.out.print(Color.ANSI_GREEN + array[i] + "," + Color.ANSI_RESET);
            } else {
                System.out.println(Color.ANSI_BLACK + array[i] + "," + Color.ANSI_RESET);
            }
        }
        System.out.println();
    }
}
