// Создайте двумерный массив целых чисел.
// Отсортируйте элементы в строках двумерного массива по возростанию.

package Lesson4;
import java.util.Arrays;
public class TwoArrayTask5 {
    public static void main (String [] args) {

        int [][] arr = new int[][] {{5, 10, 8, 2, 9}, {3, 1, 6, 4, 7}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                for (int k = 0; k < arr[i].length - j - 1; k++) {
                    if (arr[i][k] > arr[i][k + 1]) {
                        int save = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = save;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }
}
