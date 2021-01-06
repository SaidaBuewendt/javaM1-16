package lesson19_1812;

public class ArrayExercises {
    public static void main(String[] args) {
//        . Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or
//        more.
//                Дан массив int. Верните true, если цифра 6 является значением в первом или последнем элементе массива. Массив
//        будет длиной больше, либо равной единице.


        int[] array1 = new int[]{1, 2, 6}; //Всегда при использовании Массивов в мейн методе нужно это прописывать
        int[] array2 = new int[]{6, 1, 2, 3};
        int[] array3 = new int[]{13, 6, 1, 2, 3};

        System.out.println(firstLast6(array1));// → true
        System.out.println(firstLast6(array2));//→ true
        System.out.println(firstLast6(array3));// → false

/*        Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both
        arrays will be length 1 or more.
        Получив 2 массива int[], a и b, возвращаем true, если они имеют один и тот же первый или последний элемент. Оба
        массива будут длиной больше, либо равной единице.*/

        int[] array4 = new int[]{1, 2, 3};
        int[] array5 = new int[]{7, 3};
        int[] array6 = new int[]{7, 3, 2};
        int[] array7 = new int[]{1, 3};


        System.out.println(commonEnd(array4, array5));//→ true
        System.out.println(commonEnd(array4, array6));// → false
        System.out.println(commonEnd(array4, array7));// → true


//        3. Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
//        Дан массив длиной 3, верните новый массив с элементами в обратном порядке, например {1, 2, 3} становится {3, 2, 1}.


        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{5, 11, 9};
        int[] a3 = new int[]{7, 0, 0};


        reverse3(a1);// → [3, 2, 1]
        reverse3(a2);//→ [9, 11, 5]
        reverse3(a3);//→ [0, 0, 7]
    }

    private static int[] reverse3(int[] array) {
        int[] result = new int[3];
        result[0] = array[2];
        result[0] = array[1];
        result[0] = array[0];
        return result;
    }

    private static boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0]) {
            return true;
        } else if (a[a.length - 1] == b[b.length - 1]) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean firstLast6(int[] input) {
        if (input[0] == 6 || input[input.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }
}