package lesson17_1612;

import java.util.Scanner;

public class Election {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantity;
        System.out.println("Print quantity of voices:");
        quantity = input.nextInt();
        if (quantity > 50) {
            System.out.println("You are the President");
        }else
        {
            System.out.println("You lost :(");
        }
    }
}

