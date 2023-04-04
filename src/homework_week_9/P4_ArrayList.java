package homework_week_9;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class P4_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList<>();
        colour.add("Red");
        colour.add("Pink");
        colour.add("Green");
        colour.add("Yellow");
        colour.add("Blue");
        System.out.println(colour);
        for (String s  : colour
        ) {System.out.println(s);

        }

        }


    }







