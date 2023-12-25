package Lesson2;

import java.util.Scanner;

public class ConditionalTask4 {
    public  static void main (String [] args) {

        Scanner weather = new Scanner(System.in);
        System.out.print("What is the temperature outside? : ");

        int t = weather.nextInt();

        if (t > -5) {
            System.out.println("Warm!");
        } else if (t <= -5 && t >= -20 ) {
            System.out.println("Fine");
        } else if (t <= -20) {
            System.out.println("Cold!");
        }
    }
}
