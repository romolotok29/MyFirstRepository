package Lesson2;

import java.util.Scanner;

public class ConditionalTask5 {
    public static void main (String [] args) {

        String rainbow = "Red, Orange, Yellow, Green, Blue, Indigo, Violet";

        Scanner color = new Scanner(System.in);
        System.out.print("Type a color number (From 1 to 7) : ");
        byte num = color.nextByte();

        switch (num) {
            case 1 : rainbow = "Red";
            break;
            case 2 : rainbow = "Orange";
            break;
            case 3 : rainbow = "Yellow";
            break;
            case 4 : rainbow = "Green";
            break;
            case 5 : rainbow = "Blue";
            break;
            case 6 : rainbow = "Indigo";
            break;
            case 7 : rainbow = "Violet";
            default:
                rainbow = "Invalid number";
        }
        System.out.println(rainbow);
    }
}
