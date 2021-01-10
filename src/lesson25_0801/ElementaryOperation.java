package lesson25_0801;

public class ElementaryOperation {
    public static void main(String[] args) {
        int[] arr = myLovelyRandom(10);
        int[] arr1 = new int[0];
        int[] arr2 = new int[]{3, 5};
        myLovelyPrint(arr);
        System.out.println(minValueinElementArray(arr));
        System.out.println(maxValueinElementArray(arr));
        System.out.println("Сумма всех элементов массива: " + sumElementArray(arr));
        System.out.println("Среднее значение элементов массива: " +middleValueElementArray(arr));
    }

    private static double middleValueElementArray(int[] arr) {
        //1. Сложить
        //2. Разделить
        double sum = sumElementArray(arr);
        return sum/arr.length;
    }

    private static int sumElementArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    private static String maxValueinElementArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return "Максимальное значение в массиве " + max;
    }

    private static String minValueinElementArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }
        return "Минимальное значение в массиве " + min;
    }

    private static void myLovelyPrint(int[] input) {
        for (int element : input
        ) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static int[] myLovelyRandom(int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int) (Math.random() * 100);
        }
        return result;
    }
}
