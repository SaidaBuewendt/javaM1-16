package HomeWork;

public class Encryption {
    public static void main(String[] args) {
//        Разработайте шифровальную машину для нового клиента фирмы - Гая Юлия Цезаря.
//        Клиент придумал шифровальный алгоритм и хочет, что бы мы реализовали его в методе.
//        Пример выполнения метода:
//
//        enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.")
//        "Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб."

        System.out.println(enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю"));
        System.out.println(enigmaCaesar("абвгде"));
    }

    private static String enigmaCaesar(String input) {
        input=input.toLowerCase();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = output + symbolCode(input.charAt(i));
        }
        return output;
    }

    private static char symbolCode(char symbol) {
        char result = 0;
        //1. result = (char) (symbol + 3);
        //2. 1st вариант + исключения через IF
        //3. Сделать свою таблицу инпут и аутпут через Стринг или через массив символов
        //4. Switch

        String input = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя,.";
        String output = "гдеёжзийклмнопрстуфхцчшщъыьэюяабв,.";
        int index = input.indexOf(symbol);
       // System.out.println(index);
        result = output.charAt(index);
        return result;
    }
}



    /*
       char[] symbols = phrase.toCharArray();
      System.out.println(symbols[0]);
        for (int i = 0; i < symbols.length; i++) {
            symbols [i] =symbols [i+k];
            System.out.print(symbols);

        }

    }
}
*/
