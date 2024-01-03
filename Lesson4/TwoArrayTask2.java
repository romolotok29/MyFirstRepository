// Умножение двух матриц

package Lesson4;

public class TwoArrayTask2 {
    public static void main (String [] args) {

        int [][] mas1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};

        int [][] mas2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        int [][] sumOfMatrices = new int[3][3];

        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas2.length; j++) {
                sumOfMatrices[i][j] = 0;
                for (int k = 0; k < mas2.length; k++) {
                    sumOfMatrices[i][j] = mas1[i][k] * mas2[i][k];
                }
                System.out.print(sumOfMatrices[i][j] + " ");
            }
            System.out.println();
        }
    }
}
