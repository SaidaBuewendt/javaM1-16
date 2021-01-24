package lesson24_0701;

import UsefulMethods.PrintArrays;

public class HomeWork0701 {
    public static void main(String[] args) {
        //16. Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
        int[] arr1 = new int[]{1, 2};
        int[] arr2 = new int[]{3, 4};
        int[] arr3 = new int[]{4, 4};
        int[] arr4 = new int[]{2, 2};
        int[] arr5 = new int[]{9, 2};

        PrintArrays.printIntArrayForEach(plusTwo(arr1, arr2));// → [1, 2, 3, 4]
        PrintArrays.printIntArrayForEach(plusTwo(arr3, arr4));// → [4, 4, 2, 2]
        PrintArrays.printIntArrayForEach(plusTwo(arr5, arr2));// → [9, 2, 3, 4]
        System.out.println("_____________");

        //17. Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array
        //length will be a least 1.
        int[] arr6 = new int[]{1, 2, 3};
        int[] arr7 = new int[]{1, 5, 3};
        int[] arr8 = new int[]{5, 2, 3};
        int[] arr9 = new int[]{5, 2, 3, 12, 125, 7, 5};
        int[] arr10 = new int[]{5, 2, 3, 12, 125};

        System.out.println(maxTriple(arr6));//→ 3
        System.out.println(maxTriple(arr7));//→ 5
        System.out.println(maxTriple(arr8));//→ 5
        System.out.println(maxTriple(arr9));//→ 12
        System.out.println(maxTriple(arr10));//→ 125
        System.out.println("_____________");


        //18. Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the
        // elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2
        //arrays.

        int[] arr11 = new int[]{4, 5};
        int[] arr12 = new int[]{1, 2, 3};
        int[] arr13 = new int[]{4};
        int[] arr14 = new int[]{1, 2, 3};
        int[] arr15 = new int[0];
        int[] arr16 = new int[]{1, 2};
        int[] arr17 = new int[]{1, 2, 3, 4, 5};
        int[] arr18 = new int[]{6, 7, 8, 9};


        PrintArrays.printIntArrayForEach(make2(arr11, arr12)); // → [4, 5]
        PrintArrays.printIntArrayForEach(make2(arr13, arr14));// → [4, 1]
        PrintArrays.printIntArrayForEach(make2(arr15, arr16));// → [1, 2]
        PrintArrays.printIntArrayForEach(make2(arr17, arr18));// → [1, 2]
    }

    private static int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        if (a.length > 2) {
            result[0] = a[0];
            result[1] = a[1];
        } else {
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i];
            }
            for (int i = a.length; i < 2; i++) {
                result[i] = b[i - a.length];
            }
        }
        return result;
    }

    private static int maxTriple(int[] input) {
        //int result;
        //int check1 = Math.max(input[0], input[input.length / 2]);
        //int check2 = Math.max(input[input.length - 1], input[input.length / 2]);
        //result = Math.max(check1, check2);
        //return result;
        int max = Math.max(input[0], input[input.length / 2]);
        max = Math.max(max, input[input.length - 1]);
        return max;
    }

    private static int[] plusTwo(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = a.length; i < result.length; i++) {
            result[i] = b[i - a.length];
        }
        return result;
    }

}
