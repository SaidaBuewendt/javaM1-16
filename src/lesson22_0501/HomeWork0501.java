package lesson22_0501;

import UsefulMethods.RoundDouble;
import lesson20_2112.Main;

public class HomeWork0501 {
    public static void main(String[] args) {
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_GREEN = "\u001B[32m";
        System.out.print(ANSI_PURPLE);
        //1. Plz create random double array with size = 10;
        double[] input = generateDoubleArray(10);
        System.out.print(ANSI_PURPLE);
        Main.printDoubleArrayForEach(input);
        //2. Plz insert new element on specific index into array
        System.out.print(ANSI_RED);
        Main.printDoubleArrayForEach(insertSpecificIndexElement(input, 11111.11, 3));
        //3.Plz update one element on specific index.
        System.out.print(ANSI_BLUE);
        Main.printDoubleArrayForEach(updateSpecificElement(input, 22222.22, 5));
        //4.Plz delete one element on specific index.
        System.out.print(ANSI_GREEN);
        Main.printDoubleArrayForEach(deleteElement(input, 5));

        display(input, 5);
    }

    public static double[] deleteElement(double[] input, int index) {
        double[] output = new double[input.length - 1];
        for (int i = 0; i < index; i++) {
            output[i] = input[i];
        }
        for (int i = index; i < output.length; i++) {
            output[i] = input[i + 1];
        }
        return output;
    }


    public static double[] updateSpecificElement(double[] input, double element, int index) {
        double[] output = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        output[index] = element;
        return output;
    }


    public static double[] insertSpecificIndexElement(double[] input, double element, int index) {
        double[] output = new double[input.length + 1];
        output[index] = element;
        for (int i = 0; i < index; i++) {
            output[i] = input[i];
        }
        for (int i = index; i < input.length; i++) {
            output[i + 1] = input[i];
        }
        return output;
    }

    private static double[] generateDoubleArray(int length) {
        double[] output = new double[length];
        for (int i = 0; i < output.length; i++) {
            output[i] = randomGenerate();
        }
        return output;
    }

    private static double randomGenerate() {
        double element = Math.random() * 100;
        element = RoundDouble.cutDecimalPlaces(element);
        return element;
    }

    private static void display (double[] array, int index){
        System.out.print("\u001B[34m");//blue
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + ",");
        }

        System.out.print("\u001B[31m");//red
        System.out.print(array[index] + ",");

        System.out.print("\u001B[34m");//blue
        for (int i = index + 1; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

    }

}
