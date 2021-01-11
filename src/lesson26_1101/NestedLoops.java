package lesson26_1101;

public class NestedLoops {
    public static void main(String[] args) {
        rectangleDraw(5, 7);
        magicVariable ();

    }


    private static void magicVariable() {
        for (int x = 1; x <=36 ; x++) {
            for (int y = 0; y < 36; y++) {
                for (int z = 0; z < 36; z++) {
                    if (x*y*z == 36) {
                        System.out.println("Мы победили, при этом ");
                        System.out.println("x=" +x);
                        System.out.println("y=" +y);
                        System.out.println("z=" +z);
                        System.out.println();
                    }
                }
            }
        }
    }

    private static void rectangleDraw(int x, int y) {
        char symbol = '*';
        for (int j = 0; j < x; j++) {
            for (int k = 0; k < y; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

}
