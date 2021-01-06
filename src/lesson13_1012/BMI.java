package lesson13_1012;

public class BMI {
    public static void main(String[] args) {
        double weight = 100.0;
        double height = 1.75; //в метрах
        System.out.println(findBMI(weight, height));
        System.out.println(findBMI(60, 1.65));
        double weightCustomer1 = 80;
        double heightCustomer1 = 2;
        System.out.println(findBMI(weightCustomer1, heightCustomer1));
    }



    private static double findBMI(double weight, double height) {
        return weight / (height * height);
    }
}
