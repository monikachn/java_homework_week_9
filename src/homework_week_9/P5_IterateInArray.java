package homework_week_9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class P5_IterateInArray {
    public static void main(String[] args) {
        ArrayList<String> bankList=new ArrayList<>();
       bankList.add("Halifax ");
       bankList.add("Barclays");
       bankList.add("Santander");
       bankList.add("HSBC");
       bankList.add("NatWest");
       bankList.add("Nationwide");


        Iterator<String>name=bankList.iterator();
        while (name.hasNext()){
            System.out.println(name.next());
        }
    }
}
