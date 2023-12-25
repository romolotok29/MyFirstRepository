package Lesson2;

import java.util.Scanner;

public class ConditionalTask1 {
    public static void main (String [] args) {

        String season;

        Scanner sc = new Scanner(System.in);
        System.out.print("Type a month number (from 1 to 12): ");

        int month = sc.nextInt();

        season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Incorrect number!";
        };

        System.out.println(season);

    }

}
