package Lesson2;

import java.util.Scanner;

public class ExtraTask3 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (from 1 to 10) : ");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number+"*"+i+"="+number*i );
        }
    }
}
