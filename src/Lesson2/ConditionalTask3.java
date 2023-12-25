package Lesson2;

import java.util.Scanner;

public class ConditionalTask3 {
    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type any number : ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even!");
        } else {
            System.out.println("Number " + number + " is odd!");
        }
    }
}
