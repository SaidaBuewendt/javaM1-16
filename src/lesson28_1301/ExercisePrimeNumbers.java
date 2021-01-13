package lesson28_1301;

public class ExercisePrimeNumbers {
    public static void main(String[] args) {
        naturalNumber(2, 15);
    }

    private static void naturalNumber(int a, int b) {
        for (int i = a; i < b; i++) {
            if (primeNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static boolean primeNumber(int number) {

        if (number == 0) {
            return false;
        }
        if (number == 1) {
            return true;
        }
        int count = 0; // var1
        boolean flag = false; //var2
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++; //var1
                flag = true; //var2
            }
        }
        if (count > 0) {
            return false;
        }
        if (flag) {
            return false;
        }
        return true;
    }
}
