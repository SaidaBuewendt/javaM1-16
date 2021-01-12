package lesson27_1201;

public class LogicExercises {
    public static void main(String[] args) {
/*        . Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that
        value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in
        an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e.
        "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().*/
        System.out.println(noTeenSum(1, 2, 3));// → 6
        System.out.println(noTeenSum(2, 13, 1));// → 3
        System.out.println(noTeenSum(2, 1, 14));// → 3
        System.out.println(noTeenSum(2, 1, 15));// → 18


    }

    private static int noTeenSum(int a, int b, int c) {
        int sum = 0;
        if (a >= 13 && a <= 14 || a >= 17 && a <= 19) {
            a = 0;
        }
        if (b >= 13 && b <= 14 || b >= 17 && b <= 19) {
            b = 0;
        }
        if (c >= 13 && c <= 14 || c >= 17 && c <= 19) {
            c = 0;
        }
        sum = a + b + c;
        return sum;
    }
}
