package Lesson2;

import java.util.Scanner;

public class ExtraTask2 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter deposit amount : ");
        float amount = sc.nextInt();

        System.out.print("Enter a number of months : ");
        int months = sc.nextInt();
        int percent = 7;

        for (int i = 0; i <= months; i++) {
            amount = (float) percent * months;
        }
        System.out.println("The deposit amount including percents is : " + amount);




    }
}
