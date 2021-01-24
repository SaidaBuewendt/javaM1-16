package lesson29_1401;

import java.util.Arrays;

public class MyLovelySortClassWork {
        public static void main(String[] args) {
        //exampleLink();
        int[] arr = new int[]{45, 12, 0, 56, -5, 100, 1000, 7, 4};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void bubbleSort(int[] input) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }

    private static void bubbleSortCount(int[] input) {
        int count = 1;
        while (count > 0) {
            count = 0;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    count = count + 1;
                }
            }
        }
        // конец метода
    }

    private static void exampleLink() {
        int[] arr = new int[]{45, 12, 0, 56, -5, 100, 1000, 7, 4};
        bubbleSort(arr);
        int[] barr = arr;
        System.out.println(Arrays.toString(barr));
        barr[0] = 500;
        System.out.println(Arrays.toString(barr));
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);
        System.out.println(barr);
    }
}

