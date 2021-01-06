package lesson20_2112;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        double[] arrayDouble = new double[]{1.1, 2.2, 3.3, 4.4};
        //printArray(array);
        printIntArrayForEach(array);
        printDoubleArrayForEach(arrayDouble);

    }

    public static void printIntArrayForEach(int[] array) {
        for (int element : array) {
            System.out.print(element + ",");
        }
        System.out.println();
    }

    public static void printDoubleArrayForEach(double[] array) {
        for (double element : array) {
            System.out.print(element + ",");
        }
        System.out.println();
    }

    private static void printArray(int[] input) {
        System.out.println("Начинаем печатать int - массив");
        System.out.print("Должно быть значение элемента массива ");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ",");

        }
        System.out.println();
    }

}
