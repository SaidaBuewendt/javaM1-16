package lesson23_0601;

public class HWanalys {
    public static void main(String[] args) {
        //Plz create random double array with size = 10;
        double[] array1 = new double[10];
        double[] array = createArray(10);
        //double[] testArray = new double[]{1.5, 5.6, 7.8, 1.0};
        // print(testArray);
        print(array);
        insertNewElement(array, 5, 3.14);
        double[] resultArray02 = insertNewElement(array, 5, 3.14);
        print(resultArray02);
        double[] anotherArray = insertNewElement(resultArray02, 10, 0.0);
        print(anotherArray);
        double[] resultArray03 = updateElementNewArray(array, 3, 100.23456);
        print(resultArray03);
        //изменяем старый массив
        updateElementOldArray(array, 5, 3333.3333);
        print(array);
        double[] resultArray04 = deleteElement(array, 8);
        print(resultArray04);
    }

    private static double[] deleteElement(double[] array, int index) {
        double[] result = new double[array.length - 1];
        for (int i = 0; i < index; i++) {
            result[i] = array[i];
        }
        for (int i = index; i < result.length; i++) {
            result[i] = array[i + 1];
        }
        return result;
    }

    private static void updateElementOldArray(double[] array, int index, double newElement) {
        array[index] = newElement;
    }

    private static double[] updateElementNewArray(double[] array, int index, double newElement) {
        double[] newArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = newElement;
        return newArray;
    }

    private static double[] insertNewElement(double[] array, int index, double newElement) {
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

    private static void print(double[] array) {
        System.out.print("[");
        for (double element : array) {
            System.out.print(element + ",");
        }
        System.out.println("]");
    }

    private static double[] createArray(int size) {
        double[] result = new double[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = randomDoubleNumber(100);

        }
        return result;
    }

    private static double randomDoubleNumber(int range) {
        return round(Math.random() * 100);
    }

    private static double round(double input) {
        double output = 0.0;
        int coefficient = 100;
        double temp1 = input * coefficient;
        int temp2 = (int) temp1;
        output = temp2;
        output /= 100;
        return output;
    }
}
