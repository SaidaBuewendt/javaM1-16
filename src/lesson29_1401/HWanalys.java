package lesson29_1401;

public class HWanalys {
    public static void main(String[] args) {
        /*For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to
        20.
        Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10.
        Given 3 ints, a b c, return the sum of their rounded values.
        To avoid code repetition, write a separate helper "public int
        round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().*/

        System.out.println(roundSum(16, 17, 18));// → 60
        System.out.println(roundSum(12, 13, 14));// → 30
        System.out.println(roundSum(6, 4, 4));//→ 10
        System.out.println(roundSum(77, 14, 99));//→ 190
        System.out.println(roundSum(777, 333, 111));//→ 780+330+110=1220
        System.out.println("_______________");
    }

    private static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    private static int round10(int num) {
        //1.Найти число по модуло 10
        //2. Сравниваем результат (остаток от деления) с 5
        //3. Если остаток деления меньше 5, от числа отнять 3 (остаток от деления)
        //4. Если остаток деления больше 5, тоотнимаем наше модуло и прибавляем 10
        int tempModulo = num % 10;
        if (tempModulo < 5) {
            num = num - tempModulo;
        } else {
            num = num - tempModulo + 10;
        }
        return num;
    }
}
