package HomeWork;

import UsefulMethods.PrintArrays;
import UsefulMethods.RoundDouble;

import java.util.Arrays;


public class DoubleArrayExercise {
    public static void main(String[] args) {
        //Создать массив с десятичными дробями. - >>
        double[] array = createRandomDoubleArray(10);
        //Вывести его на экран. - >>
        PrintArrays.printDoubleArrayForEachColorful(array);
        //Отсортировать его по возрастанию. -->>
        PrintArrays.printDoubleArrayForEachColorful(bubbleSortDoubleArray(array));
        //Добавить один элемент в массив. -- >>
        PrintArrays.printDoubleArrayForEachColorful(addElementDoubleArray(5, 3.14, array));
        //Удалить один элемент из массива -- >>
        PrintArrays.printDoubleArrayForEachColorful(deleteElementDoubleArray(3, array));
        //Изменить один элемент в массиве -- >>
        PrintArrays.printDoubleArrayForEachColorful(updateElementDoubleArray(2, 7.77, array));
        //Перезаписать/заполнить все элементы массива новыми значениями -->>
        PrintArrays.printDoubleArrayForEachColorful(fillArray(array));

    }

    private static double[] fillArray(double[] array) {
        double[] newArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            newArray[i] = randomGenerate();
        }
        return newArray;
    }


    private static double[] updateElementDoubleArray(int index, double newElement, double[] array) {
        array[index] = newElement;
        return array;
    }

    private static double[] deleteElementDoubleArray(int index, double[] array) {
        double[] result = new double[array.length - 1];
        for (int i = 0; i < index; i++) {
            result[i] = array[i];
        }
        for (int i = index; i < result.length; i++) {
            result[i] = array[i + 1];
        }
        return result;
    }


    private static double[] addElementDoubleArray(int index, double newElement, double[] array) {
        double[] result = new double[array.length + 1];
        for (int i = 0; i < index; i++) {
            result[i] = array[i];
        }
        result[index] = newElement;
        for (int i = index + 1; i < result.length; i++) {
            result[i] = array[i - 1];
        }
        return result;
    }


    private static double[] createRandomDoubleArray(int length) {
        double[] input = new double[length];
        for (int i = 0; i < input.length; i++) {
            input[i] = randomGenerate();
        }
        return input;
    }

    private static double randomGenerate() {
        double element = Math.random() * 100;
        element = RoundDouble.cutDecimalPlaces(element);
        return element;
    }

    private static double[] bubbleSortDoubleArray(double[] array) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
        return array;
    }
}
