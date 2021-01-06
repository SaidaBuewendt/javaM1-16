package lesson15_1412;

public class Chess {
    public static void main(String[] args) {
        chess(8);
    }

    public static void chess(int line) {
        for (int i = 0; i < line; i++) {
            System.out.println();
            for (int j = 0; j < line/2; j++) {
                System.out.print("*-");
            }

        }
    }
}
