package lesson18_1712;

import java.util.Scanner;

public class HWanalys {
    public static void main(String[] args) {
       // introduceYourself();
        introduceYourself2();
    }

    private static void introduceYourself() {
        String firstname, secondName, gender, email;
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Your age please");
        age = input.nextInt();
        System.out.println("Your firstname");
        firstname = input.next();
        System.out.println("Your second name");
        secondName = input.next();
        System.out.println("Your gender");
        gender = input.next();
        System.out.println("Your email");
        email = input.next();
    }


    private static void introduceYourself2() {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Your age");
        age = Integer.parseInt(input.next());
        System.out.println("Result " + age);

    }
}