package lesson03_2511;

public class HelloRandom {
    public static void main(String[] args) {
        int min = 30;
        int max = 100;
        int result = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(result);
        System.out.println((int) (Math.random() * (max - min + 1) + min));
        System.out.println((int) (Math.random() * (max - min + 1) + min));
        System.out.println((int) (Math.random() * (max - min + 1) + min));
        System.out.println((int) (Math.random() * (max - min + 1) + min));
        System.out.println((int) (Math.random() * (max - min + 1) + min));
        double myTestRandom =Math.random();
        System.out.println(myTestRandom);
    }
}
