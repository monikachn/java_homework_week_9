package homework_week_9;

import java.util.ArrayList;

public class P11_ArrayListCompare {
    public static void main(String[] args) {


    ArrayList<String> c1 = new ArrayList<String>();


    // insert items in ArrayList 1
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

    ArrayList<String> c2 = new ArrayList<String>();
    // insert items in ArrayList 2
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

    // Display both ArrayList
        System.out.println(" ArrayList1 = "+c2);
        System.out.println(" ArrayList = "+c1);

    // compare ArrayList1 with ArrayList2
        if(c1.equals(c2)==true)


        System.out.println(" Array List are equal");
    }
}