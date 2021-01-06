package lesson20_2112;

public class Excercise {
    public static void main(String[] args) {
//        Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
//        Даны 2 массива int, a и b, каждый длиной 3, верните новый массив с длиной 2, содержащего среднее
//        арифметическое элементов первоначальных массивов.
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{7, 7, 7};
        int[] a3 = new int[]{5, 2, 9};
        int[] b1 = new int[]{4, 5, 6};
        int[] b2 = new int[]{3, 8, 0};
        int[] b3 = new int[]{1, 4, 5};
        Main.printIntArrayForEach(middleWay(a1, b1)); //→ [2, 5]
        Main.printIntArrayForEach(middleWay(a2, b2)); //→ [7, 8]
        Main.printIntArrayForEach(middleWay(a3, b3));//[2, 4]

        Main.printIntArrayForEach(middleWay2(a1, b1)); //→ [2, 5]
        Main.printIntArrayForEach(middleWay2(a2, b2)); //→ [7, 8]
        Main.printIntArrayForEach(middleWay2(a3, b3));//[2, 4]


        //Given an int array length 2, return true if it does not contain a 2 or 3.
        int[] c1 = new int[]{4, 5};
        int[] c2 = new int[]{4, 2}; //→false
        int[] c3 = new int[]{3, 5};//→false

        System.out.println(no23(c1));//→true
        System.out.println(no23(c2));//→false
        System.out.println(no23(c3));//→false

    }

    private static boolean no23(int[] array) {
        if (array[0] == 2 || array[0] == 3 || array[1] == 2 || array[1] == 3) {
            return false;
        } else {
            return true;
        }
    }

    private static int[] middleWay(int[] a, int[] b) {
        int[] result = new int[2];
        //Arithmetic mean
        result[0] = arithmeticMean(a);
        result[1] = arithmeticMean(b);
        return result;
    }

    private static int arithmeticMean(int[] input) {
        int sum = 0;
        int count = input.length;
        for (int i = 0; i < input.length; i++) {
            sum = sum + input[i];
        }
        return sum / count;
    }

    private static int[] middleWay2(int[] a, int[] b) {
        int[] result = new int[2];
        result[0] = a[1];
        result[1] = b[1];
        return result;
    }
}
