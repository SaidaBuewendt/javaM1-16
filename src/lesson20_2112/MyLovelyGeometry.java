package lesson20_2112;


public class MyLovelyGeometry {
    public static void main(String[] args) {
        firstTriangle(10);
    }

    private static void firstTriangle(int line) {
        String stroka = "";
        String star = "*";
        for (int i = 0; i < line; i++) {
            stroka = stroka + star;
            System.out.println(stroka);

        }

    }
}
