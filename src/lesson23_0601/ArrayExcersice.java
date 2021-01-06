package lesson23_0601;

public class ArrayExcersice {
    public static void main(String[] args) {
        //9. We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky
        //1 in the first 2 or last 2 positions in the array.
        int[] arr1 = new int[]{1, 3, 4, 5};
        int[] arr2 = new int[]{2, 1, 3, 4, 5};
        int[] arr3 = new int[]{1, 1, 1};

        System.out.println(unlucky1(arr1));// → true
        System.out.println(unlucky1(arr2)); // → true
        System.out.println(unlucky1(arr3)); // → false


        //10. Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
        int[] var1 = new int[]{1, 2, 3};
        int[] var2 = new int[]{1, 2, 3, 1};
        int[] var3 = new int[]{1, 2, 1};


        System.out.println(sameFirstLast(var1));// → false
        System.out.println(sameFirstLast(var2));// → true
        System.out.println(sameFirstLast(var3));// → true

        //11. Given an array of ints length 3, return the sum of all the elements.
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{5, 11, 2};
        int[] a3 = new int[]{7, 0, 0};
        int[] a4 = new int[]{7, 0, 0,12};

        System.out.println(sum3(a1));//→ 6
        System.out.println(sum3(a2));// → 18
        System.out.println(sum3(a3));// → 7
        System.out.println(sum3(a4));// → 7


    }

    private static int sum3(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum = sum+input[i];
        }
        return sum;
    }


    private static int sum3Simple(int[] input) {
        int sum = input[0]+input[1]+input[2];
        return sum;
    }

    private static boolean sameFirstLast(int[] input) {
        return input[0] == input[input.length - 1] && input.length >= 1;
    }

    private static boolean unlucky1(int[] array) {
        //1. Проверяем нахождение на 0м индексе "1"
        //2. Если на 0 индексе "1", то проверяем на индексе (0+1) нахождение "3". Если нашли то true
        //3. Повторяем первые два действия на индексе 1 и array.length-2

        if (array[0] == 1 && array[1] == 3) {
            return true;
        }
        if (array[1] == 1 && array[2] == 3) {
            return true;
        }
        if (array[array.length - 2] == 1 && array[array.length - 1] == 3) {
            return true;
        }
        return false;
    }
}

