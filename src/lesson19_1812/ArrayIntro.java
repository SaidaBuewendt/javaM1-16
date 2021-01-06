package lesson19_1812;

import java.beans.beancontext.BeanContextServiceRevokedListener;

public class ArrayIntro {
    public static void main(String[] args) {
        introOld();
        introOne();
        arrayDeclarationAndInitialisation();
        germanCitiesExample();
        anotherExample();
    }

    private static void anotherExample() {
        String hm = "Василий";

    }

    private static void germanCitiesExample() {
        String []germanCities = new String[]{"Berlin", "München", "Dresden", "Hamburg", "Düsseldorf", "Köln"};
        int allGermanCitiesLength =0;
        int allGermanCities = germanCities.length;
        System.out.println(allGermanCities);
        for (int i = 0; i < germanCities.length; i++) {
            allGermanCitiesLength = allGermanCitiesLength+germanCities[i].length();

        }
    }

    private static void arrayDeclarationAndInitialisation() {
        //<<Имя уже объявленной переменной>> = new <<Тип данны>><<Длина Массива>>
        int [] justExample = new int[10]; //резервируем 10 членнов массива
        int []justExampleTwo;
        justExampleTwo=new int [1001];
        int [] field = new int[]{10,15,3,7,4,9,8};
        int []numberFibonacci = new int[]{0,1,1,2,3,5,8,13,21,34,55};
        String []germanCities = new String[]{"Berlin", "München", "Dresden", "Hamburg", "Düsseldorf"};
    }

    private static void introOne() {
        int myArray[]; //устаревший тип записи
        String user[];
        double gpsPoints[];
        boolean truthTable[];
        char cyrillicAlphabet[];
    }

    private static void introOld() {
        int[] myArray; // массив INTов
        String[] user;
        double[] gpsPoints;
        boolean[] truthTable;
        char[] cyrillicAlphabet;
    }
}
