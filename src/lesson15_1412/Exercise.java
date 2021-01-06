package lesson15_1412;

public class Exercise {
    public static void main(String[] args) {
        rectangle(5, 7);
        combinationThree();
    }

    private static void combinationThree() {
        int result = 36;

        for (int z = 1; z <= result; z++) {
            for (int y = 1; y <= z; y++) {
                for (int x = 1; x <= y; x++) {
                    if (x * y * z == 36 && x<=y && y<=z) {
                        System.out.println(x + " " + z + " " + y);
                    }
                }
            }
        }
    }

    private static void rectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
