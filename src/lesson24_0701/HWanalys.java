package lesson24_0701;

import UsefulMethods.PrintArrays;

public class HWanalys {
    public static void main(String[] args) {
        // 1. Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{11, 5, 9};
        int[] arr3 = new int[]{2, 11, 3};

        PrintArrays.printIntArrayForEach(maxEnd3(arr1)); // → [3, 3, 3]
        PrintArrays.printIntArrayForEach(maxEnd3(arr2)); // → [11, 11, 11]
        PrintArrays.printIntArrayForEach(maxEnd3(arr3)); // → [3, 3, 3]
        System.out.println("_________");
    }

    private static int[] maxEnd3(int[] array) {
        int[] result = new int[array.length];
        int maxElement;
        maxElement = (array[2]>array[0])?array[2]:array[0];
        return result;
    }
}
