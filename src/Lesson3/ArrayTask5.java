package Lesson3;

import java.util.Arrays;

public class ArrayTask5 {
    public static void main (String[] args) {

        int [] array = new int[] {25, 13, 20, 8, 5, 16, 28, 55, 87, 13};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
