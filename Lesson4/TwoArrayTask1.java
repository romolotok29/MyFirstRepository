// Шахматная доска
// Создать программу для раскраски шахмотной доски с помощью цикла.
// Создать двумерный массив String'ов 8x8.
// С помощью циклов задать элементам циклам значения B(Black) или W(White).

package Lesson4;

import java.util.Arrays;

public class TwoArrayTask1 {
    public static void main (String [] args) {

        int [][] chessBoard = new int[8][8] ;

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
               if ((j + i) % 2 == 0) {
                   System.out.print("W ");
               }else{
                   System.out.print("B ");
               }
            }
            System.out.println(" ");
        }
    }
}
