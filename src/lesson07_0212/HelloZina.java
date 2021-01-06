package lesson07_0212;

public class HelloZina {
    public static void main(String[] args) {
        System.out.println(salesPermission(15));
        salesPermissionTwo(40);
        System.out.println(salesPermissionThree(20));
    }

    private static String salesPermission(int age) {
        String result = "";
        if (age > 18) {
            result = "Продавать можно";
        } else {
            result = " Продавать нельзя";
        }
        return result;
    }

    public static void salesPermissionTwo(int age) {
        if (age < 16) {
            System.out.println("Еще мал!");
        } else if (age >= 16 && age < 18) {
            System.out.println("Пиво продавать можно");
        } else if (age < 21) {
            System.out.println("Кроме водки");
        } else
            System.out.println("Продавать можно все");
    }
    public static String salesPermissionThree(int age) {
        String result = "";
        if (age < 16) result = "Мал еще";
        else if (age >= 16 && age < 18) result = "Можно пиво";
        else if (age < 21) result= "Кроме водки";
        else
            System.out.println("Продавать можно все");
        return result;
    }
}