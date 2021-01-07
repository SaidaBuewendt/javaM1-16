package lesson24_0701;

public class MyLovelyVarargs {
    public static void main(String[] args) {
        //addition(2, 3, 6);
        //int[] arr = new int[]{2, 3, 4, 5};
        //findArraySum(arr);
       // System.out.println("Сумма элемента массива "+findArraySum(arr));
        int[]var = new int[]{2,3,4,5};
        sum();
        sum(2,3);
        sum(2,3,4,5);
        sum(var);
    }

    private static int sum(int... allDigits) {
        int mySum = 0;
        for (int i = 0; i < allDigits.length; i++) {
            mySum=mySum+allDigits[i];
        }
        return 0;
    }

    private static int findArraySum(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    private static int addition(int x, int y, int z) {
        return x + y + z;
    }
}
