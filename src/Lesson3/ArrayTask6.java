package Lesson3;

import java.util.Arrays;
import java.util.Random;

import static java.util.Arrays.copyOf;

public class ArrayTask6 {
    public static void main (String[] args) {

        Random random = new Random();

        String [] name = new String[]
                {"Irina", "Artiom", "Olga", "Alesja", "Evgeniy", "Ilia", "Sviatoslav", "Roland", "Pavel"};

       Arrays.sort(name);

        System.out.println(Arrays.toString(name));

        System.out.println(name[random.nextInt(name.length)]);
    }
}
