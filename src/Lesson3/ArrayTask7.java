package Lesson3;

import java.util.Arrays;

public class ArrayTask7 {
    public static void main (String[] args) {

        int [] mas = new int[]{25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
        int save;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length - 1 - i; j++) {
                if (mas[j] > mas[j + 1]) {
                    save = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = save;
                }
            }
            System.out.println(Arrays.toString(mas));
        }

    }
}
