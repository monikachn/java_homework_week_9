package homework_week_9;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class P6_RetrieveAnArraylist {
    public static void main(String[] args) {

            // Create a list and add some colors to the list
            ArrayList<String> list_Strings = new ArrayList<>();
            list_Strings.add("Red");
            list_Strings.add("Green");
            list_Strings.add("Orange");
            list_Strings.add("White");
            list_Strings.add("Black");
            // Print the list
            System.out.println(list_Strings);
            // Reterive the first and third element
            String element = list_Strings.get(0);
            System.out.println("First element: "+element);
            element = list_Strings.get(2);
            System.out.println("Third element: "+element);
        }
    }

