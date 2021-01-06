package lesson15_1412;

public class LoopForExcercise { // for i
    public static int multiply(int a, int b) { //Multiple und M2 und M3 по сути три одинаковых процесса, FORI - синтаксический сахар цикла WHILE
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = result + a;
        }
        return result;
    }

    public static int multiply2(int a, int b) { //while (сначала думаем, потом делаем || KOPFSCHLEIFE)
        int result = 0;
        int i = 0;
        while (i < b) {
            result = result + a;
            i++;
        }
        return result;
    }


    public static int multiply3(int a, int b) { //do while (сначала делаем, потом думаем || FUSSschleife)
        int result = 0;
        int count = 0;
        do {
            result = result + a;
            count++;

        } while (
                count < b);
        return result;
    }

    public static void draw(int number) {
    }

}