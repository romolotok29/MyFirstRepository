package Lesson3;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class ArrayTask1 {
    public static void main (String[] args) {

        int [] arr1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner sc = new Scanner(System.in);
        System.out.print("Number from 1 to 10 : ");
        int forDelete = sc.nextInt();

        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == forDelete) {
                count++;
            }
        }
        System.out.println(Arrays.toString(arr1));

        int[] arrCopy = new int[arr1.length - count];

        int indexOfCopiedArray = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != forDelete) {
                arrCopy[indexOfCopiedArray] = arr1[i];
                indexOfCopiedArray++;
            }
        }
        System.out.println(Arrays.toString(arrCopy));
    }
}


