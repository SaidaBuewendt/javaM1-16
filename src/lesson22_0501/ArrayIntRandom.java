package lesson22_0501;

import lesson21_0401.HomeWork0401;

public class ArrayIntRandom {
    public static void main(String[] args) {
        int[] array = generateIntArray();
       // HWanalys.myColorPrintIntArray(array);
       // HWanalys.myColorPrintIntArray(generateIntArray());
        randomGenerate(10);
    }

    private static int[] generateIntArray() {
        int randomLength = randomGenerate(25);
        //System.out.println(randomLength); длина массива
        int[] output = new int[randomLength];
        //Main.printArrayForEach(output); //незаполненный массив
        for (int i = 0; i < output.length; i++) { //можно также обратиться к randomLength - в данном случае одно и тоже
            output[i] = randomGenerate(25);
        }
        return output;
    }

    private static int randomGenerate(int size) {
        int myValue = (int) (Math.random() * size);
        System.out.println(myValue);
        if (myValue < 5) {
            myValue = 4;
        }
        return myValue;
    }
}