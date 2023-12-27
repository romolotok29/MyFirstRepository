package Lesson3;


import java.util.Scanner;

public class ArrayTask0 {
    public static void main (String[] args) {

        int [] mas = new int[]{25, 47, 34, 18, 96, 33, 28, 55, 87, 13};

        Scanner sc = new Scanner(System.in);
        System.out.print("What number would you like to find in array? : ");
        boolean found = false;

        int number = sc.nextInt();


        for (int i = 0; i < mas.length; i++) {
            if (number == mas[i]) {
                found = true;
                System.out.println("Number is found!");
            }
        }
        if (!found) {
            System.out.println("Number not found!");
        }
    }
}
