package _UsefulMethods;

public class PrintArrays {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        double[] arrayDouble = new double[]{1.1, 2.2, 3.3, 4.4};
        printIntArrayForEach(array);
        printDoubleArrayForEach(arrayDouble);
        printDoubleArrayForEachColorful(arrayDouble);

    }

    public static void printIntArrayForEach(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println(array[array.length-1] + "]");
    }

    public static void printDoubleArrayForEach(double[] array) {
        for (double element : array) {
            System.out.print(element + ",");
        }
        System.out.println();
    }

    public static void printDoubleArrayForEachColorful(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 1) {
                System.out.print(Color.ANSI_RED + array[i] + "," + Color.ANSI_RESET);
            } else if (array[i] % 10 == 2) {
                System.out.print(Color.ANSI_WHITE + array[i] + "," + Color.ANSI_RESET);
            } else if (array[i] % 10 == 3) {
                System.out.print(Color.ANSI_BLUE + array[i] + "," + Color.ANSI_RESET);
            } else if (array[i] % 10 == 4) {
                System.out.print(Color.ANSI_YELLOW + array[i] + "," + Color.ANSI_RESET);
            } else if (array[i] % 10 == 5) {
                System.out.print(Color.ANSI_PURPLE + array[i] + "," + Color.ANSI_RESET);
            } else if (array[i] % 10 == 6) {
                System.out.print(Color.ANSI_CYAN + array[i] + "," + Color.ANSI_RESET);
            } else if (array[i] % 10 == 7) {
                System.out.print(Color.ANSI_BLACK + array[i] + "," + Color.ANSI_RESET);
            } else if (array[i] % 10 == 8) {
                System.out.print(Color.ANSI_GREEN + array[i] + "," + Color.ANSI_RESET);
            } else {
                System.out.println(Color.ANSI_BLACK + array[i] + "," + Color.ANSI_RESET);
            }
        }
        System.out.println();
    }
}
