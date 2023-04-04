package homework_week_9;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class P7_ArraylistEmpty {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        if(arrayList.isEmpty()){
            System.out.println("ArrayList is empty ");
        }
        // printing all the elements available in arrayList
        System.out.println("ArrayList =  " + arrayList);
     // use add() method to add elements in the arrayList
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        if (arrayList.isEmpty()){
            System.out.println("arrayList is empty ");
        }else {
            System.out.println("arrayList is not empty ");
        }
        //Printing all elements in arrayList
        System.out.println("ArrayList = " + arrayList );
    }
}
