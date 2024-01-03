// Создать трёхмерный массив из целых чисел.
// С помощью цикло "пройти" по всему массиву и увеличить каждый элемент на заданное число.
// Пусть число, на которое будет увеличиваться каждый элемент, задаётся с консоли.

package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrayTask0 {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 10 : ");
        int number = sc.nextInt();

        int[][][] array = {
                {{1}, {4, 5, 6}, {7, 8, 9}},
                {{10, 11, 12}, {13, 15}, {16, 17, 18}},
                {{19, 20}, {22, 23, 24}, {25, 26, 27}}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += number;
                    System.out.print(array[i][j][k] + " ");
                }
            }
        }



    }
}
