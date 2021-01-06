package lesson16_1512;

public class MultiplyTable {
    public static void main(String[] args) {
        mpTable(10);

    }

    public static void mpTable(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                String placeInTable = formatPlaceInMPTable(i, j);
                System.out.print(placeInTable);
            }
            System.out.println();
        }
    }

    private static String formatPlaceInMPTable(int i, int j) {
        String result = "";
        int input = i * j;
        if (input < 10) {
            result = "  " + input;
        } else if (input >= 100) {
            ;
            result = "" + input;
        }else {
            result = " "+ input;
        }
        return result;

    }

}
