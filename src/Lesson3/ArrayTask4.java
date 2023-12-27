package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTask4 {
    public static void main (String [] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array (from 6 to 10) : ");

        int size = sc.nextInt();

        if (size <= 5 || size > 10) {
            System.out.print("Wrong number, please try again : ");
            int size2 = sc.nextInt();
            int[] mas = new int[size];

            for(int i = 0; i < size; i++) {
                mas[i] = random.nextInt(mas.length);
            }
            System.out.println(Arrays.toString(mas));

            int [] mas2 = new int[size];
            int evenNumbers = 0;

            for (int i = 0; i < size; i++) {
                if (mas[i] % 2 == 0) {
                    mas2[evenNumbers] = mas[i];
                    evenNumbers++;
                }
            }
            System.out.println(Arrays.toString(mas2));

        }
    }
}
