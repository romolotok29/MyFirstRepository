package Lesson3;

import java.util.Arrays;

public class ArrayTask3 {
    public static void main (String[] args) {

        int [] mas =  new int[]{2, 8, 12, 35, 68};
        int [] mas2 = new int[] {4, 15, 22, 25, 60};

        System.out.println(Arrays.toString(mas));
        System.out.println(Arrays.toString(mas2));

        int sum = 0;
        int sum2 = 0;

        float average = 0;
        float average2 = 0;

        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
            average = (float) sum / mas.length;
        }
            for (int j = 0; j < mas2.length; j++) {
                sum2 += mas2[j];
                average2 = (float) sum2 / mas2.length;
            }
            if (average > average2) {
                System.out.println("The average of the first array is bigger");
            } else if (average < average2) {
                System.out.println("The average of the second array is bigger");
            } else {
                System.out.println("The arrays average is the same");
            }




    }
}
