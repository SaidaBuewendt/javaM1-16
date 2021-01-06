package lesson15_1412;

public class HomeWork1412 {
    public static void main(String[] args) {
        multiplyTable(10);
        System.out.println("_______");
        combinationThree();
        System.out.println("_______");
        chess(8);
    }

    private static void chess(int line) {
        int i = 1;
        int j = 1;
        while (i <= line) {
            while (j <= line / 2) {
                if (i % 2 == 0) {
                    System.out.print("-*");
                } else {
                    System.out.print("*-");
                }
                j++;
            }
            System.out.println();
            i++;
            j = 1;

        }
    }

    private static void combinationThree() {
        int result = 36;
        int z = 0;
        int y = 0;
        int x = 0;
        while (x <= result) {
            x++;
            while (y <= result) {
                y++;
                while (z <= result) {
                    z++;
                    if (x * y * z == 36 && x <= y && y <= z) {
                        System.out.println(x + " " + y + " " + z);
                    }
                }
                z = 0;
            }
            y = 0;
        }
    }


    private static void multiplyTable(int line) {
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= line; j++) {
                int c = i * j;
                int d = String.valueOf(c).length();
                if (d == 1) {
                    System.out.print("   " + c);
                } else {
                    System.out.print("  " + c);
                }
            }
            System.out.println();
        }

    }

}

