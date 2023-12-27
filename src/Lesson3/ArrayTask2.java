package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTask2 {
    public static void main (String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of an array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        int min = array[0];
        int max = array[0];
        int sum = 0;
        float average = 0;


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);

            min = Math.min(min, array[i]);
            max = Math.max(max, array[i]);

            sum += array[i];
            average = (float) sum / array.length;
        }

        System.out.println(Arrays.toString(array));
        System.out.println("The smallest number in array is : " + min);
        System.out.println("The biggest number in array is : " + max);
        System.out.println("The average number of elements in array is : " + average);
    }
}
