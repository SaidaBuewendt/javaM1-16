package UsefulMethods;

public class PrintArrays {

    public static String[] colors = new String[]{Color.ANSI_RED, Color.ANSI_WHITE, Color.ANSI_BLUE, Color.ANSI_CYAN, Color.ANSI_GREEN, Color.ANSI_PURPLE, Color.ANSI_YELLOW};

    public static void main(String[] args) {

        int[] array2 = new int[]{1, 2, 3, 4, 5, 6};
        double[] arrayDouble = new double[]{1.1, 2.2, 3.3, 4.4};
        //printIntArrayForEach(array);
        //printDoubleArrayForEach(arrayDouble);
        printDoubleArrayForEachColorful(arrayDouble);

    }

    public static void printIntArrayForEach(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    public static void printDoubleArrayForEach(double[] array) {
        for (double element : array) {
            System.out.print(element + ",");
        }
        System.out.println();
    }

    public static void printDoubleArrayForEachColorful(double[] array) {
        System.out.print("[");
        //int count = 0;

        for (int i = 0; i < array.length; i++) {

/*            if (count == colors.length )
                count = 0;

            System.out.print(colors[count] + array[i] + ", ");
            count++;*/

            System.out.print(colors[i % colors.length] + array[i] + ", ");

/*            if (i == 0) {
                System.out.print(Color.ANSI_RED + array[i] + ", ");
            } else if (i == 1) {
                System.out.print(Color.ANSI_WHITE + array[i] + ", ");
            } else if (i == 2) {
                System.out.print(Color.ANSI_BLUE + array[i] + ", ");
            } else if (i == 3) {
                System.out.print(Color.ANSI_YELLOW + array[i] + ", ");
            } else if (i == 4) {
                System.out.print(Color.ANSI_PURPLE + array[i] + ", ");
            } else if (i == 5) {
                System.out.print(Color.ANSI_CYAN + array[i] + ", " );
            } else if (i == 6) {
                System.out.print(Color.ANSI_BLACK + array[i] + ", ");
            } else if (i == 7) {
                System.out.print(Color.ANSI_GREEN + array[i] + ", ");
            } else if (i == 8) {
                System.out.print(Color.ANSI_RED + array[i] + ", " );
            } else if (i == 9) {
                System.out.print(Color.ANSI_BLUE + array[i] +", ");
            } else {
                System.out.print(Color.ANSI_BLACK + array[i] + ", ");
            }*/

        }
        System.out.print(Color.ANSI_RESET);
        System.out.println("]");
    }
}
