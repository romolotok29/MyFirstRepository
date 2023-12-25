package Lesson2;

import java.util.Scanner;

public class CycleTask3 {
    public static void main (String [] args) {

        Scanner math = new Scanner(System.in);

        System.out.print("Enter any positive number : ");
        int positive = math.nextInt();
        int sum = 0;

       for (int i = 1; i <= positive; i++) {
           sum = sum + i;
       }
        System.out.println(sum);

    }
}
