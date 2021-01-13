package lesson28_1301;

import java.util.Arrays;

public class ExerciseArray {
    public static void main(String[] args) {
        int size = 10;
        int[] array = createArray(size);
        int max = findMax(array);
        int min = findMin(array);
        int sum = findSum(array);
        int middle = sum / array.length; //size
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
        System.out.println("Total sum value: " + sum);
        System.out.println("The average value of an array element: " + middle);
    }

    private static int findSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
            return max;
        }
        return max;
    }

    private static int[] createArray(int size) {
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = (int) (Math.random() * 100);
        }

        return output;
    }
}
